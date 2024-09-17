package aapr.consultorio.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Diagnóstico_doctor")
public class Doctor{

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_diagnóstico")
private Long id;

@Column(name="diagnóstico", length=600, nullable=false, unique=false)
private String diagnostico;

@Column(name="medicamentos", length=600, nullable=false, unique=false)
private String medicamentos;

@Column(name="dieta", length=600, nullable=false, unique=false)
private String dieta;

@Column(name="incapacidad", length=600, nullable=false, unique=false)
private String incapacidad;

public Doctor() {
	
}

public Doctor(Long id, String diagnostico, String medicamentos, String dieta, String incapacidad) {
	super();
	this.id = id;
	this.diagnostico = diagnostico;
	this.medicamentos = medicamentos;
	this.dieta = dieta;
	this.incapacidad = incapacidad;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getDiagnostico() {
	return diagnostico;
}

public void setDiagnostico(String diagnostico) {
	this.diagnostico = diagnostico;
}

public String getMedicamentos() {
	return medicamentos;
}

public void setMedicamentos(String medicamentos) {
	this.medicamentos = medicamentos;
}

public String getDieta() {
	return dieta;
}

public void setDieta(String dieta) {
	this.dieta = dieta;
}

public String getIncapacidad() {
	return incapacidad;
}

public void setIncapacidad(String incapacidad) {
	this.incapacidad = incapacidad;
}

@Override
public String toString() {
	return "Doctor [id=" + id + ", diagnostico=" + diagnostico + ", medicamentos=" + medicamentos + ", dieta=" + dieta
			+ ", incapacidad=" + incapacidad + "]";
}

@Override
public int hashCode() {
	return Objects.hash(diagnostico, dieta, id, incapacidad, medicamentos);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Doctor other = (Doctor) obj;
	return Objects.equals(diagnostico, other.diagnostico) && Objects.equals(dieta, other.dieta)
			&& Objects.equals(id, other.id) && Objects.equals(incapacidad, other.incapacidad)
			&& Objects.equals(medicamentos, other.medicamentos);
}


}
