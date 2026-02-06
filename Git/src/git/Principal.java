package git;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		Usuario user= new Usuario();


		boolean esValido=false;
		while (esValido==false) {

			try {

				System.out.println("Introduzca su nombre");
				user.setNombre(leer.nextLine());
				System.out.println ("Introduzca su email");
				user.setEmail(leer.nextLine());
				System.out.println("Introduzca su nómina");
				user.setNomina(Double.parseDouble(leer.nextLine()));

				int opcion;
				do {
					System.out.println("===MENÚ===");
					System.out.println("1. Cambiar el nombre");
					System.out.println("2. Cambiar el email");
					System.out.println("3. Cambiar datos de la nómina");
					System.out.println("4. Mostar los datos");
					System.out.println("5. Salir del programa");

					opcion=Integer.parseInt(leer.nextLine());
					
					switch(opcion) {
					case 1:
						System.out.println("Introduzca su nuevo nombre:");
						user.setNombre(leer.nextLine());
						System.out.println("Su nuevo nombre es: "+ user.getNombre());
						break;
					case 2:
						System.out.println("Introduzca su nuevo email:");
						user.setEmail(leer.nextLine());
						System.out.println("Su nuevo email es: " + user.getEmail());
						break;
					case 3:
						System.out.println("Introduzca su nueva nómina: ");
						user.setNomina(Double.parseDouble(leer.nextLine()));
						System.out.println("Su nueva nómina es de: "+ user.getNomina());
						break;
					case 4:
						user.MostrarDatos();
						break;
					case 5:
						System.out.println("Saliendo del programa ");
						break;
					default:
						System.out.println("ERROR: EL NÚMERO QUE HA INSERTADO NO ES VÁLIDO");
						break;
					}
					esValido=true;

				}while (opcion!=5);

			}catch(NumberFormatException e) {

				System.out.println("Error.El valor introducido no coincide.");
			}
		}

		Scanner sc =new Scanner(System.in);
		
		Ingreso ingresos=new Ingreso(user.getNomina());

		
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
		sc.close();
		leer.close();
		
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
