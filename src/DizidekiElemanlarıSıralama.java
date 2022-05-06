import java.util.Scanner;
import java.util.Arrays;
public class DizidekiElemanlarıSıralama {
    public static void main(String[] args) {
        //Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
        // Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
        System.out.print("Dizinin boyutu : ");
        Scanner input = new Scanner(System.in);
        int [] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Elemani : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Siralama : " + Arrays.toString(list));
    }
}
