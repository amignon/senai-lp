import java.util.Scanner;

public class Locadora {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    final double DIARIA = 90.0;

    System.out.print("Dias de aluguel: ");
    int dias = entrada.nextInt();
    System.out.print("É membro fidelidade (s/n): ");
    String membro = entrada.next();
    System.out.print("Idade do cliente: ");
    int idade = entrada.nextInt();

    double total = DIARIA * dias;
    if (membro.equalsIgnoreCase("s")) {
      total = total * 0.95;
      if (idade >= 60) {
        total = total * 0.90;
      }
    }

    System.out.printf("Total a pagar: R$ %.2f%n", total);
  
    entrada.close();
  }
}
