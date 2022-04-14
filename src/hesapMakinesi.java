import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz: ");
        n1 = input.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.println("1- Toplama\n2- Cikarma\n3- Carpma\n4- Bolme");
        System.out.print("Seciminiz: ");
        select = input.nextInt();

        if (select == 1){
            System.out.println("Toplam: " + (n1 + n2));
        }
        else if (select == 2) {
            System.out.println("Fark: " + (n1 - n2));
        }
        else if (select == 3) {
            System.out.println("Carpim: " + (n1 * n2));
        }
        else if (select == 4) {
            if (n2 != 0) {
                System.out.println("Bolum: " + (n1 / n2));
            }
            else{
                System.out.println("Bir sayi 0'a bolunemez.");
            }
        }
        else{
            System.out.println("Yanlis secim yaptiniz.Tekrar deneyiniz.");
        }


    }
}