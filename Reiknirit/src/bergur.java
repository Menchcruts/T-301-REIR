import java.util.Scanner;

import edu.princeton.cs.algs4.ResizingArrayStack;

public class bergur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResizingArrayStack<Integer> stack = new ResizingArrayStack<Integer>();

        int num_days = sc.nextInt();
        for (int i = 0; i < num_days; i++) {
            stack.push(sc.nextInt());
        }
        
        int min = stack.pop();
        int total = min;
        for (int i = 0; i < num_days-1; i++) {
            int curr = stack.pop();
            if (curr < min) min = curr;
            total += min;
        }
        
        System.out.println(total);

        sc.close();
    }
}