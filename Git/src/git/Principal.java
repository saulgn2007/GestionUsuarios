package git;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		Ingreso ingresos=new Ingreso(15000);
		
		ingresos.rellenar(sc);
		ingresos.mostrardatos();

		Scanner scan = new Scanner(System.in);
		Viajes datos = new Viajes();
		double gastoTotal=0;
		System.out.println("¿Cuántos viajes deseas guardar?");
		int num= Integer.parseInt(scan.nextLine());
		while(num!=0) {
			datos.setDestino();
			datos.setFechaIda();
			datos.setFechaVuelta();
			datos.setCoste();
			System.out.println(datos.toString());
			num--;
			gastoTotal= gastoTotal+datos.getCoste();
		}
		scan.close();
	}
}
