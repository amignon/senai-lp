import java.util.Scanner;

public class MatrizTransposta {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    int[][] matriz = new int[3][2];
    int[][] transposta = new int[matriz[0].length][matriz.length];

    // popula a matriz
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.printf("M[%d][%d]: ", i, j);
        matriz[i][j] = entrada.nextInt();
      }
    }

    // gera a tranposta a partir da matriz original
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        transposta[j][i] = matriz[i][j];
      }
    }

    // apresenta a matriz
    System.out.println("=== Matriz Original ===");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.printf("%d ", matriz[i][j]);
      }
      System.out.println();
    }

    // apresenta a transposta
    System.out.println("=== Matriz Transposta ===");
    for (int i = 0; i < transposta.length; i++) {
      for (int j = 0; j < transposta[i].length; j++) {
        System.out.printf("%d ", transposta[i][j]);
      }
      System.out.println();
    }
  
    entrada.close();
  }
}
