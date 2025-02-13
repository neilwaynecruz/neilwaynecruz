public class Conditionals {
    public static void main(String[] args) {
        taxOwed (40000); // Check if tax is owed with 40000 income
        taxOwed (100000); // Check if tax is owed with 100000 income
    }
    
    public static void taxOwed (int income){
    	// Add curly brackets to the if code statements
        if (income < 50000){
            System.out.println("Based on your income of " + income + ", you will owe no tax.");
        }
        // Add curly brackets to the else code statements
        else {
	        System.out.println("Based on your income of " + income + ", you will owe tax.");
	        System.out.println("Please send your owed tax to 123 Main Street, Somewhere, NY.");
        }
    }
}
