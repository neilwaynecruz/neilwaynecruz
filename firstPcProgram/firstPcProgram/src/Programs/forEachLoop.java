package Programs;

public class forEachLoop {
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int num : nums){
            num = num * 2;
            System.out.print(num + " ");
        }

    }


    
}
