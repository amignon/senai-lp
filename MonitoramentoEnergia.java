import java.util.Scanner;

public class MonitoramentoEnergia {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    int leituras = 0;
    int picos = 0;
    double consumo;

    while (leituras < 20 && picos < 5) {
      System.out.print("Consumo: ");
      consumo = entrada.nextDouble();
      leituras++;
      if (consumo > 800) {
        picos++;
        System.out.println("Pico de consumo detectado!");
      }
    }

    System.out.printf("Leituras: %d%n", leituras);
    System.out.printf("Picos: %d%n", picos);
    entrada.close();
  }
}
