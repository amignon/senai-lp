import java.util.Scanner;

public class ProducaoEmbalagens {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    int total = 0;
    int producao;
    
    System.out.print("Quantidade de dias: ");
    int dias = entrada.nextInt();

    for (int dia = 1; dia <= dias; dia++) {
      System.out.printf("Produção do dia %d: ", dia);
      producao = entrada.nextInt();
      total += producao; // total = total + producao;
    }

    System.out.printf("Total de embalagens: %d%n", total);
    entrada.close();
  }
}
