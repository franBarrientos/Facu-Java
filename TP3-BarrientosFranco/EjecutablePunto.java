
/**
 * Clase que testea la clase Punto
 * 
 * @author Barriento Franco
 * @version v0.01
 */
public class EjecutablePunto {

  /**
   * Ingresa los valores necesarios (usando la clase Helper "InputHelper") para
   * instanciar un objeto Punto, y testea sus metodos publicos de la interfaz
   * 
   * @param args
   */
  public static void main(String[] args) {
    Punto punto = new Punto(
        InputHelper.insertDoubleByKeyboard("Ingrese cordenada y: "),
        InputHelper.insertDoubleByKeyboard("Ingrese cordenada x: "));

    System.out.println(".".repeat(80));
    System.out.println("Primer Punto");
    System.out.println(".".repeat(80));
    punto.mostrar();


    punto.desplazar(
        InputHelper.insertDoubleByKeyboard("Ingrese incremento de la cordenada x: "),
        InputHelper.insertDoubleByKeyboard("Ingrese incremento de la cordenada y: "));

    System.out.println(".".repeat(80));
    System.out.println("Punto luego de desplazar");
    System.out.println(".".repeat(80));
    punto.mostrar();

    Punto punto2 = new Punto(3, 2);
    System.out.println(".".repeat(80));
    System.out.println("Punto 2");
    System.out.println(".".repeat(80));
    punto2.mostrar();

    System.out.println(".".repeat(80));
    System.out.println("Distancia de ambos puntos..."+ punto.distanciaA(punto2));
    System.out.println(".".repeat(80));
  }
}
