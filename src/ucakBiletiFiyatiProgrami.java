import java.util.Scanner;
public class ucakBiletiFiyatiProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, yolculukTipi;
        double toplamTutar, mesafeBasinaUcret = 0.10;

        System.out.print("Mesafeyi km turunden giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yasinizi giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz: ");
        yolculukTipi = input.nextInt();

        toplamTutar = mesafe * mesafeBasinaUcret;

        if((mesafe > 0 && yas > 0) && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yas < 12) {
                if (yolculukTipi == 1) {
                    toplamTutar -= toplamTutar * 0.5;
                    System.out.print("Bilet Fiyatiniz: " + toplamTutar);
                } else {
                    toplamTutar -= toplamTutar * 0.5;
                    toplamTutar -= toplamTutar * 0.2;
                    toplamTutar *= 2;
                    System.out.print("Bilet Fiyatiniz: " + toplamTutar);
                }
            } else if (yas >= 12 && yas <= 24) {
                if (yolculukTipi == 1) {
                    toplamTutar -= toplamTutar * 0.1;
                    System.out.print("Bilet Fiyatiniz: " + toplamTutar);
                } else {
                    toplamTutar -= toplamTutar * 0.1;
                    toplamTutar -= toplamTutar * 0.2;
                    toplamTutar *= 2;
                    System.out.print("Bilet Fiyatiniz: " + toplamTutar);
                }
            } else if (yas >= 65) {
                if (yolculukTipi == 1) {
                    toplamTutar -= toplamTutar * 0.3;
                    System.out.print("Bilet Fiyatiniz: " + toplamTutar);
                } else {
                    toplamTutar -= toplamTutar * 0.3;
                    toplamTutar -= toplamTutar * 0.2;
                    toplamTutar *= 2;
                    System.out.print("Bilet Fiyatiniz: " + toplamTutar);
                }
            } else {
                if (yolculukTipi == 1) {
                    toplamTutar = toplamTutar;
                    System.out.print("Bilet Fiyatiniz: " + toplamTutar);
                }
                else {
                    toplamTutar *= 2;
                    System.out.print("Bilet Fiyatiniz: " + toplamTutar);
                }
            }
        } else {
            System.out.print("Hatali veri girdiniz.");
        }
    }
}
