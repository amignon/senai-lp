import java.util.Scanner;
public class EnchimentoReservatorio {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // entrada de dados
    System.out.print("Vazão Volumétrica: ");
    double q = entrada.nextDouble();
    System.out.print("Diâmetro: ");
    double d = entrada.nextDouble();
    System.out.print("Altura: ");
    double h = entrada.nextDouble();

    // processamento
    double volumeMax = Math.PI * Math.pow(d / 2, 2) * h;
    double volumeAlvo = 0.85 * volumeMax;
    double t = volumeAlvo / q;

    // saída de dados
    System.out.printf("Volume alvo: %.2f%n", volumeAlvo);
    System.out.printf("Tempo de enchimento: %.2f%n", t);

    entrada.close();
  }
}
