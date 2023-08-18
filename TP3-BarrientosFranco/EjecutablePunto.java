
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
    punto.mostrar();
    punto.desplazar(
        InputHelper.insertDoubleByKeyboard("Ingrese incremento de la cordenada y: "),
        InputHelper.insertDoubleByKeyboard("Ingrese incremento de la cordenada x: "));
    punto.mostrar();

    Punto punto2 = new Punto(3, 2);
    punto2.mostrar();
    System.out.println(punto.distanciaA(punto2));
  }
}
