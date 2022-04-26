import java.util.Scanner;
public class asalSayiBulanProgram {

    static void prime(int number) {
        Scanner input = new Scanner(System.in);
        int dongu = 0;
        for (int i = 2; i <= number; i++) {
            int durum = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    durum = 1;
                    break;
                }
            }
            if (durum == 0) {
                System.out.print(i + " ");
                dongu++;
            }
        }
    }

        public static void main (String[]args){
            prime(90);
        }
    }
