package io.TrayectoriasLaborales.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Respuesta {
  @SerializedName("encabezado")
  private Encabezado encabezado = null;
  @SerializedName("persona")
  private Persona persona = null;
  @SerializedName("empleos")
  private List<Empleo> empleos = null;
  @SerializedName("consultas")
  private List<Consulta> consultas = null;

  public Respuesta encabezado(Encabezado encabezado) {
    this.encabezado = encabezado;
    return this;
  }

  public Encabezado getEncabezado() {
    return encabezado;
  }

  public void setEncabezado(Encabezado encabezado) {
    this.encabezado = encabezado;
  }

  public Respuesta persona(Persona persona) {
    this.persona = persona;
    return this;
  }

  public Persona getPersona() {
    return persona;
  }

  public void setPersona(Persona persona) {
    this.persona = persona;
  }

  public Respuesta empleos(List<Empleo> empleos) {
    this.empleos = empleos;
    return this;
  }

  public Respuesta addEmpleosItem(Empleo empleosItem) {
    if (this.empleos == null) {
      this.empleos = new ArrayList<Empleo>();
    }
    this.empleos.add(empleosItem);
    return this;
  }

  public List<Empleo> getEmpleos() {
    return empleos;
  }

  public void setEmpleos(List<Empleo> empleos) {
    this.empleos = empleos;
  }

  public Respuesta consultas(List<Consulta> consultas) {
    this.consultas = consultas;
    return this;
  }

  public Respuesta addConsultasItem(Consulta consultasItem) {
    if (this.consultas == null) {
      this.consultas = new ArrayList<Consulta>();
    }
    this.consultas.add(consultasItem);
    return this;
  }

  public List<Consulta> getConsultas() {
    return consultas;
  }

  public void setConsultas(List<Consulta> consultas) {
    this.consultas = consultas;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.encabezado, respuesta.encabezado) && Objects.equals(this.persona, respuesta.persona)
        && Objects.equals(this.empleos, respuesta.empleos) && Objects.equals(this.consultas, respuesta.consultas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encabezado, persona, empleos, consultas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");

    sb.append("    encabezado: ").append(toIndentedString(encabezado)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    empleos: ").append(toIndentedString(empleos)).append("\n");
    sb.append("    consultas: ").append(toIndentedString(consultas)).append("\n");
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
