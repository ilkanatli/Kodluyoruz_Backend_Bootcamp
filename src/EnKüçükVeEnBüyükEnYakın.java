import java.util.Scanner;
import java.util.Arrays;
public class EnKüçükVeEnBüyükEnYakın {
    public static void main(String[] args) {
        // Dizi : {15,12,788,1,-1,-778,2,0}
        //Girilen Sayı : 5
        //Girilen sayıdan küçük en yakın sayı : 2
        //Girilen sayıdan büyük en yakın sayı : 12
        int [] dizi = {15, 12, 788, 1, -1, -778, 2 ,0};
        Arrays.sort(dizi);
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayi: ");
        int n = input.nextInt();
        int min = 0;
        int max = 0;
        for (int i : dizi) {
            if (i < n) {
                min = i;
            }
            if (i > n) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi: " + min);
        System.out.println("Girilen sayidan buyuk en yakin sayi: " + max);
    }
}
