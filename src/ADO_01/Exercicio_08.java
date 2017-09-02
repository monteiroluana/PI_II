/*
8.Solicite ao usuário diversos números (pedindo a quantidade de números previamente) e, 
em seguida, localize o maior número digitado entre todos os valores. Ao final, o programa 
deverá exibir em qual “rodada” de digitação o maior número foi digitado.
 */
package ADO_01;
//@Monteiro

import java.util.Scanner;

public class Exercicio_08 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        numeros=lerNumeros(numeros);
        maiorNumero(numeros);
    }

    static int[] lerNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite numero[" + (i + 1) + "]: ");
            numeros[i] = console.nextInt();
        }

        return numeros;
    }

    static void maiorNumero(int[] numeros) {
        int maior = numeros[0];
        int posicao=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicao = i;
            }
        }
        
        System.out.println("maior número foi digitado na ["+(posicao+1)+"º] rodada");
    }
}
