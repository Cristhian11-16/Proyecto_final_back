package in.bushansirgur.springrestapi.model;

public class Ciudades {
	private int id;
	private String nombre;
	private Departamentos departamento;
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
	public Departamentos getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}
	
	public Ciudades(int id, String nombre, Departamentos departamento) {
		this.id = id;
		this.nombre = nombre;
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Productos ("+"id:"+id+"nombre:"+nombre+"departamento:"+departamento+")";
	}
}
