
import java.util.Scanner;

public class asciikassi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        if (size == 0) {
            System.out.println("++");
            System.out.println("++");
            sc.close();
            return;
        }

        String top = "+";
        for (int i = 0; i < size; i++) {
            top += "-";
        }
        top += "+";

        String between = "";
        for (int i = 0; i < size; i++) {
            between += " ";
        }
        String wall = "|" + between + "|";
        
        System.out.println(top);
        for (int i = 0; i < size; i++)
            System.out.println(wall);
        System.out.println(top);

        sc.close();
    }
}
