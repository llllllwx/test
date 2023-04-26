import java.util.GregorianCalendar;

public class EjemploGregorianCalendar {
    public static void main(String[] args) {
        // Muestra el año, mes y día actual
        GregorianCalendar fechaActual = new GregorianCalendar();
        int year = fechaActual.get(GregorianCalendar.YEAR);
        int month = fechaActual.get(GregorianCalendar.MONTH) + 1;
        int day = fechaActual.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("La fecha actual es: " + day + "/" + month + "/" + year);

        // Establecer el valor a 1234567898765L y mostrar el año, mes y día
        GregorianCalendar fecha = new GregorianCalendar();
        fecha.setTimeInMillis(1234567898765L);
        year = fecha.get(GregorianCalendar.YEAR);
        month = fecha.get(GregorianCalendar.MONTH) + 1;
        day = fecha.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("La fecha correspondiente al valor 1234567898765L es: " + day + "/" + month + "/" + year);
    }
}