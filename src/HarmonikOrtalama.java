public class HarmonikOrtalama {
    public static void main(String[] args) {
        int [] numbers = {3, 4, 5, 6, 9, 11};
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++ ){
            sum += 1.0 / numbers[i];
        }
        double result = numbers.length / sum;
        System.out.println("Harmonik Ortalama: " + result);
    }
}
