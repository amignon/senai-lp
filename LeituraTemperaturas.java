import java.util.Scanner;

public class LeituraTemperaturas {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    int leituras = 0;
    double somaTemperaturas = 0.0;
    
    System.out.print("Temperatura: ");
    double temperatura = entrada.nextDouble();

    while (temperatura != -999) {
      somaTemperaturas += temperatura;
      leituras++;
      System.out.print("Temperatura: ");
      temperatura = entrada.nextDouble();
    }

    if (leituras > 0) {
      double media = somaTemperaturas / leituras;
      System.out.printf("Total de leituras:%d %n", leituras);
      System.out.printf("Média das temperaturas: %.1f %n", media);
    }
    else {
      System.out.println("Nenhuma temperatura foi registrada.");
    }
  
    entrada.close();
  }
}
