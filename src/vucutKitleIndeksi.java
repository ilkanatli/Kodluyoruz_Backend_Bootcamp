import java.util.Scanner;
public class vucutKitleIndeksi {
    public static void main(String[] args) {
        //Değişkenleri alalım

        double kilo, boy, vucutKitleIndeksi;

        //Kullanıcıdan verileri alalım

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu(M) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu(KG) giriniz: ");
        kilo = input.nextDoble();

        vucutKitleIndeksi = kilo / (boy * boy);
        System.out.println("Vucut kitle indeksi: " + vucutKitleIndeksi);

    }
}
