import java.util.Scanner;

public class SomaCargas {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    // acumuladora
    double total = 0.0;
    // contadora
    int cargas = 0;
    double peso;

    while (total < 5000) {
      System.out.print("Peso: ");
      peso = entrada.nextDouble();
      total += peso; // total = total + peso;
      cargas++; // cargas = cargas + 1;
    }

    System.out.printf("Total de cargas: %d %n", cargas);
    entrada.close();
  }
}
