
package calculadoraPrueba;

public class division extends operacion{
    
    double div = 0;
       
    public division(double num1, double num2) {
             
        super(num1, num2, '/');
        if(num2==0) System.out.println("No se puede dividir entre cero");
        else this.div = num1 / num2;
        this.setResultado(this.div);
    }    
}
