import java.util.Scanner;

public class LojaVirtual {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    double[] precos = new double[6];
    double[] precosComDesconto = new double[6];

    // leitura dos preços originais
    for (int i = 0; i < precos.length; i++) {
      System.out.printf("Preço %d: ", (i + 1));
      precos[i] = entrada.nextDouble();
    }

    // computar o vetor de desconto
    for (int i = 0; i < precos.length; i++) {
      precosComDesconto[i] = precos[i] * 0.90;
    }

    // apresenta dos precos
    for (int i = 0; i < precos.length; i++) {
      System.out.printf("Produto %d: R$ %.2f -> R$ %.2f%n", i + 1, 
        precos[i], precosComDesconto[i]);
    } 
  
    entrada.close();
  }
}
