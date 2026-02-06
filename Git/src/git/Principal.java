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
	}




}


