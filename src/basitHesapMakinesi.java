import java.util.Scanner;
public class basitHesapMakinesi {
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

        switch (select){
            case 1:
                System.out.print("toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.print("fark: " + (n1 - n2));
                break;
            case 3:
                System.out.print("carpim: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0){
                    System.out.print("bolum: " + (n1 / n2));
                }
                else {
                    System.out.print("Bir sayi 0'a bolunemez.");
                }
                break;
            default:
                System.out.print("Hatali secim yaptiniz. Tekrar deneyiniz. ");
                break;
        }
    }
}
