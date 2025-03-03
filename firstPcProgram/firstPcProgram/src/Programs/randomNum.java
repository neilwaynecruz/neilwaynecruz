package Programs;

import java.util.*;

public class randomNum {
    public static void main (String[] args){

        Random random = new Random();


        boolean isHeads;
        double pi;

        pi = random.nextDouble(0.1,2);

        isHeads = random.nextBoolean();

        System.out.println(pi);

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
