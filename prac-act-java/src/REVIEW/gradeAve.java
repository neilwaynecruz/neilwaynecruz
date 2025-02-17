package REVIEW;

import java.util.*;;

public class gradeAve{
    public static void main (String[] args){
        
        System.out.println();
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        double[] grades = new double[4];

        System.out.print("Enter you grade in English: ");
        grades[0] = scanner.nextDouble();

        System.out.print("Enter you grade in Math: ");
        grades[1] = scanner.nextDouble();

        System.out.print("Enter you grade in Science: ");
        grades[2] = scanner.nextDouble();

        System.out.print("Enter you grade in Computer: ");
        grades[3] = scanner.nextDouble();

        System.out.println("\nGRADES\n");

        System.out.println("English: " + grades[0]);
        System.out.println("Math: " + grades[1]);
        System.out.println("Science: " + grades[2]);
        System.out.println("Computer: " + grades[3]);
        System.out.println();

        double ave = (grades[0] + grades[1] + grades[2] + grades[3]) / grades.length;
        System.out.println("Average: " + ave);
        
        if (ave > 100) {
            System.out.println("Invalid grade!");
        } else if (ave >= 98) {
            System.out.println("With Highest Honors!");
        } else if (ave >= 95) {
            System.out.println("With High Honors!");
        } else if (ave >= 90) {
            System.out.println("With Honors!");
        } else if (ave >= 75) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

        scanner.close();
    }
}