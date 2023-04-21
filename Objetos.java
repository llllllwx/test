class Empleado {
    String nombre;
    int edad;
    private double salario; //encapsulamos este atributo *solo se puede interactuar con el mediante metodos de instancias*
    static long cantidad = 0;

    //Contructor nulo
    public Empleado(){
        cantidad++;
    }
    //Constructor con parámetros
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre; //El this. se utiliza para que al repetir el nombre del atributo, no de error
        this.edad = edad;
        this.salario = salario;
        cantidad++;
    }
    //Metodo de instancia
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
    //Metodo set y get
    public double getSalario(){
        return salario;
    }
    public void setSalario(double newSalary){
        salario = newSalary;
    }

}
public class Objetos{
    public static void main(String[] args) {
        Empleado empleado2;
        // Crear una nueva instancia de Empleado con el constructor con parámetros
        Empleado empleado1 = new Empleado("Sofia", 27, 2000.50);
        empleado2 = new Empleado("Lara", 26 , 24000);
        empleado1.imprimirInformacion(); System.out.print("\n");
        empleado2.imprimirInformacion();
        }
}
