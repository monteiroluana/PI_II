/*
4.Elabore um programa que solicite 5 números do usuário utilizando alguma forma de repetição 
(while, do...while ou for). Em seguida, calcule a média aritmética do valor e exiba as 
seguintes mensagens de acordo com os critérios abaixo:

a.Se a média for menor que 5, exibir “REPROVADO”
b.Se a média for maior ou igual a 5 e menor que 9, exibir “APROVADO”
c.Se a média for 9, exibir “PARABÉNS”
d.Se a média for 10, exibir “MASTER OF THE UNIVERSE”

 */
package ADO_01;
//@Montiro

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {
        float[] notas = new float[5];
        
        notas = lerNotas(notas);
        float media = calcularMedia(notas);
        exibirMensagem(media);
    }

    static float[] lerNotas(float[] notas) {
        Scanner console = new Scanner(System.in);
        ;

        System.out.println("INSIRA AS NOTAS");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("nota[" + (i+1) + "]: ");
            notas[i] = console.nextInt();
        }
        return notas;
    }

    static float calcularMedia(float[] notas) {
        float soma = 0;
        float media;

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        media = soma / notas.length;
        return media;
    }

    static void exibirMensagem(float media) {
        if (media < 5) {
            System.out.println("REPROVADO");
        } else if (media >= 5 && media < 9) {
            System.out.println("APROVADO");
        } else if (media == 9) {
            System.out.println("PARABÉNS");
        } else if (media == 10) {
            System.out.println("MASTER OF THE UNIVERSE");
        }
    }
}
