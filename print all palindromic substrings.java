                                                                                    QUESTION
Print All Palindromic Substrings
Easy

1. You are given a string. 
2. You have to print all palindromic substrings of the given string.

Constraints
1 <= length of string <= 500

Format
Input

A String

Output

All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

Example

Sample Input

abcc

Sample Output
a
b
c
cc
c                                                                                    


*********************************************************************************************************************************************************************************
                                                                                     {CODE}

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String [] args) {

        Scanner scn = new Scanner(System.in);
        String s1 =  scn.nextLine();

        for(int i = 0; i < s1.length(); i++) {
            for(int j = i + 1 ; j <= s1.length(); j++  ) {

                String sub = s1.substring(i,j) ;

                // System.out.println(sub); hmee substring print nhii karnee

                boolean palindrome =  Is_palindrome(sub); 
                if(palindrome == true) {
                    System.out.println(sub);
                }

            }
        }
    }

    public static boolean Is_palindrome(String s) {

        boolean palindrome_hai = true;

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {  

        char left_ch = s.charAt(left);

        char right_ch = s.charAt(right);

        if(left_ch != right_ch){

           palindrome_hai = false;
           break;

        }
        left++;
        right--;

        }
        return palindrome_hai ;
    }

}

*********************************************************************************************************************************************************************************
                                                                                  OUTPUT
a
b
c
cc
c
                                                                                                                                                                                                                                                 
*********************************************************************************************************************************************************************************
                                                                                  Kyaa Sikheee
                                                                                  
                                                                                  



                            
