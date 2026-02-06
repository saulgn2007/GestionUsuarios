package git;

public class Gastos {
	//Declaracion de atributos
	private double alquiler;
	private double gastos_varios;
	
	public Gastos() {};
	
	public Gastos(double alquiler, double gastos_varios) {
		this.alquiler = alquiler;
		this.gastos_varios = gastos_varios;
	}
	
	//Metodo para mostrar los gastos totales
	public void gastos_totales() {
		double total = alquiler + gastos_varios;
		System.out.println("El total de los gastos son: " + total + "€");
	}

	public void setAlquiler(double alquiler) {
		this.alquiler = alquiler;
	}

	public void setGastos_varios(double gastos_varios) {
		this.gastos_varios = gastos_varios;
	}
}
