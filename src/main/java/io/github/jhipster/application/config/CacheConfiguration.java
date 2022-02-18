package io.github.jhipster.application.config;

import io.github.jhipster.config.JHipsterProperties;
import java.util.concurrent.TimeUnit;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.expiry.Duration;
import org.ehcache.expiry.Expirations;
import org.ehcache.jsr107.Eh107Configuration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;

@Configuration
@EnableCaching
@AutoConfigureAfter(value = { MetricsConfiguration.class })
@AutoConfigureBefore(
  value = { WebConfigurer.class, DatabaseConfiguration.class }
)
public class CacheConfiguration {

  private final javax.cache.configuration.Configuration<Object, Object> jcacheConfiguration;

  public CacheConfiguration(JHipsterProperties jHipsterProperties) {
    JHipsterProperties.Cache.Ehcache ehcache = jHipsterProperties
      .getCache()
      .getEhcache();

    jcacheConfiguration =
      Eh107Configuration.fromEhcacheCacheConfiguration(
        CacheConfigurationBuilder
          .newCacheConfigurationBuilder(
            Object.class,
            Object.class,
            ResourcePoolsBuilder.heap(ehcache.getMaxEntries())
          )
          .withExpiry(
            Expirations.timeToLiveExpiration(
              Duration.of(ehcache.getTimeToLiveSeconds(), TimeUnit.SECONDS)
            )
          )
          .build()
      );
  }

  @Bean
  public JCacheManagerCustomizer cacheManagerCustomizer() {
    return cm -> {
      cm.createCache(
        io.github.jhipster.application.repository.UserRepository.USERS_BY_LOGIN_CACHE,
        jcacheConfiguration
      );
      cm.createCache(
        io.github.jhipster.application.repository.UserRepository.USERS_BY_EMAIL_CACHE,
        jcacheConfiguration
      );
      cm.createCache(
        io.github.jhipster.application.domain.User.class.getName(),
        jcacheConfiguration
      );
      cm.createCache(
        io.github.jhipster.application.domain.Authority.class.getName(),
        jcacheConfiguration
      );
      cm.createCache(
        io.github.jhipster.application.domain.User.class.getName() +
        ".authorities",
        jcacheConfiguration
      );
      createCache(
        cm,
        io.github.jhipster.application.domain.Evento.class.getName()
      );
      createCache(
        cm,
        io.github.jhipster.application.domain.Evento.class.getName() + ".statis"
      );
      createCache(
        cm,
        io.github.jhipster.application.domain.Assistito.class.getName()
      );
      createCache(
        cm,
        io.github.jhipster.application.domain.Gestore.class.getName()
      );
      createCache(
        cm,
        io.github.jhipster.application.domain.TipoEvento.class.getName()
      );
      createCache(
        cm,
        io.github.jhipster.application.domain.Produttore.class.getName()
      );
      createCache(
        cm,
        io.github.jhipster.application.domain.Stato.class.getName()
      );
      createCache(
        cm,
        io.github.jhipster.application.domain.Stato.class.getName() + ".eventis"
      );
      createCache(
        cm,
        io.github.jhipster.application.domain.Stadio.class.getName()
      );
      createCache(
        cm,
        io.github.jhipster.application.domain.Processo.class.getName()
      );
      createCache(
        cm,
        io.github.jhipster.application.domain.Transizioni.class.getName()
      );
      // jhipster-needle-ehcache-add-entry
    };
  }
}
