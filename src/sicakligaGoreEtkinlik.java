import java.util.Scanner;
public class sicakligaGoreEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklik degerini giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }
        else if (sicaklik >= 10 && sicaklik <= 15){
            System.out.println("Hem sinema hem de piknige gidebilirsiniz.");
        }
        else if (sicaklik >= 5 && sicaklik <= 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if (sicaklik >= 10 && sicaklik <= 25){
            System.out.println("Piknige gidebilirsiniz.");
        }
        else {
            System.out.println("Yuzmeye gidebilirsiniz.");
        }
    }
}
