package in.bushansirgur.springrestapi.model;

import java.util.Set;

public class Productos {
	
	private PersonaNatural usuario;
	private int id;
	private String nombre;
	private String descripcion;
	private EstadoProducto estadoProducto;
	private Double precio;
	private String foto;
	private int cantidad;
	private Categoria categoria;
	private EstadoPublicacion estadoPublicacion;
	private Set<Comentarios> comentario;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PersonaNatural getUsuario() {
		return usuario;
	}
	public void setUsuario(PersonaNatural usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public EstadoProducto getEstadoProducto() {
		return estadoProducto;
	}
	public void setEstadoProducto(EstadoProducto estadoProducto) {
		this.estadoProducto = estadoProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public EstadoPublicacion getEstadoPublicacion() {
		return estadoPublicacion;
	}
	public void setEstadoPublicacion(EstadoPublicacion estadoPublicacion) {
		this.estadoPublicacion = estadoPublicacion;
	}
	public Set<Comentarios> getComentario() {
		return comentario;
	}
	public void setComentarios(Set<Comentarios> comentario) {
		this.comentario = comentario;
	}
	public Productos(EstadoPublicacion estadoPublicacion, Categoria categoria, PersonaNatural usuario,int id, String nombre, String descripcion, EstadoProducto estadoProducto,Double precio,String foto,int cantidad, Set<Comentarios> comentario ) {
		super();
		this.usuario = usuario;
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estadoProducto = estadoProducto;
		this.precio = precio;
		this.foto = foto;
		this.cantidad = cantidad;
		this.categoria = categoria;
		this.estadoPublicacion = estadoPublicacion;
		this.comentario = comentario;
	}
	public Productos(EstadoPublicacion estadoPublicacion, Categoria categoria, String nombre, String descripcion, EstadoProducto estadoProducto,Double precio,String foto,int cantidad, Set<Comentarios> comentario ) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estadoProducto = estadoProducto;
		this.precio = precio;
		this.foto = foto;
		this.cantidad = cantidad;
		this.categoria = categoria;
		this.estadoPublicacion = estadoPublicacion;
		this.comentario = comentario;
	}
//	public Productos() {
//		super();
//	}
	
	public String ToString() {
		return "PersonaNatural("+"usuario:"+usuario+", id"+id+"nombre"+nombre+", descipcion: "+descripcion+"estadoProducto: "+estadoProducto+"precio: "+precio+
				"foto:"+foto+"cantidad:"+cantidad+"categoria:"+categoria+"estadoPublicacion:"+estadoPublicacion+"comentario:"+comentario+")";

	}
}
