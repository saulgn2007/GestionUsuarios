package git;

public class Usuario {

	private String nombre;
	private String email;
	private double nomina;
	
	
	public Usuario() {
		
	}


	public Usuario(String nombre, String email, double nomina) {
		this.email = email;
		this.nombre = nombre;
		this.nomina = nomina;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getNomina() {
		return nomina;
	}


	public void setNomina(Double nomina) {
		this.nomina = nomina;
	}
	
	public void MostrarDatos() {
		System.out.println("El nombre es: " +nombre);
		System.out.println("El email es: " +email);
		System.out.println("La nómina es de: "+ nomina);
	}
	
}
