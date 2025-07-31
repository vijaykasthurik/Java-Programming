import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
                if (j != i - 1) System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
                if (j != i - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
