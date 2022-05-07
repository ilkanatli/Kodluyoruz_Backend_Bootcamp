import java.util.Scanner;
public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int row, col;

        System.out.print("Dizinizin satir sayisini giriniz : ");
        row = inp.nextInt();
        System.out.print("Dizinizin sutun sayisini giriniz : ");
        col = inp.nextInt();

        int[][] matris = new int[row][col];
        int[][] transpoz = new int[col][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("Dizinizin " + (i + 1) + ". degerini giriniz : ");
                matris[i][j] = inp.nextInt();
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                transpoz[j][i] = matris[i][j];
            }
        }

        for(int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}