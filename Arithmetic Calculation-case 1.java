import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char ch=sc.next().charAt(0);
        switch (ch){
            case '+':
                System.out.printf("Addition of two number is %.1f\n",(float)(a+b));
                break;
            case '-':
                System.out.printf("Subtraction of two number is %.1f\n",(float)(a-b));
                break;
            case '*':
                System.out.printf("Multiplication of two number is %.1f\n",(float)(a*b)); 
                break;
            case '/':
                System.out.printf("Divison of two number is %.1f\n",(float)(a/b));
                break;
            case '%':
                System.out.printf("Modulus of two number is %.1f\n",(float)(a%b));
                break;
            default:
                System.out.printf("Invalid Input");
        }
            
    }
}
