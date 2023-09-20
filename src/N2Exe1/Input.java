package N2Exe1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	
	private static final Scanner input = new Scanner(System.in); //Reusing part of the class Tool created during study
	private static final String BYTE_FORMAT_ERR_MSG = "There is a format error on your response. Enter a byte";
	private static final String INT_FORMAT_ERR_MSG = "There is a format error on your response. Enter a integer";
	private static final String DOUBLE_FORMAT_ERR_MSG = "There is a format error on your response. Enter a double";
	private static final String FLOAT_FORMAT_ERR_MSG = "There is a format error on your response. Enter a float";
	private static final String EMPTY_STRING_ERR_MSG = "Your respose must not be empty.";
	private static final String YES_NO_ERR_MSG = "There is an error on your response. Enter Y or N if yes or no.";
	private static final String CHAR_LENGTH_CONROL_ERR_MSG = "There is an error on your response. Enter a single char";

	
	public static byte inputByte (String pregunta) {
		byte response = 0;
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextByte();
				okey = true;
			} catch (InputMismatchException ex) {
				System.err.println(BYTE_FORMAT_ERR_MSG);
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
				System.err.println(INT_FORMAT_ERR_MSG);
			}
			input.nextLine();
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
				if (response.isEmpty()) { 
					throw new Exception(EMPTY_STRING_ERR_MSG); 
				} else {
					
				okey = true;
				}
			} catch (Exception ex) {
				System.err.println(ex.getMessage());
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
				System.err.println(DOUBLE_FORMAT_ERR_MSG);
			}
			input.nextLine();
		} while (!okey);		
		return response;	
	}
	
	public static float inputFloat (String pregunta) {
		float response = 0.0F;
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextFloat();
				okey = true;
			} catch (InputMismatchException ex) {
				System.err.println(FLOAT_FORMAT_ERR_MSG);
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
                if (userResponse.charAt(0) == 'Y') {
                    booleanResponse = true;
                    okey = true;
                } else if (userResponse.charAt(0) == 'N') {
                    booleanResponse = false;
                    okey = true;
                } else {
                	throw new Exception(YES_NO_ERR_MSG);
                }
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        } while (!okey);
        return booleanResponse;
	 }
	
    public static char inputChar(String mensaje) {
       String response = "";
       char inputChar = 0; 
       boolean okey = false;

        do {
            System.out.print(mensaje);
            try {
                response = input.nextLine();
                
               if (response.length() > 1) {
            	   throw new Exception(CHAR_LENGTH_CONROL_ERR_MSG);
               } else if (response.isEmpty()){
            	   throw new Exception(EMPTY_STRING_ERR_MSG);
               } else {
                okey = true;
               }
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
            input.nextLine();
        } while (!okey);
        
        return inputChar = response.charAt(0);
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
 * public static byte leerByte(String mensaje); OK
 * public static int leerInt(String mensaje); OK
 * public static float leerFloat(String mensaje); OK
 * public static double leerDouble(String mensaje); OK
 * Métodos a implantar capturando la excepción de la clase Exception: OK
 * public static char leerChar(String mensaje); OK
 * public static String leerString(String mensaje); OK
 * public static boolean leerSiNo(String mensaje), si el usuario introduce “s”,OK
 * devuelve “true”, si el usuario introduce “n”, devuelve “false”. OK
 */
