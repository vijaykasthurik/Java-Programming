import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println("Bird said:"+s);
         int sv=(s/10) + (s%10);
        System.out.println("Alice must go in path-"+sv);
    }
}
