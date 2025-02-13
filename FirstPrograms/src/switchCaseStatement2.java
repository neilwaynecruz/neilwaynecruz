public class switchCaseStatement2 {
    public static void main(String[] args) {
        assignGrade(85);
        assignGrade(92);
    }
    
    public static void assignGrade (int score){
    	char grade;
        // Add the expression from the score divided by 10
        switch (score / 10) {
        	// Add the case for 10 and 9
            case 10 :
            case 9:
                grade = 'A';
            // Add a statement to end the 10/9 case
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
		if (grade != 'F') {
            System.out.println("You have passed with a grade of: " + grade);
        } else {
            System.out.println("Sorry, you did not pass");
        }
    }

}
