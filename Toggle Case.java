                                                                                 QUESTION
                                                                                 
Toggle Case
Easy

1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.

Constraints
1 <= length of string <= 1000

Format
Input
A String

Output
A String

Example

Sample Input

pepCODinG

Sample Output

PEPcodINg                                                                                 

********************************************************************************************************************************************************************************
                                                                                {CODE}                
    
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

        for(int i = 0; i < sb.length(); i++) {

            char ch = sb.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {  // yee ASCII codes ke through check karega kii captital A se capital Z kee beech meii character haii yaa nhii

               char lc = (char) (ch + ('a'-'A')) ; // ismee aaya haii mtlbb uppercase haii yee formulae useyy lowercase mei convert karr degaa 

                sb.setCharAt(i, lc) ;   // yee lowercase koo uss uppercase waale index meii daal degaa

            } else {  // agarr if kii condition meii nhii huaa mtlbbb kii lowercase haii  
                
                char uc = (char) (ch + ('A'-'a'));  // yee lowercase kooo upper case meii convert karr dega

                sb.setCharAt(i,uc) ;  // yee uppercase koo uss lowercase kii jagahh replace karr degaa

            }


        }

        String ans = sb.toString();

        return ans;
    }
    
}
********************************************************************************************************************************************************************************
                                                                           OUTPUT
  PEPcodINg                                                                          
                                                                           
                                                                           
                                                                           
                                                                           

********************************************************************************************************************************************************************************
                                                                           kyaa sikhee
                                                                           
                                                                           
                                                                           
                                                                           
