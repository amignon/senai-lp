import java.util.Scanner;

public class Quadrado {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    System.out.print("Lado: ");
    int lado = entrada.nextInt();

    for (int i = 1; i <= lado; i++) {
      for (int j = 1; j <= lado; j++) {
        if (i == 1 || i == lado || j == 1 || j == lado) {
          System.out.print("*");
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    entrada.close();
  }
}
