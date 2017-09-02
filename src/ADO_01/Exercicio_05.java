/*
5.Construa um programa Java que gere um número aleatório (utilizando a classe java.util.Random) 
e peça que o usuário adivinhe o número. O programa deverá ler dados do usuário até que ele 
acerte o número (exibindo uma mensagem de sucesso) ou ele digite “desistir” 
(onde uma mensagem de falha junto ao número que deveria ser adivinhado deverá ser exibida). 
Separe a lógica dos métodos de forma coesa.
 */
package ADO_01;
//@Monteiro

import java.util.Random;
import java.util.Scanner;

public class Exercicio_05 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        Random aleatorio = new Random();
        int adivinha = aleatorio.nextInt(11);

        System.out.println("Adivinhe um número entre 0 e 10");

        for (int i = 0; i < 3; i++) {
            boolean acertou = advinhaNum(adivinha);
            if (acertou) {
                System.out.println("Acertou!");
                break;
            }
            if (i == 2) {
                System.out.println("Vc não acertou o número");
                break;
            } else {
                System.out.println("digite (DESISTIR) para sair");
                String desistir = console.next();
                desistir = desistir.trim().toLowerCase();
                if (desistir.equals("desistir")) {
                    System.out.println("Você desistiu o número era[" + adivinha + "]");
                    i = 4;
                }

            }

        }
    }

    static boolean advinhaNum(int num) {

        System.out.print("Número: ");
        int n = console.nextInt();

        boolean acertou = false;
        if (n == num) {
            acertou = true;
        } else {
            acertou = false;
        }
        return acertou;
    }
}
