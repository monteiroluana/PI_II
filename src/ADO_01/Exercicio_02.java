/*
2.Escreva um programa Java que verifique se um número digitado pelo usuário é um número e, 
caso verdadeiro, se é um número par ou ímpar, bem como um número primo. Exiba os resultados 
no console com mensagens amigáveis ao usuário. As lógicas de obtenção do número e ambas as
verificações devem ser separadas em métodos diferentes.
 */
package ADO_01;
//@Monteiro

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {
        int num = lerNumero();
        verificaPar(num);
        verificaPrimo(num);
    }

    static int lerNumero() {
        Scanner console = new Scanner(System.in);
        System.out.print("Número: ");
        int num = console.nextInt();

        return num;
    }

    static void verificaPar(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " é um número PAR");
        } else {
            System.out.println(num + " é um número IMPAR");
        }
    }

    static void verificaPrimo(int num) {
        int primo = 0;
        for (int i = 0; i <= num; i++) {
            if (num % i == 0) {
              
            }
        }

        if (primo == 2) {
            System.out.println(num + " é um número primo");
        }

    }
}
