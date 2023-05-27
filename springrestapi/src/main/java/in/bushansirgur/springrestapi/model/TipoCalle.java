package in.bushansirgur.springrestapi.model;

public class TipoCalle {
	private int id;
	private String nombre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoCalle(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	public TipoCalle(String nombre) {
		this.nombre = nombre;
	}
	public TipoCalle() {
	
	}
	@Override
	public String toString() {
		return "TipoCalle [id=" + id + ", nombre=" + nombre + "]";
	}
}
