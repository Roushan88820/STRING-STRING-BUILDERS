                                                                                 QUESTION
                                                                                 
String With Difference Of Every Two Consecutive Characters
Easy

1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as 
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1

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
p-11e11p-45C12O-11D37i5n-39G                                                                                 
                                                                                 



********************************************************************************************************************************************************************************
                                                                                 {CODE}

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args ) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        // String ans = solution(str);
        System.out.println(solution(str));

    }

    public static String solution(String str){  //string input lia

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i <str.length() ; i++) {  // loop lagayaa string meii

            if(i == (str.length() - 1)) {    // last chracter ke liyee kuch aurr karna haii
                char ith_ch = str.charAt(i);
                sb.append(ith_ch);   

            }else {  

            char ith_ch = str.charAt(i);          // ith character get kiaa
            char next_ch = str.charAt(i+1);        // i+1 th character get kiaa
            sb.append(ith_ch);                     // i waale character koo sb meii add kiaa
            sb.append( next_ch - ith_ch);          // i + 1 character meii see ith koo minus karr kee sb meii add kiaa

            }
            
        }

        return sb.toString() ;   //sb see string mei convert karr kee return kara lia
    }
}

********************************************************************************************************************************************************************************
                                                              OUTPUT
                                                              
 Input

pepCODinG

 Output
 
p-11e11p-45C12O-11D37i5n-39G                                                                   
                                                              
                                                              
                                                              
********************************************************************************************************************************************************************************
                                                              KYAA SIKHEE
                                                              
