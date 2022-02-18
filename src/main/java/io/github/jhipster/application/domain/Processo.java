package io.github.jhipster.application.domain;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Processo.
 */
@Entity
@Table(name = "processo")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Processo implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "id_processo")
  private Long idProcesso;

  @Column(name = "ds_processo")
  private String dsProcesso;

  // jhipster-needle-entity-add-field - JHipster will add fields here

  public Long getId() {
    return this.id;
  }

  public Processo id(Long id) {
    this.setId(id);
    return this;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getIdProcesso() {
    return this.idProcesso;
  }

  public Processo idProcesso(Long idProcesso) {
    this.setIdProcesso(idProcesso);
    return this;
  }

  public void setIdProcesso(Long idProcesso) {
    this.idProcesso = idProcesso;
  }

  public String getDsProcesso() {
    return this.dsProcesso;
  }

  public Processo dsProcesso(String dsProcesso) {
    this.setDsProcesso(dsProcesso);
    return this;
  }

  public void setDsProcesso(String dsProcesso) {
    this.dsProcesso = dsProcesso;
  }

  // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Processo)) {
      return false;
    }
    return id != null && id.equals(((Processo) o).id);
  }

  @Override
  public int hashCode() {
    // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
    return getClass().hashCode();
  }

  // prettier-ignore
    @Override
    public String toString() {
        return "Processo{" +
            "id=" + getId() +
            ", idProcesso=" + getIdProcesso() +
            ", dsProcesso='" + getDsProcesso() + "'" +
            "}";
    }
}