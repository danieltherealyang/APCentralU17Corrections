public class Main {
    public static void main(String[] args) {
        //Unit 6 Q8
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println("loop 1: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("loop 2: ");
        for (int x : numbers) {        
            System.out.println(x);
        }
        
        System.out.println("Same output");
    }
}