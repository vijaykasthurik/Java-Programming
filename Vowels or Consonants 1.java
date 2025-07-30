import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='I'||ch=='i'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("The Character "+ch+" is Vowel");
        }else if(ch>=65 && ch<=90 || ch>=97 && ch<122){
            System.out.println("The Character "+ch+" is Consonant");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
