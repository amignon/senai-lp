import java.util.Scanner;

public class AreaTerreno {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // entrada de dados
    System.out.print("Largura: ");
    double largura = entrada.nextDouble();

    System.out.print("Comprimento: ");
    double comprimento = entrada.nextDouble();

    // processamento
    double area = largura * comprimento;

    // saida de dados
    System.out.println("Área de terreno = " + area);

    entrada.close();
  }
}
