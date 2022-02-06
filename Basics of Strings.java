import java.util.*;
import java.io.*;

public  class Main {
    public static void main(String [] args) {

        String s = "hello_String"; // ( declaration  and defination)
        System.out.println(s); 
        
********************************************************************************************************************************************************************
            OUTPUT
     
            hello_String
            
*******************************************************************************************************************************************************************

        // string is also like an array but not exactly an array
        // Strings also posses the length property parr yhaa length ekk function hai 

        for(int i = 0; i< s.length() ; i++ ) {

            char ch = s.charAt(i); // is tarikee see hum string kii ekk ekk value get karte haii

            System.out.println(ch);

        }
        
 *******************************************************************************************************************************************************************
                                                           OUTPUT
h
e
l
l
o
_
S
t
r
i
n
g        
            
*******************************************************************************************************************************************************************        

        // char is a datatype which stores a single alphabet;
         char r = 'P' ;
         System.out.println(r);        // output => P
        


          // concept of + and +=
           
          s = s + " Motaa" ;  // purane s mei Motaa add hoo jaega baad mei

          System.out.println(s);   //output => hello_String Motaa


          s += " Motaaa";  // purane s mei Motaaa add hogaa baad mei 

          System.out.println(s);   // output => hello_String Motaa Motaaa


          s = "motaa " + s ; // motaa pehlee aaega frr s mei pdaa huaa string aaega

          System.out.println(s);   // output => motaa hello_String Motaa Motaaa

          // Answer this
          
          System.out.println("Roushan" + 10 + 20); // answer => Roushan1020 (String + integer = string);   // output => Roushan1020

          System.out.println( 10 + 20  + "Roushan");// answer => 30Roushan  (integer +  String = string)  // output => 30Roushan

          System.out.println(10 + 20 + "Roushan" + 10 + 20); // answer => 30Roushan1020                  // output =>  30Roushan1020

          // SUBSTRING

          String str = "ROUSHAN"; // R-1 , O-1 , U-2 , S-3 , H-4 , A-5 , N-6 ;
          System.out.println(str.substring(0,1));    // 0 index takk print karega
          System.out.println(str.substring(0,2));    // from 0 to 1 index takk print karega
          System.out.println(str.substring(0,3));    // from 0 to 2 index takk print karega
          System.out.println(str.substring(0,4));    // from 0 to 3 index takk print karega
          System.out.println(str.substring(0,5));    // from 0 to 4 index takk print karega
          System.out.println(str.substring(0,6));    // from 0 to 5 index takk print karega
          System.out.println(str.substring(0,7));    // from 0 to 6 index takk print karega
          System.out.println(str.substring(0));      // from 0 to end index takk print karega
          System.out.println(str.substring(4));      // from 4 to 7 index takk print karega
          System.out.println(str.substring(4,7));   // from 4 to 6  index takk print karega
          System.out.println(str.substring(1));     // from 1 to end index takk print karega
        
********************************************************************************************************************************************************************
            OUTPUT
R
RO
ROU
ROUS
ROUSH
ROUSHA
ROUSHAN
ROUSHAN
HAN
HAN
OUSHAN          
*******************************************************************************************************************************************************************


          // TAKING INPUT

          Scanner scn = new Scanner(System.in);
          String s2 =  scn.nextLine(); // ye enter takk read karr leta haii 
        
         // ekk hotaa hai scn.next() joo sirff input meii pehle space baar takk read karr leta hai
        
          System.out.println(s2);
         
    }
}

Input :=> hello roushan
Output :=> hello roushan
