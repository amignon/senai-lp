import java.util.Scanner;

public class ControleQualidadeParafusos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    System.out.print("Lotes: ");
    int l = entrada.nextInt();
    System.out.print("Peças: ");
    int p = entrada.nextInt();

    int[][] inspecao = new int[l][p];
    // popula a matriz de inspeção
    for (int i = 0; i < inspecao.length; i++) {
      System.out.printf("Lote %d%n", i);
      for (int j = 0; j < inspecao[i].length; j++) {
        System.out.printf("Peça %d: ", j);
        inspecao[i][j] = entrada.nextInt();
      }
    }

    //  processamento e apresentação da matriz
    int totalDefeituosas = 0;
    int maxDefeitosLote = -1;
    int loteComMaisDefeitos = -1;
    System.out.println("=== Matriz de Inspeção ===");
    for (int i = 0; i < inspecao.length; i++) {
      int defeitosLote = 0;
      for (int j = 0; j < inspecao[i].length; j++) {
        System.out.printf("%d ", inspecao[i][j]);
        if (inspecao[i][j] == 1) {
          totalDefeituosas++;
          defeitosLote++;
        }
      }
      System.out.println();
      if (defeitosLote > maxDefeitosLote) {
        maxDefeitosLote = defeitosLote;
        loteComMaisDefeitos = i;
      }
    }

    if (totalDefeituosas > 0) {
      System.out.printf("Total de peças defeituosas: %d%n", totalDefeituosas);
      System.out.printf("Lote com mais defeitos: %d", loteComMaisDefeitos);
      System.out.printf(" (com %d defeitos)%n", maxDefeitosLote);
    }
    else {
      System.out.println("Nenhuma peça defeituosa encontrada.");
    }
  
    entrada.close();
  }
}
