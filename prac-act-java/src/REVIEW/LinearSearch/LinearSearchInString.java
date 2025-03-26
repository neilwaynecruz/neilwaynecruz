package REVIEW.LinearSearch;


public class LinearSearchInString {
    public static void main(String[] args) {

        String name = "Neil";
        char target = 'N';

        System.out.println("The target is: " + target);
        System.out.println("Is '" + target + "' found in the string: " + search1(name, target));
//        System.out.println("Is '" + target + "' found in the string: " + search2(name, target));

    }

    static boolean search1(String n, char target){
        for (char letter : n.toCharArray()){
            if (letter == target){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String name, char target){
        int i = 0;
        while (i < name.length()) {
            if (name.charAt(i) == target) {
                return true;
            }
            if (i == name.length() - 1) {
                return false;
            }
            i++;
        }
        return false;
    }
}
