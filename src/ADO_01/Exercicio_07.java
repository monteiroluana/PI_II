/*
7.Elabore um programa que calcule a média geral de uma sala. Para isso, solicite ao 
usuário a quantidade de alunos e, em seguida, a média final de cada um deles. 
Ao término, calcule a média da sala e a exiba ao usuário.
 */
package ADO_01;
//@Monteiro

import java.util.Scanner;

public class Exercicio_07 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Quantidade de aulunos: ");
        int qtdAlunos = console.nextInt();

        int[] alunos = new int[qtdAlunos];
        lerMedia(alunos);
        calcularMedia(alunos);
    }

    static int[] lerMedia(int[] alunos) {

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Média aluno[" + (i+1) + "]: ");
            alunos[i] = console.nextInt();
        }
        return alunos;
    }

    static void calcularMedia(int[] notas) {
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }
        int media = soma / notas.length;
        System.out.println(" ~~ Media da Sala: "+media+" ~~");
    }
}
