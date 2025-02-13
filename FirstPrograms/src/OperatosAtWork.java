class OperatosAtWork {
    public static void main (String[] args){

        int scoreTest1 = 78;
        int scoreTest2 = 94;
        // Assign testTotal the sum of scores
        int testTotal = scoreTest1 + scoreTest2;
        // Assign avg the average
        int avg = (scoreTest1 + scoreTest2) / 2;
        int passingScore = 65;
        // Incrementor passingScore
        passingScore++;
        // Assign the isPassing variable 
        boolean isPassing = avg >= passingScore;
        System.out.println(testTotal);
        System.out.println(avg);
        System.out.println(passingScore);
        System.out.println(isPassing);
        
    }

}
