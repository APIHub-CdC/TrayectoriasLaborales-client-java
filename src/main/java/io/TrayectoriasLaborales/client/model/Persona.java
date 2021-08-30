package io.TrayectoriasLaborales.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Persona {
  @SerializedName("nombre")
  private String nombre = null;
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("apellidoAdicional")
  private String apellidoAdicional = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("RFC")
  private String RFC = null;
  @SerializedName("CURP")
  private String CURP = null;
  @SerializedName("NSS")
  private String NSS = null;
  @SerializedName("entidadAfiliadora")
  private CatalogoEntidadAfiliadora entidadAfiliadora = null;
  @SerializedName("nacionalidad")
  private CatalogoNacionalidad nacionalidad = null;
  @SerializedName("estadoCivil")
  private CatalogoEstadoCivil estadoCivil = null;
  @SerializedName("sexo")
  private CatalogoSexoPersona sexo = null;
  @SerializedName("residencia")
  private CatalogoResidencia residencia = null;

  public Persona nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Persona apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public Persona apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public Persona apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }

  public String getApellidoAdicional() {
    return apellidoAdicional;
  }

  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }

  public Persona fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Persona RFC(String RFC) {
    this.RFC = RFC;
    return this;
  }

  public String getRFC() {
    return RFC;
  }

  public void setRFC(String RFC) {
    this.RFC = RFC;
  }

  public Persona CURP(String CURP) {
    this.CURP = CURP;
    return this;
  }

  public String getCURP() {
    return CURP;
  }

  public void setCURP(String CURP) {
    this.CURP = CURP;
  }

  public Persona NSS(String NSS) {
    this.NSS = NSS;
    return this;
  }

  public String getNSS() {
    return NSS;
  }

  public void setNSS(String NSS) {
    this.NSS = NSS;
  }

  public Persona entidadAfiliadora(CatalogoEntidadAfiliadora entidadAfiliadora) {
    this.entidadAfiliadora = entidadAfiliadora;
    return this;
  }

  public CatalogoEntidadAfiliadora getEntidadAfiliadora() {
    return entidadAfiliadora;
  }

  public void setEntidadAfiliadora(CatalogoEntidadAfiliadora entidadAfiliadora) {
    this.entidadAfiliadora = entidadAfiliadora;
  }

  public Persona nacionalidad(CatalogoNacionalidad nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }

  public CatalogoNacionalidad getNacionalidad() {
    return nacionalidad;
  }

  public void setNacionalidad(CatalogoNacionalidad nacionalidad) {
    this.nacionalidad = nacionalidad;
  }

  public Persona estadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }

  public CatalogoEstadoCivil getEstadoCivil() {
    return estadoCivil;
  }

  public void setEstadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public Persona sexo(CatalogoSexoPersona sexo) {
    this.sexo = sexo;
    return this;
  }

  public CatalogoSexoPersona getSexo() {
    return sexo;
  }

  public void setSexo(CatalogoSexoPersona sexo) {
    this.sexo = sexo;
  }

  public Persona residencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
    return this;
  }

  public CatalogoResidencia getResidencia() {
    return residencia;
  }

  public void setResidencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(this.nombre, persona.nombre) && Objects.equals(this.apellidoPaterno, persona.apellidoPaterno)
        && Objects.equals(this.apellidoMaterno, persona.apellidoMaterno)
        && Objects.equals(this.apellidoAdicional, persona.apellidoAdicional)
        && Objects.equals(this.fechaNacimiento, persona.fechaNacimiento) && Objects.equals(this.RFC, persona.RFC)
        && Objects.equals(this.CURP, persona.CURP) && Objects.equals(this.NSS, persona.NSS)
        && Objects.equals(this.entidadAfiliadora, persona.entidadAfiliadora)
        && Objects.equals(this.nacionalidad, persona.nacionalidad)
        && Objects.equals(this.estadoCivil, persona.estadoCivil) && Objects.equals(this.sexo, persona.sexo)
        && Objects.equals(this.residencia, persona.residencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, apellidoPaterno, apellidoMaterno, apellidoAdicional, fechaNacimiento, RFC, CURP, NSS,
        entidadAfiliadora, nacionalidad, estadoCivil, sexo, residencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");

    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    CURP: ").append(toIndentedString(CURP)).append("\n");
    sb.append("    NSS: ").append(toIndentedString(NSS)).append("\n");
    sb.append("    entidadAfiliadora: ").append(toIndentedString(entidadAfiliadora)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
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
