import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args ) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        // String ans = solution(str);
        System.out.println(solution(str));

    }

    public static String solution(String str){

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i <str.length() ; i++) {

            if(i == (str.length() - 1)) {
                char ith_ch = str.charAt(i);
                sb.append(ith_ch);   

            }else {  

            char ith_ch = str.charAt(i);
            char next_ch = str.charAt(i+1);
            sb.append(ith_ch);
            sb.append( next_ch - ith_ch);

            }
            
        }

        return sb.toString() ;
    }
}

