import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=100 && n<=999){
         int f=n/100;
        int m=(n/10) % 10;
        int l=n % 10;
            if (f==l) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
