/*
1.Escreva um programa Java para Desktop que permita o cadastro de dados de um usuário 
(campos nome, endereço e telefone) na memória. Exiba o resultado do cadastro numa caixa de 
diálogo (utilize dois botões, um para salvar os dados, um para exibir os dados salvos);
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

public class Exercicio_01 {

    public static void main(String[] args) {
        Runnable thread = new Runnable() {

            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }

    public static void criarGUI() {
        String[] cadastro = new String[3];

        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Exercicio 01");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        
        //NOME
        JLabel lblNome = new JLabel("Nome");
        panel.add(lblNome);
        JTextField txtNome = new JTextField(10);
        panel.add(txtNome);

        //ENDEREÇO
        JLabel lblEndereco = new JLabel("Endereço");
        panel.add(lblEndereco);
        JTextField txtEndereco = new JTextField(10);
        panel.add(txtEndereco);

        //TELEFONE
        JLabel lblTelefone = new JLabel("Telefone");
        panel.add(lblTelefone);
        JTextField txtTelefone = new JTextField(10);
        panel.add(txtTelefone);

        //BOTÃO MOSTRAR
        JButton btnMostrar = new JButton("Mostrar");
        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cadastro[0] == null) {
                    JOptionPane.showMessageDialog(panel, "Cadastro não foi salvo");
                } else {
                    JOptionPane.showMessageDialog(panel, "Nome: " + cadastro[0] + "\nTelefone: " + cadastro[1] + "\nEndereço: " + cadastro[2]);
                }
            }
        });
        panel.add(btnMostrar);

        //BOTÃO SALVAR
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastro[0] = txtNome.getText();
                cadastro[1] = txtTelefone.getText();
                cadastro[2] = txtEndereco.getText();
                JOptionPane.showMessageDialog(panel, "Cadastro Salvo");
            }
        });

        panel.add(btnSalvar);

        frame.pack();
        frame.setVisible(true);

    }
}
