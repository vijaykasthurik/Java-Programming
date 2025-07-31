import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        String s = Integer.toString(num);
        if (s.length() < 2) {
            System.out.println("STDOUT");
            return;
        }
        char first = s.charAt(0);
        char second = s.charAt(1);
        String swapped = "" + second + first;
        System.out.println(Integer.parseInt(swapped));
    }
}
