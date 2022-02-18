package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.Produttore;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Produttore entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProduttoreRepository extends JpaRepository<Produttore, Long> {}
