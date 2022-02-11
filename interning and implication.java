import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) {

        String s1 = "hello" ;
        String s2 = "hello" ; // interning karegii java
        String s3 = new String ("hello"); // interning karegii java
        String s4 = s1; // reference copy

        // implication  :-> we cant use "==" because it only checks the references not content

        System.out.println(s1==s2); //true
        System.out.println(s1==s3); // false (which is wrong)

        // now using equals :-> it first checks the reference and if it is false then it also checks the content(or instances)

        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equals(s3));  // true

        // references are values present in stack
        // instances woo hotee haii heap aur intern pool meii jaha aslii maal padaa haii
        // references mutable hotee haii change hoo sktee haii parr instances immutable hotee haii
        // instaces kbhii nhii badaltee unhee cherne kaa koii function hii nhi java meii
        // instances kii copy bnaati haii java


    }
}
