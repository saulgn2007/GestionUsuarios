package git;
import java.util.Scanner;
public class Viajes {
	private String destino;
	private String fechaIda;
	private String fechaVuelta;
	private double coste;
	public Scanner scan = new Scanner(System.in);

	public Viajes(String destino, String fechaIda, String fechaVuelta, double coste) {
		this.destino=destino;
		this.fechaIda=fechaIda;
		this.fechaVuelta=fechaVuelta;
		this.coste=coste;
	}

	public Viajes() {
	}

	public void setDestino() {
		System.out.println("Introduce su destino: ");
		do {
			try {
				destino = scan.nextLine().trim();
				if (destino.isEmpty()) {
					System.out.println("Error: No puede estar vacío.");
				}
			} catch (Exception e) {
			}
		} while (destino.isEmpty());
	}

	public void setFechaIda() {
		String patron="^\\d{2}+/\\d{2}+/\\d{4}$";
		boolean valido=false;
		while(!valido) {
			try {
				System.out.println("Introduce la fecha de ida del viaje: ");
				fechaIda= scan.nextLine().trim();
				while (!fechaIda.matches (patron)){
					System.out.println("Introduce una fecha válida: ");
					fechaIda= scan.nextLine().trim();
				}
				valido=true;
			}
			catch(NumberFormatException e) {
				System.out.println("Error, debes introducir un valor válido");
			}
		}
	}

	public void setFechaVuelta() {
		String patron="^\\d{2}+/\\d{2}+/\\d{4}$";
		boolean valido=false;
		while(!valido) {
			try {
				System.out.println("Introduce la fecha de vuelta del viaje: ");
				fechaVuelta= scan.nextLine().trim();
				while (!fechaVuelta.matches (patron)){
					System.out.println("Introduce una fecha válida: ");
					fechaVuelta= scan.nextLine().trim();
				}
				valido=true;
			}
			catch(NumberFormatException e) {
				System.out.println("Error, debes introducir un valor válido");
			}
		}
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste() {
		boolean valido=false;
		while(!valido) {
			try {
				System.out.println("Introduce el coste del viaje: ");
				coste= Double.parseDouble(scan.nextLine());
				while (coste<=0){
					System.out.println("Campo obligatorio, introduce el coste del viaje: ");
					coste= Double.parseDouble(scan.nextLine());
				}
				valido=true;
			}
			catch(NumberFormatException e) {
				System.out.println("Error, debes introducir un valor válido");
			}
		} 
	}

	@Override
	public String toString() {
		return "Viajes [fechaIda=" + fechaIda + ", fechaVuelta=" + fechaVuelta + ", coste=" + coste + "]";
	}
}
