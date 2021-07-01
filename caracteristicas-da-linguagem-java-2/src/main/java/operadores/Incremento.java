package operadores;

public class Incremento {

  public static void main(String[] args) {

    var numero = 1;

//    Increment/decrement on the left side - first increment, then evaluate expression (println)
    System.out.println(++numero);

    var variavel = 10;

//    Increment/decrement on the right side - first evaluate expression (println), then decrement
    System.out.println(variavel--);
    System.out.println(variavel);
  }
}
