public class ExceptionalHandling2 {
    public static void main(String[] args) {
        int[] testScores = {89, 82, 64, 97, 80, 89, 70, 99};
        String[] students = {"Sally", "Muhammad", "Alex", "Ramesh", "George", "Kate", "Kelly", "Phoenix"};
        int average =  computeAverage(testScores);
        // Call on determineBest with the scores array, student names array and average score
        determineBest(students,testScores, average);
    }
    
    public static int computeAverage(int[] scores){
        int total = 0; 
        // Loop through each of the scores
        for (int score: scores){
            total += score;
        }
        // return the average score
        return total/scores.length;
    }
    
    public static void determineBest(String[] names, int[] scores, int avg){
        for (int i = 0; i < names.length; i++) {
            // Add a condition to see if a student's score is better than average
            if (scores[i] > avg) {
                System.out.println (names[i] + " scored better than average");
            }
        }
    }

}
