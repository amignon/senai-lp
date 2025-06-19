import java.util.Scanner;

public class MultaFornecedor {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    System.out.print("Dias de atraso: ");
    int dias = entrada.nextInt();
    
    double multa = 0.0;
    boolean suspenso = false;

    if (dias > 0) {
      if (dias <= 3) {
        multa = dias * 250.00;
      }
      else if (dias <= 7) {
        multa = dias * 600.00;
      }
      else {
        multa = dias * 1500.00;
        suspenso = true;
      }
    }

    System.out.printf("Multa: R$ %.2f %n", multa);
    if (suspenso) {
      System.out.println("Contrato suspenso até regularização da entrega.");
    }
  
    entrada.close();
  }
}
