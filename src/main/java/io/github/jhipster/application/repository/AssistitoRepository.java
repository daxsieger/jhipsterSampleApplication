package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.Assistito;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Assistito entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AssistitoRepository extends JpaRepository<Assistito, Long> {}
