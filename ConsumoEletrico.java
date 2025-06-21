import java.util.Scanner;

public class ConsumoEletrico {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[] consumos = new int[10];
    int totalAnomalias = 0;

    // leitura dos consumos
    for (int i = 0; i < consumos.length; i++) {
      System.out.printf("Consumo %d: ", (i + 1));
      consumos[i] = entrada.nextInt();
    }

    // processamento dos consumos
    System.out.println("Setores com consumo anômalo");
    for (int valor : consumos) {
      if (valor > 5000) {
        System.out.printf("%d kWh%n", valor);
        totalAnomalias++;
      }
    }
    System.out.printf("Total de setores com consumo anômalo: %d%n", totalAnomalias);
  
    entrada.close();
  }
}
