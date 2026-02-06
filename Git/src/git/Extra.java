package git;

public class Extra {
	private double dinero;
	private String concepto;

	public Extra(double dinero, String concepto) {
		this.dinero=dinero;
		this.concepto=concepto;
	}

	public double getDinero() {
		return dinero;
	}

	public void mostrarExtras() {
		System.out.println(concepto);
		System.out.println(dinero +"€");
	}
}
