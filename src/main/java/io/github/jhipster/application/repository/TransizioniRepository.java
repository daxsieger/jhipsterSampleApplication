package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.Transizioni;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Transizioni entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TransizioniRepository
  extends JpaRepository<Transizioni, Long> {}
