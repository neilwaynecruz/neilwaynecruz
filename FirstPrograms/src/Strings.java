class StringsJava {

    public static void main (String[] args){
        String Hello = "Hello";
        System.out.println("This is Neil Wayne");
        System.out.println(Hello);

    // String Concatination
        
        String World = " World";
        String HelloWorld = Hello + World;
        String manyHelloWorlds = HelloWorld + '*' + 10;
        System.out.println(HelloWorld);
        System.out.println(manyHelloWorlds);

        System.out.println();
        String message = "It's a good day to have a good day";
        // Concatenate the exclamation to the message 
        String strongMessage = message + '!';
        // Concatenate the period to the message 
        String softMessage = message + '.';
        // Output the strongMessage in uppercase
        System.out.println(strongMessage.toUpperCase());
        // Output the softMessage in lowercase
        System.out.println(softMessage.toLowerCase());

        // Create a String variable to hold "HelloWorld"
        String helloWorld = "HelloWorld";
        String itsABeautifulWorld = "It's a beautiful world";
        // Get the length of itsABeautifulWorld
        int numberOfChars = itsABeautifulWorld.length();
        System.out.println(numberOfChars);
        // Check if helloWorld are equal
        System.out.println(helloWorld.equals(itsABeautifulWorld));
        // Get the 4 letter in itsABeautifulWorld
        char letter4 = itsABeautifulWorld.charAt(3);
        System.out.println(letter4);
    }
}