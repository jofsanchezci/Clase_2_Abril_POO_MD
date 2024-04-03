public class Main {
 
  // Create a fullThrottle() method
  public void fullAceleracion() {
    System.out.println("¡El caro va tan rápido como puede!");
  }

  // 
  public void velocidad(int maxSpeed) {
    System.out.println("La velocidad máxima es: " + maxSpeed);
  }

  // Dentro de main, llama a los métodos del objeto myCar
  public static void main(String[] args) {
    Main myCar = new Main();   // Crear un objeto myCar
    myCar.fullAceleracion();      // Invocar metodos
    myCar.velocidad(500);         
  }
}