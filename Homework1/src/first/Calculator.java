package first;

public class Calculator {

    public Calculator() {
    }

    public void addTwoNumbers(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void subtractTwoNumbers(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public void multiplyTwoNumbers(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public void divideTwoNumbers(int a, int b) {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    public void restOfTwoNumbers(int a, int b) {
        System.out.println(a + " % " + b + " = " + (a % b));
    }

}