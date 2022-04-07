import java.util.Scanner;
public class dikUcgenAlanHesaplama {
    public static void main(String[] args) {
        //Değişkenleri alalım
        int a, b, c;
        double u, alan;

        //Kullanıcıdan verilerimizi alalım
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.Kenari Giriniz: ");
        a = girdi.nextInt();
        System.out.print("2.Kenari Giriniz: ");
        b = girdi.nextInt();
        System.out.print("3.Kenari Giriniz: ");
        c = girdi.nextInt();

        //Üçgenin Çevresi
        u = (a + b + c) / 2;

        System.out.println("Cevre: "+ u);

        //Üçgenin alanı
        alan = Math.sqrt((u - a) * (u - b) * (u - c));

        System.out.print("Alan: "+ alan);

    }
}
