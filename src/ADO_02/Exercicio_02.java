/*
2.Elabore um programa Java Desktop onde o usuário possa tentar adivinhar um número com um limite 
de tentativas. Se o limite for excedido, o programa é encerrado (utilize o comando 
System.exit(0) para finalizar a aplicação). O número pode ser fixo ou aleatório;
 */
package ADO_02;
//@Monteiro

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Exercicio_02 {

    public static void main(String[] args) {
        Runnable thread = new Runnable() {

            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }

    public static void criarGUI() {

        Random aleatorio = new Random();
        int adivinha = aleatorio.nextInt(6);

        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(400, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Exercicio 02");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        JOptionPane.showMessageDialog(panel, "Advinhe um número entre 1 e 5");

        //NÚMERO
        JLabel lblTent = new JLabel("Número");
        panel.add(lblTent);
        JTextField txtNumero = new JTextField(5);
        panel.add(txtNumero);

        
        //BOTÃO TESTAR
        JButton btnTestar = new JButton("Tentar");
        btnTestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tentativa = txtNumero.getText();
                int num = Integer.parseInt(tentativa);

                if (num == adivinha) {
                    JOptionPane.showMessageDialog(panel, "Parabêns você acertou");
                } else {
                    JOptionPane.showMessageDialog(panel, "Não foi dessa vez");
                }
                
                System.exit(0);
            }
        });
        panel.add(btnTestar);

        frame.pack();
        frame.setVisible(true);

    }
}
