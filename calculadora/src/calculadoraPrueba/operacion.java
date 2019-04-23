package calculadoraPrueba;

public class operacion {

    double num1;
    double num2;
    double resultado;
    char operacion;

    public operacion(double num1, double num2, char operacion) {

        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
    }

    public Double mostrarResultado() {

        //System.out.println(this.num1 + " " + this.operacion + " " + this.num2 + " = " + this.resultado);
        return this.resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
}
