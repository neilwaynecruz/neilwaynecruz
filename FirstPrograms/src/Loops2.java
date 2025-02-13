public class Loops2 {
    public static void main(String[] args) {
        int[] scores = {89, 82, 64, 97, 80, 79, 60, 69, 99, 100, 81, 84, 92, 96, 61, 70, 84, 91, 73, 75, 83};
        // Call the method to compute the test average with scores
        int average = computeTestAverage(scores);
        System.out.println("Test average is: " + average);
    }
    
    public static int computeTestAverage(int[] scores){
        int total = 0;
        // Loop to iterate through each of the scores
        for (int score: scores) {
            // Assign total the sum of total and the current score
            total =  total + score;
        }
        return total/scores.length;
    }
}
