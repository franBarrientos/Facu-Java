package third;
/* 3. Crear una clase ejecutable denominada “Circunferencia”, en la que se calcule el perímetro de una
circunferencia, ingresando el radio de tipo entero a través del argumento del main(). */

public class Circunferencia {

    public static final double pi = 3.14;
    public static void main(int radio) throws Exception {
        System.out.println("El perímetro de una circunferencia de radio "+ radio + " es " + calculatePerimetroWithRadio(radio));
    }

    public static double calculatePerimetroWithRadio(int radio){
        return (radio * 2) * pi; 
    }
}

