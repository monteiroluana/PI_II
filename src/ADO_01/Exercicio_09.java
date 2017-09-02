/*
9.Escreva um programa que questione ao usuário as duas aulas que ele terá a cada dia da semana. 
Em seguida, permita que o usuário consulte quais aulas terá em determinado dia da semana 
ou imprima as aulas de todos os dias da semana. O programa só deverá ser encerrado quando 
o usuário digitar “sair”, a qualquer momento.
 */
package ADO_01;
//@Monteiro

import java.util.Scanner;

public class Exercicio_09 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] aulas = new String[5][2];
        aulas = lerAulas(aulas);
        boolean acao;

        do {
            acao = consultaAula(aulas);
        } while (!acao);
    }

    static String[][] lerAulas(String[][] aulas) {
        System.out.println("Insira as duas aulas que você terá a cada dia da semana");
        for (int i = 0; i < aulas.length; i++) {
            for (int j = 0; j < aulas[i].length; j++) {
                System.out.print((i + 1) + "ª semana   aula[" + (j + 1) + "]: ");
                aulas[i][j] = console.next();
            }

        }
        return aulas;
    }

    static boolean consultaAula(String[][] aulas) {
        boolean sair = false;

        System.out.println("\nDigite o dia da semana para saber as aulas que vc terá nesse dia");
        System.out.println("1 - para segunda-feira");
        System.out.println("2 - para terça-feira");
        System.out.println("3 - para quarta-feira");
        System.out.println("4 - para quinta-feira");
        System.out.println("5 - para sexta-feira");
        System.out.println("0 - sair");
        System.out.print("Opção: ");
        int semana = console.nextInt();
        System.out.println("");

        if (semana == 0) {
            System.out.println("TCHAUUUU");
            sair = true;
        } else {
            for (int i = 0; i < aulas.length; i++) {
                for (int j = 0; j < aulas[i].length; j++) {
                    if (semana == (i + 1)) {
                        System.out.println("~~ aula[" + (j +1 ) + "]: " + aulas[i][j]+" ~~");
                    }
                }
            }
            sair = false;
        }
        return sair;
    }
}
