import java.util.Scanner;
import edu.princeton.cs.algs4.ResizingArrayStack;

public class ofugsnuid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResizingArrayStack<Integer> stack = new ResizingArrayStack<Integer>();

        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            stack.push(sc.nextInt());
        }
        for (int i = 0; i < len; i++) {
            System.out.println(stack.pop());
        }
        
        sc.close();
    }
}
