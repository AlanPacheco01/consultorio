package aapr.consultorio.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Datos_Consultorio")
public class Consultorio {

	// Datos del paciente
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Paciente")
	private Long id;
	
	@Column(name="Paciente", length=120, nullable=false,unique=false)
	private String nombrePaciente;
	
	@Column(name="Edad", length=3, nullable=false,unique=false)
	private Byte edad;
	
	@Column(name="Dirección_Paciente", length=200, nullable=false,unique=false)
	private String direccionPaciente;
	
	@Column(name="Teléfono_Paciente", length=15, nullable=false,unique=true)
	private Long telefono;
	
	@Column(name="Correo_Paciente", length=120, nullable=false,unique=true)
	private String correoPaciente;
	
	@Column(name="CURP_Paciente", length=120, nullable=false,unique=true)
	private String curp;
	
	@Column(name="Núm_SS_Paciente", length=120, nullable=false,unique=true)
	private Long numeroSeguroSocial;
	
	@Column(name="Alergias_Paciente", length=400, nullable=false,unique=false)
	private String alergias;
	
	@Column(name="Tipo_Sangre_Paciente", length=120, nullable=false,unique=false)
	private String tipoSangre;
	
	@Column(name="Engermedades_Previas_Paciente", length=120, nullable=false,unique=false)
	private String enfermedades;
	
	@Column(name="Medicamentos_Previos_Paciente", length=120, nullable=false,unique=false)
	private String medicamentos;
	
	@Column(name="Motivo_Consulta", length=120, nullable=false,unique=false)
	private String motivoConsulta;

	// Contacto de emergencia
	@Column(name="Contacto_Emergencia_Paciente", length=120, nullable=false,unique=false)
	private String contactoEmergencia;
	
	@Column(name="Teléfono_Emergencia_Paciente", length=120, nullable=false,unique=true)
	private Long telefonoEmergencia;
	
	@Column(name="Parentesco_Contacto", length=120, nullable=false,unique=false)
	private String parentesco;
	
	@Column(name="Dirección_Contacto", length=120, nullable=false,unique=false)
	private String direccion;

	// información del consultorio
	@Column(name="Nombre_Doctor", length=120, nullable=false,unique=false)
	private String nombreDoctor;
	
	@Column(name="Hora_Cita", length=120, nullable=false,unique=true)
	private Long horaCita;

//Se genera un constructor vacío para la sobrecarga de métodos
	public Consultorio() {

	}

//Con la información anterior se genera el constructor
	public Consultorio(Long id, String nombrePaciente, Byte edad, String direccionPaciente, Long telefono,
			String correoPaciente, String curp, Long numeroSeguroSocial, String alergias, String tipoSangre,
			String enfermedades, String medicamentos, String motivoConsulta, String contactoEmergencia,
			Long telefonoEmergencia, String parentesco, String direccion, String nombreDoctor, Long horaCita) {
		super();
		this.id = id;
		this.nombrePaciente = nombrePaciente;
		this.edad = edad;
		this.direccionPaciente = direccionPaciente;
		this.telefono = telefono;
		this.correoPaciente = correoPaciente;
		this.curp = curp;
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.alergias = alergias;
		this.tipoSangre = tipoSangre;
		this.enfermedades = enfermedades;
		this.medicamentos = medicamentos;
		this.motivoConsulta = motivoConsulta;
		this.contactoEmergencia = contactoEmergencia;
		this.telefonoEmergencia = telefonoEmergencia;
		this.parentesco = parentesco;
		this.direccion = direccion;
		this.nombreDoctor = nombreDoctor;
		this.horaCita = horaCita;
	}

//Se generan los getters y setter
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public Byte getEdad() {
		return edad;
	}

	public void setEdad(Byte edad) {
		this.edad = edad;
	}

	public String getDireccionPaciente() {
		return direccionPaciente;
	}

	public void setDireccionPaciente(String direccionPaciente) {
		this.direccionPaciente = direccionPaciente;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getCorreoPaciente() {
		return correoPaciente;
	}

	public void setCorreoPaciente(String correoPaciente) {
		this.correoPaciente = correoPaciente;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public Long getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}

	public void setNumeroSeguroSocial(Long numeroSeguroSocial) {
		this.numeroSeguroSocial = numeroSeguroSocial;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public String getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(String enfermedades) {
		this.enfermedades = enfermedades;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	public String getMotivoConsulta() {
		return motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}

	public String getContactoEmergencia() {
		return contactoEmergencia;
	}

	public void setContactoEmergencia(String contactoEmergencia) {
		this.contactoEmergencia = contactoEmergencia;
	}

	public Long getTelefonoEmergencia() {
		return telefonoEmergencia;
	}

	public void setTelefonoEmergencia(Long telefonoEmergencia) {
		this.telefonoEmergencia = telefonoEmergencia;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombreDoctor() {
		return nombreDoctor;
	}

	public void setNombreDoctor(String nombreDoctor) {
		this.nombreDoctor = nombreDoctor;
	}

	public Long getHoraCita() {
		return horaCita;
	}

	public void setHoraCita(Long horaCita) {
		this.horaCita = horaCita;
	}

//Se genera el método toString para facilitar la lectura de los datos

	@Override
	public String toString() {
		return "Consultorio [id=" + id + ", nombrePaciente=" + nombrePaciente + ", edad=" + edad
				+ ", direccionPaciente=" + direccionPaciente + ", telefono=" + telefono + ", correoPaciente="
				+ correoPaciente + ", curp=" + curp + ", numeroSeguroSocial=" + numeroSeguroSocial + ", alergias="
				+ alergias + ", tipoSangre=" + tipoSangre + ", enfermedades=" + enfermedades + ", medicamentos="
				+ medicamentos + ", motivoConsulta=" + motivoConsulta + ", contactoEmergencia=" + contactoEmergencia
				+ ", telefonoEmergencia=" + telefonoEmergencia + ", parentesco=" + parentesco + ", direccion="
				+ direccion + ", nombreDoctor=" + nombreDoctor + ", horaCita=" + horaCita + "]";
	}

//Se genera el hascode y los equals
	@Override
	public int hashCode() {
		return Objects.hash(alergias, contactoEmergencia, correoPaciente, curp, direccion, direccionPaciente, edad,
				enfermedades, horaCita, id, medicamentos, motivoConsulta, nombreDoctor, nombrePaciente,
				numeroSeguroSocial, parentesco, telefono, telefonoEmergencia, tipoSangre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consultorio other = (Consultorio) obj;
		return Objects.equals(alergias, other.alergias) && Objects.equals(contactoEmergencia, other.contactoEmergencia)
				&& Objects.equals(correoPaciente, other.correoPaciente) && Objects.equals(curp, other.curp)
				&& Objects.equals(direccion, other.direccion)
				&& Objects.equals(direccionPaciente, other.direccionPaciente) && Objects.equals(edad, other.edad)
				&& Objects.equals(enfermedades, other.enfermedades) && Objects.equals(horaCita, other.horaCita)
				&& Objects.equals(id, other.id) && Objects.equals(medicamentos, other.medicamentos)
				&& Objects.equals(motivoConsulta, other.motivoConsulta)
				&& Objects.equals(nombreDoctor, other.nombreDoctor)
				&& Objects.equals(nombrePaciente, other.nombrePaciente)
				&& Objects.equals(numeroSeguroSocial, other.numeroSeguroSocial)
				&& Objects.equals(parentesco, other.parentesco) && Objects.equals(telefono, other.telefono)
				&& Objects.equals(telefonoEmergencia, other.telefonoEmergencia)
				&& Objects.equals(tipoSangre, other.tipoSangre);
	}
}
