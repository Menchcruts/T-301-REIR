import java.util.Scanner;

public class Guessthenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low, high, middle;
        low = 1;
        high = 1000;
        
        for (int guess = 0; guess < 10; ++guess) {
            middle = (low + high)/2;
            System.out.println(middle);
            String answer = scanner.nextLine();

            switch (answer) {
                case "higher" -> { low = middle - 1; }
                case "lower" -> { high = middle + 1; }
                default -> { guess = 10; }
            }
        }
        scanner.close();
    }
}
