public class ExceptionalHandling {
    public static void main(String[] args) {
    	computeEachBill (100, 5);
        // Call to compute the bill on 100 with 0 people
        computeEachBill(100, 0);
    }
    
    public static void computeEachBill(int bill, int people){
    	// Add a try and the beginning of the try code block
        try {
            int ea = bill/people;
            System.out.println("Bill for each person is: " + ea);
        // End the try code block and catch a possible ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("You forgot to provide a positive number of people to split the bill among.");
        // End the catch code block
        }
    }
}
