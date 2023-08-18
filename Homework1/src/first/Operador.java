
package first;
/* 1. Crear la clase ejecutable “Operador”, que contenga el método main(). En él declarar las variables a y b de tipo
entero. Inicializarlas con los valores 8 y 3 respectivamente. Realizar y mostrar por pantalla las siguientes
operaciones aritméticas: suma, resta, multiplicación, división y resto. */
public class Operador {
    public static void main(String[] args) throws Exception {
        int a=8,b=3;    
        Calculator calculator = new Calculator();
        calculator.addTwoNumbers(a, b);
        calculator.subtractTwoNumbers(a, b);
        calculator.multiplyTwoNumbers(a, b);
        calculator.divideTwoNumbers(a, b);
        calculator.restOfTwoNumbers(a, b);
    }
}


