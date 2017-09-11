/*
4.Construa um programa Java Desktop que permita o registro da coleção de jogos do usuário. 
O programa deverá permitir que o usuário digite o nome de cada jogo e exibir a lista 
de jogos cadastrados sempre que o usuário desejar (utilize botões separados para cadastro 
e exibição de itens cadastrados);
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

public class Exercicio_04 {

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
        frame.setMinimumSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Exercicio 04");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        String[] nomeJogo = new String[10];

        //Nome do Jogo
        JLabel lblJogo = new JLabel("JOGO");
        panel.add(lblJogo);
        JTextField txtJogo = new JTextField(20);
        panel.add(txtJogo);

        //BOTÂO MOSTRAR
        JButton btnView = new JButton("Mostrar");
        btnView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (nomeJogo[0] == null) {
                    JOptionPane.showMessageDialog(panel, "LISTA VAZIA");
                } else {
                    JOptionPane.showMessageDialog(panel, nomeJogo);
                }
            }
        });
        panel.add(btnView);

        //BOTÂO CADASTRAR
        JButton btnCadastro = new JButton("Cadastrar");
        btnCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < nomeJogo.length; i++) {
                    if (nomeJogo[i] == null) {
                        nomeJogo[i] = txtJogo.getText();
                        JOptionPane.showMessageDialog(panel, "NOME ADICIONADO");
                        break;
                    }
                }
            }
        });
        panel.add(btnCadastro);

        frame.pack();
        frame.setVisible(true);

    }
}
