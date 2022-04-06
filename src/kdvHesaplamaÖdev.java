import java.util.Scanner;
public class kdvHesaplamaÖdev {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutari giriniz: ");
        tutar = input.nextDouble();

        boolean kosul1 = tutar < 1000;
        boolean kosul2 = tutar >= 0;
        kdvOran = kosul1 && kosul2 ? 0.08 : 0.18;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: "+ tutar);
        System.out.println("KDV Oran: "+ kdvOran );
        System.out.println("KDV Tutari: "+ kdvTutar);
        System.out.println("KDV'li Tutari: "+ kdvliTutar);
    }
}
