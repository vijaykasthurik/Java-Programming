import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int m = sc.nextInt();  
        if (n < 1 || m < 1 || n > 20 || m > 20) {
            System.out.println("Invalid Input");
            return;
        }
        int a = 0, b = 1;
        int sum = 0;
        for (int i = 1; i <= m; i++) {
            int current;
            if (i == 1) {
                current = 0;
            } else if (i == 2) {
                current = 1;
            } else {
                current = a + b;
                a = b;
                b = current;
            }
            if (i >= n) {
                sum += current;
            }
        }
        System.out.println("The Sum of Fibonacci value is " + (double)sum);
    }
}
