import java.util.Scanner;

public class Contraseña {

	public static void main(String[] args) {
		
		System.out.println("Introduce la contraseña:");
		
		Scanner sc = new Scanner(System.in);
		String contraseñavalida = "hola";
		String contraseña = sc.nextLine();
		int contador = 3;
		while (contador >= 0) {
			
			if (contraseña.equals(contraseñavalida)) {
				
				System.out.println("Contraseña válida");
				System.out.println("Bienvenido!");
				break;
			}

			else if (contraseña != contraseñavalida && contador > 0) {
				contador--;
				System.err.println("Contraseña no válida");
				System.err.println("Intentos restantes: " + contador);
				System.out.println("Introduce la contraseña:");
				contraseña = sc.nextLine();
			}
			
			else if (contador == 0) {
				
				System.err.println("Intentos agotados");
				break;
			}
		}
		
		sc.close();
		
			
		}
}


