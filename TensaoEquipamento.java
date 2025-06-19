import java.util.Scanner;

public class TensaoEquipamento {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    System.out.print("Tensão (v): ");
    double v = entrada.nextDouble();

    if (v >= 220 && v <= 240) {
      double p = v * 5.0;
      System.out.printf("Potência = %.1f W %n", p);
    }
    else {
      double percentual = Math.abs(v - 230) / 230 * 100;
      System.out.printf("Corrigir a tensão em %.1f %% %n", percentual);
    }
  
    entrada.close();
  }
}
