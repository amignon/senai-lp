import java.util.Scanner;

public class PrioridadeManutencao {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // entrada de dados
    System.out.print("Horas: ");
    int horas = entrada.nextInt();
    System.out.print("Vibração: ");
    double vibracao = entrada.nextDouble();
    System.out.print("Temperatura: ");
    double temperatura = entrada.nextDouble();

    // saída de dados
    if (horas >= 4000 && (vibracao > 4.0 || temperatura > 85)) {
      System.out.println("Alta prioridade");
    }
    else {
      System.out.print("Baixa prioridade");
    }
  
    entrada.close();
  }
}
