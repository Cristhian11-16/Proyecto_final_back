package in.bushansirgur.springrestapi.model;

public class PersonaNatural {

	private String nombre;
	private String apellido;
	private Long id;
	private int numeroCelular;
	private String email;
	private String contraseña;
	private Ciudades ciudad;
	private TipoCalle tipoCalle;
	private String calle;
	private String numeroCalle;
	private String numeroCasa;
	

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


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public int getNumeroCelular() {
		return numeroCelular;
	}
	
	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	
	public Ciudades getCity() {
		return ciudad;
	}
	public void setCity(Ciudades ciudad) {
		this.ciudad = ciudad;
	}
	public TipoCalle getTipoCalle() {
		return tipoCalle;
	}
	public void setCalle(TipoCalle tipoCalle) {
		this.tipoCalle = tipoCalle;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumeroCalle() {
		return numeroCalle;
	}
	public void setNumeroCalle(String numeroCalle) {
		this.numeroCalle = numeroCalle;
	}
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public PersonaNatural(Long id, String nombre, String apellido, int numeroCelular, String email, String contraseña, Ciudades ciudad, TipoCalle tipoCalle, String calle, String numeroCalle, String numeroCasa ) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroCelular = numeroCelular;
		this.email = email;
		this.contraseña = contraseña;
		this.ciudad = ciudad;
		this.tipoCalle = tipoCalle;
		this.calle = calle;
		this.numeroCalle = numeroCalle;
		this.numeroCasa = numeroCasa;
	}
	public PersonaNatural( String nombre, String apellido, int numeroCelular, String email, String contraseña, Ciudades ciudad, TipoCalle tipoCalle, String calle, String numeroCalle, String numeroCasa ) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroCelular = numeroCelular;
		this.email = email;
		this.contraseña = contraseña;
		this.ciudad = ciudad;
		this.tipoCalle = tipoCalle;
		this.calle = calle;
		this.numeroCalle = numeroCalle;
		this.numeroCasa = numeroCasa;
		
	}
	@Override
	public String toString() {
		return "PersonaNatural("+"nombre="+nombre+", apellido="+apellido+", id="+id+",numeroCelular"+numeroCelular+", email="+email+", ciudad="+ciudad+", contraseña"+contraseña+", tipoCalle"+tipoCalle+", calle"+calle+", numeroCalle"+numeroCalle+"numeroCasa"+numeroCasa+")";
	}

}
