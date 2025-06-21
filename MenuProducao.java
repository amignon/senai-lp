import java.util.Scanner;

public class MenuProducao {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int opcao;
    int producaoDia = 0;
    int totalProduzido = 0;
    int emManutencao = 0;
    final int TOTAL_MAQUINAS = 20;

    do {
      System.out.println("\n=== MENU ===");
      System.out.println("1. Registrar produção diária");
      System.out.println("2. Consultar status das máquinas");
      System.out.println("3. Sair");
      System.out.print("Escolha a opção: ");
      opcao = entrada.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Peças produzidas: ");
          producaoDia = entrada.nextInt();
          totalProduzido += producaoDia;
          System.out.printf("Total acumulado: %d%n", totalProduzido);
          break;
        case 2:
          System.out.print("Máquinas em manutenção: ");
          emManutencao = entrada.nextInt();
          if (emManutencao >= 0 && emManutencao <= 20) {
            double percentual = (emManutencao * 100.0) / TOTAL_MAQUINAS;
            System.out.printf("Máquina em manuntenção: %.1f %% %n", percentual);
          }
          else {
            System.out.println("Número inválido.");
          }
          break;
        case 3:
          System.out.println("Encerrando o sistema. Até logo.");
          break;
        default:
          System.out.println("Opção inválida! Tente novamente.");
      }

    } while (opcao != 3);
    entrada.close();
  }
}
