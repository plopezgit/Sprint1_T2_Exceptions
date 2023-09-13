package N2Exe1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	
	private static final Scanner input = new Scanner(System.in); //Reusing the class Tool created during study
	
	public static byte inputByte (String pregunta) {
		byte response = 0;
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextByte();
				okey = true;
			} catch (InputMismatchException ex) {
				System.out.println("There is a format error on your response.");
			}
			input.nextLine();
		} while (!okey);
		return response;
	}
	
	public static int inputInt (String pregunta) {
		int response = 0;
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextInt();
				okey = true;
			} catch (InputMismatchException ex) {
				System.out.println("There is a format error on your response.");
			}
			input.nextLine();
		} while (!okey);
		return response;
	}
	
	public static String inputStringLow (String pregunta) {
		String response = "";
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextLine().toLowerCase();	
				okey = true;
			} catch (Exception ex) {
				System.out.println("There is an error on your response.");
			}
		} while (!okey);
		return response;	
	}
	
	public static String inputStringUp (String pregunta) {
		String response = "";
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextLine().toUpperCase();	
				okey = true;
			} catch (Exception ex) {
				System.out.println("There is an error on your response.");
			}
		} while (!okey);
		return response;	
	}
	
	public static String inputString (String pregunta) {
		String response = "";
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextLine();	
				okey = true;
			} catch (Exception ex) {
				System.out.println("There is an error on your response.");
			}
		} while (!okey);
		return response;	
	}
	
	public static double inputDouble (String pregunta) {
		double response = 0.0;
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextDouble();
				okey = true;
			} catch (InputMismatchException ex) {
				System.out.println("There is a format error on your response.");
			}
			input.nextLine();
		} while (!okey);		
		return response;	
	}
	
	public static boolean inputYesNo (String pregunta) {
        boolean booleanResponse = false;
        boolean okey = false;
        String userResponse = "";

        do {
            System.out.print(pregunta);
            try {
                userResponse = input.nextLine().toUpperCase();
                okey = true;
                if (userResponse.charAt(0) == 'S') {
                    booleanResponse = true;
                } else if (userResponse.charAt(0) == 'N') {
                    booleanResponse = false;
                } else {
                    System.out.println("Your response is not valid.");
                    okey = false;
                }
            } catch (Exception ex) {
                System.out.println("There is an error on your response.");
            }
        } while (!okey);
        return booleanResponse;
	 }
	
    public static char inputChar(String mensaje) {
        char response = 0;
        boolean okey = false;

        do {
            System.out.print(mensaje);
            try {
                response = input.next().charAt(0);
                okey = true;
            } catch (InputMismatchException ex) {
                System.out.println("There is a format error on your response.");
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            input.nextLine();
        } while (!okey);
        return response;
    }

}

/*
 * Crea una clase llamada "Entrada". OK 
 * Esta clase debe servir para controlar las distintas excepciones OK
 * que pueden aparecer en Java a la hora de introducir datos por teclado OK
 * utilizando la clase Scanner. OK
 * 
 * Lo primero que debe hacerse es instanciar un objeto de la clase Scanner ya partir de ahí, OK
 * crear métodos estáticos para leer los diferentes tipos de datos desde el teclado. OK
 * 
 * Importante
 * Es importante que si en algún método salta una excepción, OK
 * la tratamos y volvemos a pedir el dato al usuario hasta que éste esté bien introducido. OK
 * Por ejemplo: Si introduce un float con un punto en lugar de con una coma, OK
 * debe mostrar “Error de formato”. Hasta que el usuario/a no introduce OK
 * un float bien formado debe seguir pidiendo el dato. OK
 * 
 * Todos los métodos reciben un String con el mensaje que se quiere mostrar al usuario, OK
 * por ejemplo: “Introduce tu edad”, y devuelven el dato oportuno introducido OK
 * por el usuario en cada método, por ejemplo: uno byte con la edad del usuario/a. OK
 * Métodos a implantar capturando la excepción de la clase InputMismatchException:
 * public static byte leerByte(String mensaje);
 * public static int leerInt(String mensaje);
 * public static float leerFloat(String mensaje);
 * public static double leerDouble(String mensaje);
 * Métodos a implantar capturando la excepción de la clase Exception:
 * public static char leerChar(String mensaje);
 * public static String leerString(String mensaje);
 * public static boolean leerSiNo(String mensaje), si el usuario introduce “s”, devuelve “true”, si el usuario introduce “n”, devuelve “false”.
 */
