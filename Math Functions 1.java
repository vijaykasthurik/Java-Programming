import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       float v=sc.nextFloat();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((int)Math.floor(v));
        System.out.println((int)Math.ceil(v));
        
        System.out.println((int)Math.sqrt(a));
        System.out.println((int)Math.pow(b,c));
    }
}
