package clases;

public class Usuario {
	
	private String nombre;
	private String usuario;
	private String contrase�a;
	private String edad;
	private String dinero;

	public Usuario(String nombre, String usuario, String contrase�a, String edad) {
		this.nombre = nombre;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public String getEdad() {
		return edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public void setEdad(String edad) {
		this.edad = edad;
	}
}
