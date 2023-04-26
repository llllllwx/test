class Ventilador{
    /* Tres constantes denominadas SLOW, MEDIUM y FAST con los valores 1, 2 y 3 para
    denotar la velocidad del ventilador. */
    public final static int SLOW = 1; 
    public final static int MEDIUM = 2;
    public final static int FAST = 3;
    /* Un campo de datos int privado llamado speed que especifica la velocidad del
    ventilador (el valor predeterminado es SLOW). */
    private int speed = SLOW;
    /* Un campo de datos booleanos privados llamado on que especifica si el ventilador
    está encendido (el valor predeterminado es falso). */
    private boolean on = false;
    /* Un campo de datos double privado llamado radio que especifica el radio del
    ventilador (el valor predeterminado es 5). */
    private double radio = 5;
    /* Un campo de datos de tipo String llamado color que especifica el color del
    ventilador (el valor predeterminado es azul). */
    String color = "azul"; //esta en default o package

    //Metodos
    /* Los métodos de acceso y mutador para los cuatro campos de datos. */
    public int getSpeed(){
        return speed;
    }
    public boolean getOn(){
        return on;
    }
    public double getRadio(){
        return radio;
    }
    public String getColor(){
        return color;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public void setColor(String color){
        this.color = color;
    }
    /* Un constructor sin argumentos que crea un ventilador predeterminado. */
    public Ventilador(){
    }
        /*
         Un método llamado toString() que devuelve string con la descripción del ventilador.
        Si el ventilador está encendido, el método devuelve la velocidad, el color y el radio
        del ventilador en un string. Si el ventilador no está encendido, el método devuelve
        el color y el radio del ventilador junto con "el ventilador está apagado" en un string.
        Dibuje el diagrama UML para la clase y luego implemente la clase. Escribe un programa de
        prueba que crea dos objetos ventilador. Asignar velocidad máxima, radio 10, color amarillo
        y enciéndalo en el primer objeto. Asignar velocidad media, radio 5, color azul y apáguelo en
        el segundo objeto. Muestre los objetos invocando sus método toString().  */
    public String toString(){
        if (on){
            return "Velocidad: "+getSpeed()+" color: "+getColor()+" radio: "+getRadio();
        }
        else{
            return "Color: "+getColor()+" radio: "+getRadio()+" y El ventilador esta apagado.";
        }
    }
}
public class Ejercicio4 {
    public static void main(String[] args){
        /*Escribe un programa de prueba que crea dos objetos ventilador. Asignar velocidad máxima, radio 10, color amarillo
        y enciéndalo en el primer objeto. Asignar velocidad media, radio 5, color azul y apáguelo en
        el segundo objeto. Muestre los objetos invocando sus método toString(). */

        Ventilador ventilador1 = new Ventilador();
        ventilador1.setSpeed(Ventilador.FAST);
        ventilador1.setRadio(10);
        ventilador1.setColor("amarillo");
        ventilador1.setOn(true);

        Ventilador ventilador2 = new Ventilador();
        ventilador2.setSpeed(Ventilador.MEDIUM);
        ventilador2.setRadio(5);
        ventilador2.setColor("azul");
        ventilador2.setOn(false);

        System.out.println(ventilador1.toString());
        System.out.println(ventilador2.toString());

    }
    
}
