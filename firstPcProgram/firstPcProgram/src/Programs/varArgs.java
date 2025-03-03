package Programs;

public class varArgs {
    
    public static void main(String[] args) {
        // varargs (variable arguments) - allow a method to accept number of arguments
        //           makes method more flexible, no need for method overloading
        //           java will pack the arguments into an array

        //           ... (ellipsis) is used to denote varArgs

     
        System.out.println(average(5, 10, 15, 20, 25));
    }

    // method
    static double average (double... numbers) {
        double sum = 0.0;

        if(numbers == null || numbers.length == 0) {
            return 0.0;
        }

        for (double d : numbers) {
            sum = sum + d; 
        }
        return sum / numbers.length;
    }
}
