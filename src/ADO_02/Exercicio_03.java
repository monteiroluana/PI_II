/*
3.Faça um programa Java Desktop que calcule a média entre três valores e exiba o resultado;
 */
package ADO_02;
//@Monteiro

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Exercicio_03 {

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
        frame.setTitle("Exercicio 03");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        //NOTA 1
        JLabel lblN1 = new JLabel("Nota 1");
        panel.add(lblN1);
        JTextField txtN1 = new JTextField(5);
        panel.add(txtN1);

        //NOTA 2
        JLabel lblN2 = new JLabel("Nota 2");
        panel.add(lblN2);
        JTextField txtN2 = new JTextField(5);
        panel.add(txtN2);

        //NOTA 3
        JLabel lblN3 = new JLabel("Nota 3");
        panel.add(lblN3);
        JTextField txtN3 = new JTextField(5);
        panel.add(txtN3);

        //BOTÂO CALCULAR
        JButton btnCalc = new JButton("Calcular");
        btnCalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //Calculando a Média
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int n3 = Integer.parseInt(txtN3.getText());

                int media = (n1 + n2 + n3) / 3;

                //Apresentando a média
                JOptionPane.showMessageDialog(panel, "Média das Notas\n\nMédia= " + media);
                System.exit(0);
            }
        });

        panel.add(btnCalc);

        frame.pack();
        frame.setVisible(true);

    }
}
