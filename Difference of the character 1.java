import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count1 = 0;
        int count2 = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                count1++;
            }
            else if (ch == '#') {
                count2++;
            }
        }
        int diff = count1 - count2;
        if(diff>=2)
          System.out.printf("The Difference of the character in the given string: %02d", diff);
        else if(diff==1)
          System.out.printf("The Difference of the character in the given string: %03d",diff);
        else
          System.out.println(diff);
    }
}
