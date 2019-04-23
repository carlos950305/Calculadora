package calculadoraPrueba;



public class multiplicacion extends operacion{
    
    double multiplacion;
       
    public multiplicacion(double num1, double num2) {
             
        super(num1, num2, '*');
        this.multiplacion= num1 * num2;
        this.setResultado(this.multiplacion);
    }
}