package in.bushansirgur.springrestapi.model;

public class MetodosPago {
	private int id;
	 private String nombre;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return nombre;
	}
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	public MetodosPago(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	public MetodosPago(String nombre) {
		this.nombre = nombre;
	}
	public MetodosPago() {
	}
	@Override
	public String toString() {
		return "MetodosPago("+"id="+id+", nombre="+nombre+")";
	}
}
