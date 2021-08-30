package io.TrayectoriasLaborales.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Encabezado {
  @SerializedName("claveEmpresaConsulta")
  private String claveEmpresaConsulta = null;
  @SerializedName("folioConsultaEmpleador")
  private String folioConsultaEmpleador = null;
  @SerializedName("expedienteEncontrado")
  private Integer expedienteEncontrado = null;
  @SerializedName("folioConsulta")
  private String folioConsulta = null;
  @SerializedName("fechaEmision")
  private String fechaEmision = null;

  public Encabezado claveEmpresaConsulta(String claveEmpresaConsulta) {
    this.claveEmpresaConsulta = claveEmpresaConsulta;
    return this;
  }

  public String getClaveEmpresaConsulta() {
    return claveEmpresaConsulta;
  }

  public void setClaveEmpresaConsulta(String claveEmpresaConsulta) {
    this.claveEmpresaConsulta = claveEmpresaConsulta;
  }

  public Encabezado folioConsultaEmpleador(String folioConsultaEmpleador) {
    this.folioConsultaEmpleador = folioConsultaEmpleador;
    return this;
  }

  public String getFolioConsultaEmpleador() {
    return folioConsultaEmpleador;
  }

  public void setFolioConsultaEmpleador(String folioConsultaEmpleador) {
    this.folioConsultaEmpleador = folioConsultaEmpleador;
  }

  public Encabezado expedienteEncontrado(Integer expedienteEncontrado) {
    this.expedienteEncontrado = expedienteEncontrado;
    return this;
  }

  public Integer getExpedienteEncontrado() {
    return expedienteEncontrado;
  }

  public void setExpedienteEncontrado(Integer expedienteEncontrado) {
    this.expedienteEncontrado = expedienteEncontrado;
  }

  public Encabezado folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }

  public String getFolioConsulta() {
    return folioConsulta;
  }

  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }

  public Encabezado fechaEmision(String fechaEmision) {
    this.fechaEmision = fechaEmision;
    return this;
  }

  public String getFechaEmision() {
    return fechaEmision;
  }

  public void setFechaEmision(String fechaEmision) {
    this.fechaEmision = fechaEmision;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Encabezado encabezado = (Encabezado) o;
    return Objects.equals(this.claveEmpresaConsulta, encabezado.claveEmpresaConsulta)
        && Objects.equals(this.folioConsultaEmpleador, encabezado.folioConsultaEmpleador)
        && Objects.equals(this.expedienteEncontrado, encabezado.expedienteEncontrado)
        && Objects.equals(this.folioConsulta, encabezado.folioConsulta)
        && Objects.equals(this.fechaEmision, encabezado.fechaEmision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claveEmpresaConsulta, folioConsultaEmpleador, expedienteEncontrado, folioConsulta,
        fechaEmision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Encabezado {\n");

    sb.append("    claveEmpresaConsulta: ").append(toIndentedString(claveEmpresaConsulta)).append("\n");
    sb.append("    folioConsultaEmpleador: ").append(toIndentedString(folioConsultaEmpleador)).append("\n");
    sb.append("    expedienteEncontrado: ").append(toIndentedString(expedienteEncontrado)).append("\n");
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("    fechaEmision: ").append(toIndentedString(fechaEmision)).append("\n");
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
