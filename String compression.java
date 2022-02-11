import java.util.*;
import java.io.*;


public class Main {
    public static void main(String [] args) {

        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();

        String comp_1_str = compression_1(s);

        System.out.println(comp_1_str);

        String comp_2_str = compression_2(s);

        System.out.println(comp_2_str) ;

    }

    public static String compression_1 (String str){
         String ans = ""; 

         for(int i = 0; i < str.length() - 1 ; i++) {

            

            char previous_ch = str.charAt(i);
            char next_ch = str.charAt(i+1);

            if(previous_ch != next_ch) {
                ans = ans + previous_ch;

                // ans+= previous_ch;
            }

            
        }

        ans = ans + str.charAt( str.length()-1 );

        return ans ;
    }

    public static String compression_2(String str) {
        String ans = "";
        char previous_ch = ' ';
        int count = 1;
        for(int i = 0; i< str.length() - 1; i++ ) {

             previous_ch = str.charAt(i);
            char next_ch = str.charAt(i+1);

            if(previous_ch == next_ch) {
                count++;

            } else {

                if (count==1) {

                    
                ans = ans + previous_ch ;
                previous_ch = next_ch ;
                count = 1;


                } else { 

                ans = ans + previous_ch + count ;
                previous_ch = next_ch ;
                count = 1;

                }

            }

        }

        if (count==1) {  

        ans = ans + str.charAt(str.length() - 1)  ;

        }else {
            ans = ans + str.charAt(str.length() - 1) + count ;
        }

        return ans;

    }
    
}
