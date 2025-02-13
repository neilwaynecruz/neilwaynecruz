class TempConversion {

	// Define the temperature conversion method
    static int fahrenheitToCelsius (int fahrenheitTemperature){
    	// Compute and return the celsius temperature from the parameter
    	return (fahrenheitTemperature - 32) * 5/9;
    }

    	// Define a method to compute and return whether a number is even
        public static boolean isEven(int aNumber){
            int result = aNumber/2;
            // Return the result multiplied by two equals the input
            return result * 2 == aNumber;
        }

	public static void main(String[] args) {
    	// Call the method to print the conversion of 32F 
        System.out.println("32F in Celsius is: " + fahrenheitToCelsius(32));
        // Call the method to print the conversion of 90F 
        System.out.println("90F in Celsius is: " + fahrenheitToCelsius(90));

        System.out.println();

        // Call on the method with argument 5
        System.out.println("5 even: " + isEven(5));
        // Call on the method with argument 102
        System.out.println("102 even: " + isEven(102));
    }
}
