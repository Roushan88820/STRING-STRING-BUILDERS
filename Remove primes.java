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
                i--;
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