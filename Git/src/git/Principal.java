package git;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Ingreso ingresos=new Ingreso();
		
		ingresos.setNomina(sc);
		ingresos.rellenar(sc);
		ingresos.mostrardatos();
	}

}
