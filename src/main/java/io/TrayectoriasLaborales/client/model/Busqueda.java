package io.TrayectoriasLaborales.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Busqueda {
  @SerializedName("claveEmpresaConsulta")
  private String claveEmpresaConsulta = null;
  @SerializedName("folioConsultaEmpleador")
  private String folioConsultaEmpleador = null;
  @SerializedName("puestoSolicitado")
  private String puestoSolicitado = null;
  @SerializedName("persona")
  private PersonaConsulta persona = null;
  @SerializedName("domicilio")
  private DomicilioConsulta domicilio = null;

  public Busqueda claveEmpresaConsulta(String claveEmpresaConsulta) {
    this.claveEmpresaConsulta = claveEmpresaConsulta;
    return this;
  }

  public String getClaveEmpresaConsulta() {
    return claveEmpresaConsulta;
  }

  public void setClaveEmpresaConsulta(String claveEmpresaConsulta) {
    this.claveEmpresaConsulta = claveEmpresaConsulta;
  }

  public Busqueda folioConsultaEmpleador(String folioConsultaEmpleador) {
    this.folioConsultaEmpleador = folioConsultaEmpleador;
    return this;
  }

  public String getFolioConsultaEmpleador() {
    return folioConsultaEmpleador;
  }

  public void setFolioConsultaEmpleador(String folioConsultaEmpleador) {
    this.folioConsultaEmpleador = folioConsultaEmpleador;
  }

  public Busqueda puestoSolicitado(String puestoSolicitado) {
    this.puestoSolicitado = puestoSolicitado;
    return this;
  }

  public String getPuestoSolicitado() {
    return puestoSolicitado;
  }

  public void setPuestoSolicitado(String puestoSolicitado) {
    this.puestoSolicitado = puestoSolicitado;
  }

  public Busqueda persona(PersonaConsulta persona) {
    this.persona = persona;
    return this;
  }

  public PersonaConsulta getPersona() {
    return persona;
  }

  public void setPersona(PersonaConsulta persona) {
    this.persona = persona;
  }

  public Busqueda domicilio(DomicilioConsulta domicilio) {
    this.domicilio = domicilio;
    return this;
  }

  public DomicilioConsulta getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(DomicilioConsulta domicilio) {
    this.domicilio = domicilio;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Busqueda busqueda = (Busqueda) o;
    return Objects.equals(this.claveEmpresaConsulta, busqueda.claveEmpresaConsulta)
        && Objects.equals(this.folioConsultaEmpleador, busqueda.folioConsultaEmpleador)
        && Objects.equals(this.puestoSolicitado, busqueda.puestoSolicitado)
        && Objects.equals(this.persona, busqueda.persona) && Objects.equals(this.domicilio, busqueda.domicilio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claveEmpresaConsulta, folioConsultaEmpleador, puestoSolicitado, persona, domicilio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Busqueda {\n");

    sb.append("    claveEmpresaConsulta: ").append(toIndentedString(claveEmpresaConsulta)).append("\n");
    sb.append("    folioConsultaEmpleador: ").append(toIndentedString(folioConsultaEmpleador)).append("\n");
    sb.append("    puestoSolicitado: ").append(toIndentedString(puestoSolicitado)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
