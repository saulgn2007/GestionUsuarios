package git;
import java.util.*;
public class Ingreso {

	private double nomina;
	private ArrayList<Extra> extras;
	private double totalextras;
	private double total;

	public Ingreso() {
		extras=new ArrayList<>();
	}

	public void setNomina(Scanner sc) {
		String x="";
		do {
		System.out.println("Introduce tus ingresos mensuales base: ");
		x=sc.nextLine();
		}while(!decimales(x));
		nomina=Double.parseDouble(x);
	}

	public void ingresototal() {
		totalextras=0;
		total=0;
		Iterator <Extra> iterador= extras.iterator();
		while(iterador.hasNext()) {
			totalextras+= iterador.next().getDinero();
		}
		total+=(nomina*0.79)+totalextras;
		System.out.println("Los ingresos totales son "+total+"€");
	}
	
	public void mostrarExtras() {
		System.out.println("INGRESOS EXTRAS");
		Iterator <Extra> iterador= extras.iterator();
		while(iterador.hasNext()) {
			iterador.next().mostrarExtras();;
		}
		System.out.println();
	}

	public void rellenar(Scanner sc) {
		String concepto="", dinerocadena="";
		do {
			System.out.println("Introduce el concepto del extra (Escribe 'Salir' para salir)");
			concepto=sc.nextLine();
			if(!concepto.equals("Salir")) {
				do {
			System.out.println("Introduce el dinero");
			dinerocadena=sc.nextLine();
				}while(!decimales(dinerocadena));
				double dinero=Double.parseDouble(dinerocadena);
			Extra e= new Extra(dinero, concepto);
			extras.add(e);
			}
		}while(!concepto.equals("Salir"));
	}
	
	public boolean decimales(String x) {
		try {
		Double.parseDouble(x);	
		}catch(NumberFormatException e) {
		return false;
		}
		return true;
	}
	
	public void mostrardatos() {
		mostrarExtras();
		ingresototal();
	}
}