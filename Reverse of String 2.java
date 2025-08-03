import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev+=name.charAt(i);
            
        }
        System.out.println(rev);
       
    }
}
