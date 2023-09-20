# Sprint1_T2_Exceptions

Level 1
- Exercise 1
Create a class called "Product" with the name and price attributes, and another class called "Sale". This class has as attributes a collection of products and the total price of the sale.

The "Sale" class has a method called calculateTotal() that throws the custom exception SaleEmptyException and displays "To make a sale you must first add products" if the collection of products is empty. If the collection has products, then it must loop through the collection and store the sum of all the product prices in the totalsaleprice attribute.

The custom exception VendaBuidaException must be a child of the Exception class. To its constructor we must pass the message "To make a sale you must first add products" and when we capture the exception, we must display it on the screen with the getMessage() method of the exception.

Write the necessary code to generate and catch an exception of type ArrayIndexOutOfBoundsException.


Level 2
- Exercise 1
Create a class called "Input". This class must be used to control the different exceptions that can appear in Java when entering data by keyboard using the Scanner class.

The first thing to do is to instantiate an object of the Scanner class and from there, create static methods to read the different types of data from the keyboard.

  important

It is important that if an exception is raised in any method, we handle it and ask the user for the data again until it is properly entered. For example: If you enter a float with a period instead of a comma, it should show “Format Error”. Until the user enters a well-formed float, he/she must keep asking for the data.

All methods receive a String with the message to be displayed to the user, for example: "Enter your age", and return the appropriate data entered by the user in each method, for example: a byte with the user's age.

Methods to be implemented by catching the exception of the InputMismatchException class:

public static byte readByte(String message);

public static int readInt(String message);

public static float readFloat(String message);

public static double readDouble(String message);

Methods to implement capturing the exception of the Exception class:

public static char readChar(String message);

public static String readString(String message);

public static boolean readIfNo(String message), if the user enters "s", it returns "true", if the user enters "n", it returns "false".

Level 3
- Exercise 1
A famous cinema company has asked us to develop an application for the reservation of seats in their cinemas. The application will be used by sellers when selling tickets.

operation
Once the application has started, it will ask the user how many rows and how many seats per row the cinema has. Once this data is entered, the following menu will be displayed:

1.- Show all reserved seats.

2.- Show the seats reserved by one person.

3.- Reserve a seat.

4.- Cancel the reservation of a seat.

5.- Cancel all reservations of a person.

0.- Exit.


The application will have the following classes:

Main Class

It will have the main of the application where an object of the Cine class will be instantiated and call its start method.


Armchair Class

It will have the details of a seat:

Attributes:

Row number.

Number of seats

Person who reserves the seat.

Methods:

Constructor with all parameters.

Getters for all attributes.

Equal: will return that two seats are equal if the row and seat are the same.

toString: will return a String with the following format: "Row: 5, Seat: 20, Person: Maria Febrer"


Cinema class

It will contain all the methods that allow the user to interact with the application.

Attributes:

Number of rows in the cinema.

Number of seats for each row.

An object of the GestioButaques class

Methods:

Constructor: Will receive no parameters. It will create the GestióButaques class object. And it will call the requestInitialData method which will initialize the number of rows and seats.

start: the application will start. It will call the menu method and depending on the number returned, it will call the corresponding method.

menu: will show the main menu options to the user, ask for the number of the chosen option and return it.

show seats: Show all reserved seats.

showPersonSeats: Asks for the name of the person who made the reservation and shows all the seats reserved by that person.

reservaButaca: Asks the user for a row number (call to the insertRow method), a seat number (call to the insertSeat method), the name of the person making the reservation (call to the insertPerson method) and reserves the seat .

cancelReservation: Asks the user for a row number (call to the method insertRow), a seat number (call to the method introduirSeient) and deletes the seat reservation.

cancelPersonReservation: Asks the user for the person's name (call to the enterPerson method) and deletes the seats reserved by the person entered.

enterPerson: asks the user for the person's name and returns it if it is correct. If it contains numbers, it throws a custom exception ExceptionIncorrectPersonName.

requestInitialData: Asks the user for the number of rows and seats and saves them in the corresponding attributes.

enterRow: Requests the number of rows, if this is between 1 and the total number of rows, returns it. If not, it returns a custom exception BadRowException.

enterSeat: Requests the seat, if the number is between 1 and the total number of seats, returns it. If not, it returns an exception of type IncorrectSeatException.


Armchair Management class

It will contain an ArrayList of armchairs and the necessary methods to add, remove and search for the armchairs in the ArrayList.

Attributes:

armchairs: ArrayList of armchairs.

Methods:

Constructor: It will receive no parameters and will initialize the ArrayList of armchairs.

getButaques: It will return the attribute butaques.

addChair: will be in charge of adding a chair to the vector of chairs. It will receive an object of the Armchair class as a parameter and add it to the ArrayList. If the row and the seat of the chair received as a parameter match that of a chair that is already in the ArrayList (the cercarButaca method will be used), the custom exception ExceptionButacaOcupada will be thrown.

removeChair: will be responsible for removing a chair from the ArrayList of chairs. It will receive the row number and the seat as parameters and remove it from the ArrayList. If the row and seat do not match that of a reserved seat (the findSeat method will be used), it will throw a custom exception FreeSeatException.

sercarButaca: Search in the ArrayList of armchairs, the armchair that matches the data received as a parameter (row and seat). If it finds it, it will return the position of the armchair in the ArrayList and if it doesn't find it, it will return -1.