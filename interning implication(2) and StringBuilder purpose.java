// POOR PERFORMANCE OF STRING BECAUSE OF IMMUTABILITY AND PURPOSE OF USING STRINGBUILDER INSTEAD OF STRING IN JAVA


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) {


        
        String s = "";

        // StringBuilder sb = new StringBuilder();

        long start = System.currentTimeMillis();   // System.currentTimeMillis() :-> yee hmee time btaata haii since 1 jan 1970

        // for(int i = 0 ; i< 100000 ; i++) {
        //     sb.append(i);    ;-> string builder meii string meii kuchh v add karnee ke liyee append function kaa use kartee haii
        // }

        

        for (int i = 0; i<1000; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis() ;   // :-> long ekk integer datatype haiii

        long duration = end - start ;  // time btaegaa milliseconds meii
         
        System.out.println(duration);
        
    }
}

// basss 1 lakh tak loop chalayaa thaa aurr run time error dee rhaa hai
// kuu bhaii error dekh pehlee "run: line 1:     3 Killed  /usr/local/openjdk13/bin/java Main"
// killed bhaii marrr gyaa kuu 
// chall 1000 takk loop chlaate haii aurr dekhte haii kitna time lagta haii
// 22 milliseconds itnii gandii performance chiii 
// StringBuilder nee same loop 1000 takk koo 1 millisecond meii chla diaa hawwwwwwwwww
// StringBuilder 1 lakh takk v chala degaa 7 millisecond liyee bss isnee
// aisaa kuuu huaaa?? jawaab jaan nee kee liyee notes pdhee copy kee
// isiliye String kee questions mei jahaa String koo update karnaa hoo whaa StringBuilder use karte haii
// Yhiii purpose haii Stringbuilder kaa.......
