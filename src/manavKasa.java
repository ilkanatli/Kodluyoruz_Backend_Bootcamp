import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        double armut1Kg = 2.14, elma1Kg = 3.67, domates1Kg =1.11, muz1Kg = 0.95, patlican1Kg = 5.00, toplam, armut, elma, domates, muz, patlican;
        Scanner input = new Scanner(System.in);
        System.out.println("Kac kilo armut aldiniz ?");
        armut = input.nextDouble();
        System.out.println("Kac kilo elma aldiniz ?");
        elma = input.nextDouble();
        System.out.println("Kac kilo domates aldiniz ?");
        domates = input.nextDouble();
        System.out.println("Kac kilo muz aldiniz ?");
        muz = input.nextDouble();
        System.out.println("Kac kilo patlican aldiniz ?");
        patlican = input.nextDouble();

        toplam = (armut * armut1Kg) + (elma * elma1Kg) + (domates * domates1Kg) + (muz * muz1Kg) + (patlican * patlican1Kg);
        System.out.print("toplam tutar: " + toplam +"TL");

    }
    
}
