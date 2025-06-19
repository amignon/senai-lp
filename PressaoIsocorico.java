import java.util.Scanner;
public class PressaoIsocorico {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // dados de entrada
    System.out.print("Pressão P1: ");
    double p1 = entrada.nextDouble();
    System.out.print("Temperatura T1: ");
    double t1 = entrada.nextDouble();
    System.out.print("Delta T: ");
    double deltaT = entrada.nextDouble();

    // processamento dos dados
    double t2 = t1 - deltaT;
    double p2 = p1 * (t2 / t1);

    // saída de dados
    System.out.printf("Pressão P2 = %.2f%n", p2);
    entrada.close();
  }
}
