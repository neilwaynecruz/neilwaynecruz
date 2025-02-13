public class Loops {
    public static void main(String[] args) {
        String message = "It's a good day";
        char searchingFor = 'd';
        boolean found = false;
        int index = 0;
        // Add a while loop to continue until not found
        while (!found) {
            // Check if the character at the current index equals the searched character
            if (message.charAt(index) == searchingFor){
                // if the searchingFor character is located set found to true
                found = true;
                System.out.println("The character was found at index: " + index);
            } else {
                // Increment the index counter
                index++;
            }
        }
    }
}
