package in.bushansirgur.springrestapi.model;

import java.util.Set;

public class Departamentos {
	private int id;
	private String nombre;
	
	private Set<Ciudades> ciudad;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Set<Ciudades> getCities() {
		return ciudad;
	}
	public void setCities(Set<Ciudades> ciudad) {
		this.ciudad = ciudad;
	}
	public Departamentos(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + nombre + "]";
	}
}
