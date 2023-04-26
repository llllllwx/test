/*2. (Utilice la clase GregorianCalendar) La API de Java tiene la clase GregorianCalendar en el
paquete java.util, que se puede utilizar para obtener el año, mes y día de una fecha. El
constructor sin-argumentos construye una instancia para la fecha actual y los métodos
get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH), y obtener
(GregorianCalendar.DAY_OF_MONTH) devuelve el año, mes y día.
Escribe un programa para realizar dos tareas:

*** Muestra el año, mes y día actual.
*** La clase GregorianCalendar tiene setTimeInMillis (long), que se puede utilizar para
establecer un tiempo transcurrido especificado desde el 1 de enero de 1970.
Establecer el valor a 1234567898765L y mostrar el año, mes y día*/
import java.util.GregorianCalendar;

public class Ejercicio2 {
    public static void main(String[] args){
        GregorianCalendar fechaActual = new GregorianCalendar();
        int year = fechaActual.get(GregorianCalendar.YEAR);
        int month = fechaActual.get(GregorianCalendar.MONTH)+1;
        int day = fechaActual.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("La fecha actual es: " + day + "/" + month + "/" + year);

        GregorianCalendar fecha = new GregorianCalendar();
        fecha.setTimeInMillis(1234567898765L);
        year = fecha.get(GregorianCalendar.YEAR);
        month = fecha.get(GregorianCalendar.MONTH)+1;
        day = fecha.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("La fecha correspondiente al valor 1234567898765L es: " + day + "/" + month + "/" + year);
    }
}
