import java.util.Scanner;

public class TaxaAmbiental {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    System.out.print("Código do resíduo: ");
    String codigo = entrada.nextLine().toUpperCase();
    boolean codigoValido = true;
    double tarifa = 0.0;

    switch (codigo) {
      case "P":
        tarifa = 0.45;
        break;
      case "M":
        tarifa = 0.60;
        break;
      case "V":
        tarifa = 0.30;
        break;
      case "Q":
        tarifa = 1.20;
        break;
      case "O":
        tarifa = 0.20;
        break;
      default:
        System.out.println("Código inválido!");
        codigoValido = false;
    }

    if (codigoValido) {
      System.out.print("Massa do lote: ");
      double massa = entrada.nextDouble();

      double taxa = massa * tarifa;
      System.out.printf("Taxa a pagar: R$ %.2f %n", taxa);
      if (codigo.equals("Q")) {
        System.out.println("Resíduo químico - transporte especial obrigatório.");
      }
    }
    
    entrada.close();
  }
}
