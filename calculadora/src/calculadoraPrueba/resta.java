
package calculadoraPrueba;

public class resta extends operacion{
    
    double resta;
       
    public resta(double num1, double num2) {
             
        super(num1, num2, '-');
        this.resta = num1 - num2;
        this.setResultado(this.resta);
    }
}