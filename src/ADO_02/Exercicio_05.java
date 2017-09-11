/*
5.Construa um programa Java Desktop que permita realizar operações matemáticas 
(soma, subtração, multiplicação e divisão) entre dois números e exibir o resultado na tela.
 */
package ADO_02;
//@Monteiro

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Exercicio_05 {

    public static void main(String[] args) {
        Runnable thread = new Runnable() {

            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }

    public static void criarGUI() {
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(400, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Exercicio 05");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        //Num 1
        JLabel lblNum1 = new JLabel("Num 1");
        panel.add(lblNum1);
        JTextField txtNum1 = new JTextField(5);
        panel.add(txtNum1);

        //Num 2
        JLabel lblNum2 = new JLabel("Num 2");
        panel.add(lblNum2);
        JTextField txtNum2 = new JTextField(5);
        panel.add(txtNum2);

        //OPÇÃO DE OPERAÇÃO
        JRadioButton rdSoma = new JRadioButton("Soma");
        panel.add(rdSoma);

        JRadioButton rdSub = new JRadioButton("Subtração");
        panel.add(rdSub);

        JRadioButton rdMult = new JRadioButton("Multiplicação");
        panel.add(rdMult);

        JRadioButton rdDiv = new JRadioButton("Divisão");
        panel.add(rdDiv);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rdSoma);
        grupo.add(rdSub);
        grupo.add(rdMult);
        grupo.add(rdDiv);

        //BOTÃO CALCULAR
        JButton btnCalc = new JButton("Calcular");
        btnCalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //Calculando a Média
                int n1 = Integer.parseInt(txtNum1.getText());
                int n2 = Integer.parseInt(txtNum2.getText());
                int calc;

                if (rdSoma.isSelected() == true) {
                    //SOMA
                    calc = n1 + n2;
                    JOptionPane.showMessageDialog(panel, "Resultado = " + calc);
                    

                } else if (rdSub.isSelected() == true) {
                    //SUBTRAÇÃO
                    calc = n1 - n2;
                    JOptionPane.showMessageDialog(panel, "Resultado = " + calc);
                    

                } else if (rdMult.isSelected() == true) {
                    //MULTIPLICAÇÃO
                    calc = n1 * n2;
                    JOptionPane.showMessageDialog(panel, "Resultado = " + calc);
                    

                } else if (rdDiv.isSelected() == true) {
                    //DIVISÃO
                    calc = n1 / n2;
                    JOptionPane.showMessageDialog(panel, "Resultado = " + calc);
                   

                } else {
                    JOptionPane.showMessageDialog(panel, "Opção não selecionada");
                    
                }
            }
        });
        panel.add(btnCalc);

        frame.pack();
        frame.setVisible(true);

    }
}
