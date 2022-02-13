import java.util.*;

public class Main {
    public static void main(String [] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList <Integer> list = new ArrayList<> ();

        for(int i = 0; i < n ; i++ ) {
            list.add(scn.nextInt());
        } 

        for(int i = 0; i < list.size(); i++) {
            int val = list.get(i);

            if(val % 2 != 0) {
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }
}

  // with i-- answer is -> [12]

  // without i-- answer is ->[12, 15]