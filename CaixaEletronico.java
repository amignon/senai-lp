import java.util.Scanner;

public class CaixaEletronico {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    int[] cedulas = new int[3];
    System.out.print("Valor: ");
    int valor = entrada.nextInt();

    if (valor % 10 == 0) {
      cedulas[0] = valor / 50;
      valor = valor % 50;
      cedulas[1] = valor / 20;
      valor = valor % 20;
      cedulas[2] = valor / 10;

      System.out.println("Distribuição das cédulas");
      System.out.printf("R$ 50: %d%n", cedulas[0]);
      System.out.printf("R$ 20: %d%n", cedulas[1]);
      System.out.printf("R$ 10: %d%n", cedulas[2]);
    }
    else {
      System.out.println("Valor inválido!");
    }
  
    entrada.close();
  }
}
