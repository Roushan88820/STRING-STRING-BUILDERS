                                                                             QUESTION
Remove Primes
Easy

1. You are given an ArrayList of positive integers.
2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

Note -> The order of elements should remain same.

Constraints
1 <= N <= 10000

Format

Input

A number N
arr1
arr2.. N numbers

Output

An Arraylist

Example
Sample Input

4
3 12 13 15

Sample Output
[12, 15]                                                                             




********************************************************************************************************************************************************************************
                                                                            {CODE}

import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList <Integer> list = new ArrayList<>();

        for(int i = 0; i < n ; i++  ) {

            list.add(scn.nextInt());

        }

        remove_primes(list);

        System.out.println(list);
    }

    public static void remove_primes(ArrayList <Integer> list) {

        for(int i = 0; i < list.size(); i++) {

            int val = list.get(i);

            boolean isprime = Isprime(val);
            if(isprime == true) {
                list.remove(i);
                i--; // SBSEEEE IMPORTANT STEP
            }
        }
    }

    public static boolean Isprime( int x) {

        boolean prime_hai = true;
        int div = 2;
        while(div*div <= x) {
            int rem = x % div ;

            if(rem == 0) {
                prime_hai = false;
                break;
            }

            div++;

        }

        return prime_hai;
    }
}

********************************************************************************************************************************************************************************
                                                                                    OUTPUT
 Input

4
3 12 13 15

 Output
 
[12, 15]

********************************************************************************************************************************************************************************
                                                                                    kyaaa sikhee
                                                                                    
 jabb bhii arraylist meii remove karte haii too yaa too i-- karenge yaa too frr ultaa loop chlaenge kukii remove karte hii saare indexes -1 see khisakk jaate haii                                                                                   
                                                                                    
