package REVIEW;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        char target = 'n';

        if(!name.isEmpty()){
            for (int a = 0; a<name.length();a++){
                System.out.print(name.charAt(a));
            }
        }

        System.out.println();
        System.out.println("The target is: " + target);

        if(linerSearch(name, target)) {
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

    }

    static boolean linerSearch(String n, char target){
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == target) {
                return true;
            }
            if (i == n.length() - 1) {
                return false;
            }
        }
        return false;
    }
}
