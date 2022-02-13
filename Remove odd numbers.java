                                                                                  QUESTION
                                                                                  
Arraylist input lee aurr usmee jitnee v odd numbers haii sabb remove karr kee bachii huyii list print karr dee

***********************************************************************************************************************************************************************************

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
                i--;   // yee hiii sabbseeee important step haii sawaal kaa
            }
        }

        System.out.println(list);
    }
}

  // with i-- answer is -> [12]

  // without i-- answer is ->[12, 15]


*********************************************************************************************************************************************************************************
                                                                           OUTPUT

input

4
3 12 13 15

 Output
 
[12]                                                                            

