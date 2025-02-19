package REVIEW;

public class forEachLoop {
    public static void main(String[] args) {

        int[] num = {100,234,321,1000};
        int sum = 0;

        for(int numbers : num){
            sum += numbers;
        }


       System.out.println(sum);

    }
}
