/*
6.Escreva um programa que exiba uma tabuada do 1 ao 9, de acordo com o seguinte formato 
(utilize instruções de repetição para elaboração da tabuada):

 * |  1  2  3  4  5  6  7  8  9
-------------------------------
 1 |  1  2  3  4  5  6  7  8  9
 2 |  2  4  6  8 10 12 14 16 18
 3 |  3  6  9 12 15 18 21 24 27
 4 |  4  8 12 16 20 24 28 32 36
 5 |  5 10 15 20 25 30 35 40 45
 6 |  6 12 18 24 30 36 42 48 54
 7 |  7 14 21 28 35 42 49 56 63
 8 |  8 16 24 32 40 48 56 64 72
 9 |  9 18 27 36 45 54 63 72 81

 */
package ADO_01;
//@Monteiro

public class Exercicio_06 {

    public static void main(String[] args) {
        int[][] tab = new int[9][9];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (i + 1) * (j + 1);
            }
        }

        mostrarTabuada(tab);
    }

    static void mostrarTabuada(int[][] tab) {
        System.out.println("   |  1   2   3   4   5   6   7   8   9");
        System.out.println("---------------------------------------");
        System.out.println("1  |  " + tab[0][0] + "   " + tab[0][1] + "   " + tab[0][2] + "   " + tab[0][3] + "   " + tab[0][4] + "   " + tab[0][5] + "   " + tab[0][6] + "   " + tab[0][7] + "   " + tab[0][8]);
        System.out.println("2  |  " + tab[1][0] + "   " + tab[1][1] + "   " + tab[1][2] + "   " + tab[1][3] + "  " + tab[1][4] + "  " + tab[1][5] + "  " + tab[1][6] + "  " + tab[1][7] + "  " + tab[1][8]);
        System.out.println("3  |  " + tab[2][0] + "   " + tab[2][1] + "   " + tab[2][2] + "  " + tab[2][3] + "  " + tab[2][4] + "  " + tab[2][5] + "  " + tab[2][6] + "  " + tab[2][7] + "  " + tab[2][8]);
        System.out.println("4  |  " + tab[3][0] + "   " + tab[3][1] + "  " + tab[3][2] + "  " + tab[3][3] + "  " + tab[3][4] + "  " + tab[3][5] + "  " + tab[3][6] + "  " + tab[3][7] + "  " + tab[3][8]);
        System.out.println("5  |  " + tab[4][0] + "  " + tab[4][1] + "  " + tab[4][2] + "  " + tab[4][3] + "  " + tab[4][4] + "  " + tab[4][5] + "  " + tab[4][6] + "  " + tab[4][7] + "  " + tab[4][8]);
        System.out.println("6  |  " + tab[5][0] + "  " + tab[5][1] + "  " + tab[5][2] + "  " + tab[5][3] + "  " + tab[5][4] + "  " + tab[5][5] + "  " + tab[5][6] + "  " + tab[5][7] + "  " + tab[5][8]);
        System.out.println("7  |  " + tab[6][0] + "  " + tab[6][1] + "  " + tab[6][2] + "  " + tab[6][3] + "  " + tab[6][4] + "  " + tab[6][5] + "  " + tab[6][6] + "  " + tab[6][7] + "  " + tab[6][8]);
        System.out.println("8  |  " + tab[7][0] + "  " + tab[7][1] + "  " + tab[7][2] + "  " + tab[7][3] + "  " + tab[7][4] + "  " + tab[7][5] + "  " + tab[7][6] + "  " + tab[7][7] + "  " + tab[7][8]);
        System.out.println("9  |  " + tab[8][0] + "  " + tab[8][1] + "  " + tab[8][2] + "  " + tab[8][3] + "  " + tab[8][4] + "  " + tab[8][5] + "  " + tab[8][6] + "  " + tab[8][7] + "  " + tab[8][8]);
    }
}
