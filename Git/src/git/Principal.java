package git;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Ingreso ingresos=new Ingreso(15000);
		
		ingresos.rellenar(sc);
		ingresos.mostrardatos();
	}

}
