import java.util.Scanner;

public class BonusProdutividade {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    // entrada de dados
    System.out.print("Peças: ");
    int qtdePecas = entrada.nextInt();
    System.out.print("Horas: ");
    double horas = entrada.nextDouble();

    // processamento
    double taxa = qtdePecas / horas;
    double bonus = 0.0;

    if (taxa > 180.0) {
      bonus = bonus + 200.0;
    }
    if (taxa > 220.0) {
      bonus = bonus + 150.0;
    }

    // saída de dados
    System.out.printf("Taxa: %.1f%n", taxa);
    System.out.printf("Bônus: %.2f%n", bonus);

    entrada.close();
  }
}
