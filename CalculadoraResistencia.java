import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class CalculadoraResistencia {
  public static void main(String[] args) {

    // Criar a Janela Principal
    JFrame frame = new JFrame("Calculadora de Resistência Equivalente");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 220);
    frame.setLocationRelativeTo(null);

    // Criar o painel
    JPanel painel = new JPanel(new GridLayout(5, 2, 10, 10));
    painel.setBorder(new EmptyBorder(15, 15, 15, 15));

    // componentes
    JLabel lblR1 = new JLabel("Resistor R1 (ohms):");
    JTextField txtR1 = new JTextField();

    JLabel lblR2 = new JLabel("Resistor R2 (ohms):");
    JTextField txtR2 = new JTextField();

    JLabel lblTipo = new JLabel("Tipo de Circuito: ");
    JComboBox<String> comboTipo = new JComboBox<>(new String[]{"Série", "Paralelo"});

    JButton btnCalcular = new JButton("Calcular");
    JButton btnSair = new JButton("Sair");
    
    // adicionar os componentes ao painel
    painel.add(lblR1);
    painel.add(txtR1);
    painel.add(lblR2);
    painel.add(txtR2);
    painel.add(lblTipo);
    painel.add(comboTipo);
    painel.add(btnCalcular);
    painel.add(btnSair);

    // adicionar o painel à janela
    frame.add(painel);
    frame.setVisible(true);

    // ação do botão calcular
    btnCalcular.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double r1 = Double.parseDouble(txtR1.getText());
                double r2 = Double.parseDouble(txtR2.getText());
                String tipo = (String) comboTipo.getSelectedItem();
                double resultado;

                if ("Série".equals(tipo)) {
                    resultado = r1 + r2;
                }
                else {
                    resultado = 1 / (1 / r1 + 1 / r2);
                }
                String mensagem = String.format("A resistência é %.2f ohms.", resultado);
                JOptionPane.showMessageDialog(frame, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Insira valores válidos", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    });

    // ação do botão sair
    btnSair.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
        }
    });
  }
}
