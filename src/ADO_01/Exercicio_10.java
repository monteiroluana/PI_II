/*
10.Construa um programa que permita a elaboração de duas matrizes de mesmo 
tamanho (n por n) e, em seguida, exiba e calcule a soma destas matrizes.
 */
package ADO_01;
//@Monteiro

import java.util.Scanner;

public class Exercicio_10 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Qual o tamanho das matrizes (n por n)? ");
        System.out.print("Tamanho: ");
        int size = console.nextInt();

        System.out.println("Matriz A");
        int[][] matrizA = new int[size][size];
        matrizA = lerMatriz(matrizA);

        System.out.println("Matriz B");
        int[][] matrizB = new int[size][size];
        matrizB = lerMatriz(matrizB);

        System.out.println("\nSOMANDO MatrizA e MatrizB");
        int[][] matrizC = new int[size][size];
        matrizC = somarMatrizes(matrizA, matrizB);
        imprimirMatriz(matrizC);
    }

    static int[][] lerMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Número[" + i + "][" + j + "]: ");
                matriz[i][j] = console.nextInt();
            }
        }
        return matriz;
    }

    static int[][] somarMatrizes(int[][] matriz_1, int[][] matriz_2) {
        int t = matriz_1.length;
        int[][] soma = new int[t][t];

        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                soma[i][j] = matriz_1[i][j] + matriz_2[i][j];
            }
        }
        return soma;
    }
    
    static void imprimirMatriz(int[][]matriz){
    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Soma["+1+"]["+j+"]: "+matriz[i][j]);
            }
        }
    
    }
}
