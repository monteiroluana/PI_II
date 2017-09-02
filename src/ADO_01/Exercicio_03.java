/*
3.Construa um programa que escreva por extenso um número digitado pelo usuário
(ou seja, se o usuário digitar “9”, deverá ser exibido no console “NOVE”). 
O programa deve escrever os números por extenso de 0 a 9 e, caso o número seja 
negativo ou tenha mais de uma casa decimal (maior que 9), mostrar uma mensagem de erro. 
O código que efetua a leitura e a validação dos valores e o código que obtém o valor 
por extenso devem ser separados em métodos diferentes.
 */
package ADO_01;
//@Monteiro

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {
        int num = lerNumero();
        boolean valida = validarNum(num);

        if (valida) {
            exubirExtenso(num);
        } else {
            System.out.println("Valor inválido");
        }
    }

    static int lerNumero() {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 9");
        System.out.print("Número: ");
        int num = console.nextInt();

        return num;
    }

    static boolean validarNum(int num) {
        boolean valida;
        if (num >= 0 && num <= 9) {
            valida = true;
        } else {
            valida = false;
        }
        return valida;
    }

    static void exubirExtenso(int num) {
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            case 4:
                System.out.println("quatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("sete");
                break;
            case 8:
                System.out.println("oito");
                break;
            case 9:
                System.out.println("nove");
                break;

        }

    }
}
