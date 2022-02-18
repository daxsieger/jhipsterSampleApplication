package io.github.jhipster.application.domain;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.jhipster.application.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class ProduttoreTest {

  @Test
  void equalsVerifier() throws Exception {
    TestUtil.equalsVerifier(Produttore.class);
    Produttore produttore1 = new Produttore();
    produttore1.setId(1L);
    Produttore produttore2 = new Produttore();
    produttore2.setId(produttore1.getId());
    assertThat(produttore1).isEqualTo(produttore2);
    produttore2.setId(2L);
    assertThat(produttore1).isNotEqualTo(produttore2);
    produttore1.setId(null);
    assertThat(produttore1).isNotEqualTo(produttore2);
  }
}
