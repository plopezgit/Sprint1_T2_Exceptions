package N3Exe1;

public class Principal {

	public static void main(String[] args) {
		Cine cine = new Cine();
		do {
			cine.start(cine.menu());
		} while (cine.menu() != 6);
	}
}

/*
 * Una famosa empresa de cines nos ha pedido que desarrollemos una aplicación 
 * para la reserva de asientos en sus cines. 
 * La aplicación será utilizada por los vendedores/as a la hora de vender las entradas.
 * Funcionamiento:
 * La aplicación una vez se haya iniciado, preguntará al usuario 
 * cuántas filas y cuántos asientos por fila tiene la sala de cine. 
 * Una vez introducidos estos datos, se mostrará el siguiente menú:

1.- Mostrar todas las butacas reservadas.
2.- Mostrar las butacas reservadas por una persona.
3.- Reservar un sillón.
4.- Anular la reserva de un sillón.
5.- Anular todas las reservas de una persona.
0.- Salir.

La aplicación tendrá las siguientes clases:
Clase Principal OK
Tendrá el main de la aplicación donde se instanciará un objeto de la clase Cine OK
y llamará a su método iniciar. OK

Clase Butaca OK
Tendrá los datos de un sillón: OK
Atributos: OK
Número de fila. OK
Número de asiento. OK
Persona que reserva el sillón. OK
Métodos: OK
Constructor con todos sus parámetros. OK
Getters por todos los atributos. OK
Equals: devolverá que dos butacas son iguales si la fila y el asiento son iguales. OK
toString: devolverá un String con el siguiente formato: “Fila: 5, Asiento: 20, Persona: Maria Febrer” OK

Clase Cine
Contendrá todos los métodos que permiten interactuar al usuario con la aplicación.
Atributos:
Número de filas del cine.
Número de asientos por cada fila.
Un objeto de la clase GestioButaques
Métodos:
Constructor: no recibirá parámetros. 
Creará el objeto de la clase GestiónButacas. 
Y llamará al método pedir Datos Iniciales que inicializará el número de filas y de asientos.

iniciar: empezará la aplicación. Llamará al método menú y en función del número devuelto, 
llamará al método correspondiente.

menu: mostrará las opciones del menú principal al usuario, 
le pedirá el número de la opción escogida y lo devolverá.

mostrarButacas: Muestra todas las butacas reservadas.

mostrarButacasPersona: Pide el nombre de la persona que ha hecho la reserva 
y muestra todas las butacas reservadas por esa persona.

reservarButaca: Pide al usuario un número de fila (llamada al método introducirFila), 
un número de asiento (llamada al método introducirAsiento), 
el nombre de la persona que hace la reserva (llamada al método introducirPersona) y reserva el sillón .

anularReserva: Pide al usuario un número de fila (llamada al método introducirFila), 
un número de asiento (llamada al método introducirAsiento) y elimina la reserva del sillón.

anularReservaPersona: Pide al usuario el nombre de la persona (llamada al método introducirPersona) 
y elimina las butacas reservadas por la persona introducida.

introducirPersona: pide al usuario el nombre de la persona y lo devuelve si es correcto. 
Si contiene números, lanza una excepción personalizada ExcepcionNomPersonaIncorrecte.

pedirDatosIniciales: Pide al usuario el número de filas y asientos 
y los guarda en los atributos correspondientes.

introducirFila: Pide el número de fila, si éste está entre 1 y el número de filas totales, 
lo devuelve. Si no, devuelve una excepción personalizada ExcepcioFilaIncorrecta.

introducirAsiento: Pide el asiento, si el número está entre 1 y el número total de asientos, 
lo devuelve. Si no, devuelve una excepción del tipo ExcepcioSeientIncorrecte.


Clase GestioButacas
Contendrá un ArrayList de butacas y los métodos necesarios para añadir, 
eliminar y buscar las butacas en ArrayList.
Atributos:
sillones: ArrayList de sillones.
Métodos:
Constructor: No recibirá parámetros e inicializará el ArrayList de butacas.
getButacas: Devolverá el atributo sillones.

añadirButaca: será el encargado de añadir un sillón al vector de sillones. 
Recibirá como parámetro un objeto de la clase Butaca y lo añadirá a ArrayList. 
Si la fila y el asiento de la butaca recibida como parámetro coinciden con el de 
una butaca que ya se encuentre en ArrayList (se utilizará el método buscarButaca), 
se lanzará la excepción personalizada ExcepcioButacaOcupada.

eliminarButaca: será el encargado de eliminar una butaca del ArrayList de butacas. 
Recibirá como parámetros el número de fila y el asiento y lo eliminará del ArrayList. 
Si la fila y el asiento no coinciden con el de una butaca reservada 
(se utilizará el método buscarButaca), lanzará una excepción personalizada ExcepcioButacaLliure.

buscarButaca: Buscar en el ArrayList de butacas, la butaca que coincida con los datos recibidos 
como parámetro (fila y asiento). Si la encuentra devolverá la posición de la butaca en ArrayList 
y si no la encuentra devolverá -1.
 */
