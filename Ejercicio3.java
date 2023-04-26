/*
Dibuje el diagrama UML para la clase y luego implemente la clase. (Pista: El método
getInteresMensual() es devolver el interés mensual, no la tasa de interés. El interés mensual
es el saldo * tasaInteresMensual. La tasaInteresMensual es la tasa de interés anual / 12.
Tenga en cuenta que la tasa de interés anual es un porcentaje, por ejemplo, como 4.5%.
Necesitas dividirlo por 100).
 */
import java.time.LocalDate;
class Cuenta{
    private int id = 0;
    private int saldo = 0;
    private double tasaInteresAnual = 0;
    private LocalDate fechaCreacion;

    //Constructores
    public Cuenta(){
    }
    public Cuenta(int id, int saldo){
        this.id = id;
        this.saldo = saldo;
        fechaCreacion = LocalDate.now();
    }
    //Get's atributos de instancias
    public int getId(){
        return id;
    }
    public int getSaldo(){
        return saldo;
    }
    public double getTasaInteresAnual(){
        return tasaInteresAnual;
    }
    public LocalDate getFechaCreacion(){
        return fechaCreacion;
    }
    //Set's atributos de instancias
    public void setId(int id){
        this.id = id;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public void setTasaInteresAnual(double tasaInteresAnual){
        this.tasaInteresAnual = tasaInteresAnual;
    }
    //Metodos de calculo
    public double getTasaInteresMensual(){
        return ((getTasaInteresAnual()/100)/12)*100;
    }
    public double getInteresMensual(){
        return ((getTasaInteresMensual()/100)*getSaldo())*100;
    }
    public void retiro(int cantidadRetiro){
        if (cantidadRetiro<=getSaldo())
            setSaldo(getSaldo()-cantidadRetiro);
    }
    public void deposito(int cantidadDeposito){
        setSaldo(getSaldo()+cantidadDeposito);
    }
}
public class Ejercicio3 {
    public static void main(String[] args){
        //Creacion de la cuenta
        Cuenta cuenta = new Cuenta(1122, 20000);
        cuenta.setTasaInteresAnual(4.5);

        cuenta.retiro(2500);
        cuenta.deposito(3000);
        System.out.println("El saldo es "+cuenta.getSaldo()+", el interes mensual es "+cuenta.getInteresMensual()+
        " y la fecha de creacion de la cuenta fue el "+cuenta.getFechaCreacion());
        /*Escriba un programa de prueba que cree un objeto Cuenta con un ID de cuenta de 1122, un
        saldo de $ 20,000 y una tasa de interés anual del 4.5%. Utilice el método retiro para retirar
        $ 2,500, use el método de depósito para depositar $ 3,000 e imprima el saldo, el interés
        mensual y la fecha en que se creó esta cuenta.  */
        
        //https://gitmind.com/app/docs/fe0wu9j4
    }
}
