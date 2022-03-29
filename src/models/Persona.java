package models;

import java.util.Date;

public class Persona {
	
	//Atributos
	public String nombre;
	public String apellido;
	public String documento;
	public Integer edad;
	public String ocupacion;
	public Date fechaNacimiento;
	
	//Constructor
	public Persona(String nombre, String apellido, String documento, Integer edad, String ocupacion,
			Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = edad;
		this.ocupacion = ocupacion;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Metodo ToString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad
				+ ", ocupacion=" + ocupacion + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}
