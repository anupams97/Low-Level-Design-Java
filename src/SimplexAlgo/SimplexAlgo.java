package SimplexAlgo;

import java.util.*;

public class SimplexAlgo {
    public static void main(String[] args){
        List<Transaction> lt = new ArrayList<>();
        List<User> users = new ArrayList<>();

        User A = new User("A");
        User B = new User("B");
        User C = new User("C");
        User D = new User("D");
        User E = new User("E");
        Collections.addAll(users,A,B,C,D,E);

        lt.add(new Transaction(A,B, 100));
        lt.add(new Transaction(B,C, 300));
        lt.add(new Transaction(C,D,100));
        lt.add(new Transaction(D,E, 200));
        lt.add(new Transaction(A,C, 100));
        Queue<User> oweMaxHeap = new PriorityQueue<>((x, y)->(y.amountOwe-x.amountOwe));
        Queue<User> owedMaxHeap = new PriorityQueue<>((x, y)->(y.amountIsOwed-x.amountIsOwed));
        for(User u : users){
            oweMaxHeap.add(u);
            owedMaxHeap.add(u);
        }
        while(!oweMaxHeap.isEmpty()){
            User giver = oweMaxHeap.poll();
            User reciever = owedMaxHeap.poll();
            if(reciever.amountIsOwed - giver.amountOwe == 0){
                System.out.printf("User %s pays amount %s to %s%n ", giver.name,  reciever.amountIsOwed, reciever.name);
            }else if(reciever.amountIsOwed - giver.amountOwe > 0){
                System.out.printf("User %s pays amount %s to %s%n ", giver.name,  giver.amountOwe,reciever.name);
                reciever.amountIsOwed = reciever.amountIsOwed - giver.amountOwe;
                owedMaxHeap.add(reciever);
            }
            else if(reciever.amountIsOwed - giver.amountOwe < 0){
                System.out.printf("User %s pays amount %s to %s%n ", giver.name,  reciever.amountIsOwed,reciever.name);
                giver.amountOwe = giver.amountOwe-reciever.amountIsOwed ;
                oweMaxHeap.add(giver);
            }
        }
    }
}
