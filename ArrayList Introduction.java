import java.util.*;
import java.io.*;

public class Main {

    public static void main(String [] args) {

        ArrayList <Integer> list ; // declaration
        list = new ArrayList<>(); //  defination

         System.out.println(list.size() + " -> " + list); // 0 -> []

        list.add(10); // yee valuee baad meii append karta hai
        list.add(20);
        list.add(30);

        System.out.println(list.size() +" -> " + list); // 3 -> [10, 20, 30]

        list.set(1,200); // yee value change hii karr dega  1st index kii

        System.out.println(list.size() +" -> " + list);  // 3 -> [10, 200, 30]

        list.add(1,500); // yee value add karta hai aurr array list ka size bdhaa deta hai

        System.out.println(list.size() +" -> " + list); // 4 -> [10, 500, 200, 30]

        list.remove(1); // ye index 1 pee pdee huyee value ko remove karr dega 

        System.out.println(list.size() + " -> " + list); // 3 -> [10, 200, 30]

        int val = list.get(1);  // iseyy hum value get karr sktee hai

        System.out.println(val); // 200
        System.out.println(list.size() + " -> " + list); // 3 -> [10, 200, 30]

        for(int i = 0; i < list.size() ; i++) {

            int val_1 = list.get(i); // pehlee value get karr lii 

            System.out.println(val_1); // fr print kara diaa

        }


        // FOR EACH LOOP

        for(int val_2: list) {
            System.out.println(val_2);
        }

       
    }
}