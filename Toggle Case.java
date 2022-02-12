import java.util.*;
import java.io.*;

public class Main {

    public static void main(String [] args) {

      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();

      String output = toggle_case(str);
      System.out.println(output);

    }

    public static String toggle_case(String str) {

        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i<sb.length(); i++) {

            char ch = sb.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {

               char lc = (char) (ch + ('a'-'A')) ;

                sb.setCharAt(i, lc) ;

            } else {
                char uc = (char) (ch + ('A'-'a'));

                sb.setCharAt(i,uc) ;

            }


        }

        String ans = sb.toString();

        return ans;
    }
    
}
