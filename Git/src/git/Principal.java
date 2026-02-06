package git;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		//Gastos..
		Gastos p = new Gastos();
		Scanner leer_gastos = new Scanner(System.in);
		int opcion_gastos = 0;
		opcion_gastos = leer_gastos.nextInt();
		
		System.out.println("==Menú==");
		System.out.println("1-> Introducir gastos de alquiler");
		System.out.println("2-> Introducir otros gastos");
		System.out.println("3-> Salir del programa");
		
		switch(opcion_gastos) {
			case 1:
				System.out.print("Introduce el gasto del alquiler: ");
				double alquiler = leer_gastos.nextDouble();
				p.setAlquiler(alquiler);
				break;
			case 2:
				System.out.print("Introduce otros gastos: ");
				double gastos = leer_gastos.nextDouble();
				gastos = gastos + gastoTotal;
				p.setGastos_varios(gastos);
				break;
			case 3:
				System.out.println("Saliendo del programa...");
				break;
			default :
				System.out.println("Los datos introducidos deben ser entre 1 y 4 para que sean válidos.");
				break;
		}
		p.gastos_totales();
		leer_gastos.close();
		//Fin Gastos.
	}
}
