import java.util.Scanner;

public class AreaTerreno {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Largura: ");
    double largura = entrada.nextDouble();

    System.out.print("Comprimento: ");
    double comprimento = entrada.nextDouble();

    double area = largura * comprimento;

    System.out.println("Área = " + area);

    entrada.close();
  }
}
