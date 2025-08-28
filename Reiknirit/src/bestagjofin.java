
import java.util.Scanner;

public class bestagjofin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        int high_score = 0;
        String high_name = "";
        for (int i = 0; i < num; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            if (score > high_score) {
                high_score = score;
                high_name = name;
            }
        }

        System.out.println(high_name);

        sc.close();
    }
}
