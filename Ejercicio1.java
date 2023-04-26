class Stock{
    private String simbolo;
    private String nombre;
    private double precioCierrePrevio;
    private double precioActual;

    public Stock(String simbolo, String nombre){
        this.simbolo = simbolo;
        this.nombre = nombre;
    }
    public String getSimbolo(){
        return simbolo;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecioCierrePrevio(){
        return precioCierrePrevio;
    }
    public double getPrecioActual(){
        return precioActual;
    }
    public void setSimbolo(String simbolo){
        this.simbolo = simbolo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecioCierrePrevio(double newPrecioCierre){
        precioCierrePrevio = newPrecioCierre;
    }
    public void setPrecioActual(double newPrecioActual){
        precioActual = newPrecioActual;
    }
    public double getCambioPorcentaje(){
        double porcentaje = ((getPrecioActual()-getPrecioCierrePrevio())/getPrecioActual())*100;
        double resultado = (double)((int)(porcentaje*100))/100;
        return resultado;
    }
}
public class Ejercicio1 {
    public static void main(String[] args){
        /*1. (La clase Stock) Siguiendo el ejemplo de la clase Circulo, diseñar una clase llamada Stock que
        contenga:
         Un campo de datos de tipo String llamado símbolo para el símbolo de la acción (stock).
         Un campo de datos de tipo string llamado nombre para el nombre de la acción.
         Un campo de datos de tipo double denominado precioCierrePrevio que almacena el precio del día anterior.
         Un campo de datos double denominado precioActual que almacena el precio de las acciones para fecha actual.
         Un constructor que crea una acción con el símbolo y el nombre especificados.
         Un método llamado getCambioPorcentaje() que devuelve el porcentaje modificado
        considerando precioCierrePrevio y precioActual.
        Dibuje el diagrama UML para la clase y luego implemente la clase. Escribe una programa de
        prueba que crea un objeto Stock con el símbolo de stock ORCL, el nombre Oracle Corporation,
        y el precio de cierre anterior de 34.5, precioActual 34.35 y mostrar el porcentaje de cambio de
        precio. 
 */
        Stock accion = new Stock("ORCL", "Oracle Corporation");
        accion.setPrecioCierrePrevio(34.5);
        accion.setPrecioActual(34.35);
        double resultado = accion.getCambioPorcentaje();

        if (resultado<0)
            System.out.println("El precio cayo en un "+resultado+"%");
        else
            System.out.println("El precio aumento en un "+resultado+"%");
    }
    //https://gitmind.com/app/docs/fc7man27
}
