class Arrays{

    public static void main(String[] args) {
        String[] Names = new String[4];

        Names[0] = "NEIL";
        Names[1] = " WAYNE";
        Names[2] = " Tubillara";
        Names[3] = " Cruz";
        System.out.println(Names[0] + Names[1]);

        // Create nobelLaureates to be a String array of size 3
        String[] nobelLaureates = new String[3];
        // Fill the nobelLaureates array with the names of Einstein, Curie and Sartre
        nobelLaureates[0] = "Einstein";
        nobelLaureates[1] = "Curie";
        nobelLaureates[2] = "Sartre";
        // Print out the length of the String array
        System.out.println(nobelLaureates.length);
        // Print out the length of the 2nd Nobel Laureate in the array
        System.out.println(nobelLaureates[1].length());

            int[] scores = {89, 82, 64, 97, 80, 79, 60, 69, 99, 100};
            // Get the second score from the scores array
            int secondScore = scores[1];
            System.out.println("The second score is: " + secondScore);
            // Print the scores length
            System.out.println(scores.length);
            String helloWorld = "Hello World";
            // Convert helloWorld to an array of char
            char[] chars = helloWorld.toCharArray();
            System.out.println(chars[6]);
            double[] costs = {5.5, 7.2, 1.8, 3.0};
            // Replace 1.8 with 9.4
            costs[2] = 9.4;

    }
}
