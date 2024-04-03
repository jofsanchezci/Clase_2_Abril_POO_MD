public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Los métodos estáticos pueden invocarse sin crear objetos");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Los métodos públicos deben ser invocados mediante la creación de objetos");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod();
    

    Main myObj = new Main(); 
    myObj.myPublicMethod();
  }
}