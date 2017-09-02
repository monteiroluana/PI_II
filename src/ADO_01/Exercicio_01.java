/*
1.Escreva um programa que leia um número decimal do usuário. Após a leitura, 
verifique se o número é maior ou igual a 50,0. Caso verdadeiro, mostre a mensagem “SUCESSO”. 
Caso falso, mostre a mensagem “ERRO”. Após a verificação, saia do programa emitindo 
a mensagem “FIM DO PROGRAMA”, independentemente do resultado. Construa o programa de forma 
que os métodos de leitura e verificação fiquem separados do método principal da aplicação.
 */
package ADO_01;
//@Monteiro

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        int numero = lerNumero();
        verificaNum(numero);
        System.out.println("Fim do programa");
    }

    static int lerNumero() {
        Scanner console = new Scanner(System.in);
        System.out.print("Número: ");
        int num = console.nextInt();

        return num;
    }

    static void verificaNum(int num) {

        if (num >= 50) {
            System.out.println("SUCESSO");
        } else {
            System.out.println("ERRO");
        }

    }
}
