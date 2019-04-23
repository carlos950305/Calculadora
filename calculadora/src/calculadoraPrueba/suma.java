
package calculadoraPrueba;

public class suma extends operacion{
    
    double suma;
       
    public suma(double num1, double num2) {
             
        super(num1, num2, '+');
        this.suma = num1 + num2;
        this.setResultado(this.suma);
    }
}
