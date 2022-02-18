package io.github.jhipster.application.domain;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.jhipster.application.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class ProcessoTest {

  @Test
  void equalsVerifier() throws Exception {
    TestUtil.equalsVerifier(Processo.class);
    Processo processo1 = new Processo();
    processo1.setId(1L);
    Processo processo2 = new Processo();
    processo2.setId(processo1.getId());
    assertThat(processo1).isEqualTo(processo2);
    processo2.setId(2L);
    assertThat(processo1).isNotEqualTo(processo2);
    processo1.setId(null);
    assertThat(processo1).isNotEqualTo(processo2);
  }
}
