package N1Exe1;

import N1Exe1.Exceptions.EmptySaleListException;

public class ExecuteCallToCalculateTotalSalesAmount {

	public static void main(String[] args) {

		Sale fruit = new Sale();
		fruit.getProductBuyedList().add(new Product("apple", 5));
		fruit.getProductBuyedList().add(new Product("pineapple", 10));
		System.out.println(fruit.getProductBuyedList());

		try {
			System.out.println("Total sales: " + fruit.calculateTotalSalesAmount());
		} catch (EmptySaleListException e) {
			e.getMessage();
		}

		fruit.getProductBuyedList().remove(1);
		fruit.getProductBuyedList().remove(0);
		System.out.println(fruit.getProductBuyedList());

		try {
			fruit.calculateTotalSalesAmount();
		} catch (EmptySaleListException e) {
			System.out.println(e.getMessage());
		}

		try {
			fruit.getProductBuyedList().remove(0);
			fruit.getProductBuyedList().remove(1); // Changing the removing index order to get ("Exception in thread
													// "main" java.lang.IndexOutOfBoundsException: ...")
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
			System.out.println("Be here now");
		}

		String[] products = { "apple", "orange" }; // Trying with an Array instead....

		try {
			String s = products[56];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
			System.out.println("Be here now");
		}

	}

	/*
	 * Crea una clase llamada "Producto" con los atributos nombre y precio, y otra
	 * clase llamada "Venta". OK Esta clase tiene por atributos una colección de
	 * productos y el precio total de la venta. OK La clase "Venta", tiene un método
	 * llamado calcularTotal() que lanza la excepción personalizada
	 * VentaBuidaException OK y muestra por pantalla
	 * "Para hacer una venta primero debes añadir productos" si la colección de
	 * productos está vacía. OK Si la colección tiene productos, OK entonces debe
	 * recorrer la colección OK y guardar la suma de todos los precios de los
	 * productos en el atributo precio total de la venta. OK
	 * 
	 * La excepción personalizada VendaBuidaException debe ser hija de la clase
	 * Exception. OK
	 * 
	 * A su constructor debemos pasarle el mensaje “Para hacer una venta primero
	 * debes añadir productos” y cuando capturamos la excepción, debemos mostrarlo
	 * por pantalla con el método getMessage() de la excepción.
	 * 
	 * Escribe el código necesario para generar y capturar una excepción de tipo
	 * ArrayIndexOutOfBoundsException. OK
	 */

}
