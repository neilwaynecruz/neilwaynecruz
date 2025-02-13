import java.util.Scanner;

public class quizGame{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        String[] questions = {"1. What is the default value of a boolean variable in Java?",
                              "2. Which keyword is used to define a class in Java?",
                              "3. Which of the following is NOT a primitive data type in Java?",
                              "4. What does JVM stand for?",
                              "5. Which of these loops executes at least once?",
                              "6. Which method is called when an object is created in Java?",
                              "7. What is the size of an int in Java?",
                              "8. Which of the following is used to handle exceptions in Java?",
                              "9. Which of the following is a superclass of all classes in Java?",
                              "10. Which keyword is used to inherit a class in Java?",
                            };
        String [][] options = {{"A. True", "B. False", "C. null", "d. 0"},
                               {"A. define", "B. class", "C. new","d. static"},
                               {"A. int", "B. String", "C. char", "d. boolean"},
                               {"A. Java Virtual Method", "B. Java Variable Manager", "C. Java Virtual Machine", "d. Java Version Manager"},
                               {"A. for loop", "B. while loop", "C. do-while loop", "d. for-each loop"},
                               {"A. main()", "B. constructor", "C. init()", "d. start()"},
                               {"A. 2 bytes", "B. 4 bytes", "C. 8 bytes", "d. Depends on the system"},
                               {"A. try-catch", "B. if-else", "C. switch-case", "d. for-loop"},
                               {"A. Object", "B. Class", "C. Main", "d. Super"},
                               {"A. this", "B. extends", "C. implements", "d. super"} 
                              };
        
        char[] answers = {'B', 'B', 'B', 'C', 'C', 'B', 'B', 'A','A','B'};
        int score = 0;
        char guess;

        System.out.println("****************************");
        System.out.println("Welcome to Java Quiz Game!");
        System.out.println("****************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            System.out.println();
            for(int j = 0; j < options[i].length; j++){
                System.out.println(options[i][j] + " ");
            }
            System.out.println();
            System.out.print("Enter you answer: ");
            guess = scanner.next().toUpperCase().charAt(0);
            if (guess == answers[i]){
                System.out.println();
                System.out.println("*---------*");
                System.out.println("CORRECT");
                System.out.println("*---------*");
                score++;
            }
            else{
                System.out.println("*---------*");
                System.out.println("INCORRECT");
                System.out.println("*---------*");
            }
            System.out.println();
        }

        System.out.println("Your final score is: " + score + "/"+ questions.length + "\n");

        if(score >= 5){
            System.out.println("PASSED!!\n");
        }
        else{
            System.out.println("FAILED!!\n");
        }
        System.out.println("END OF QUIZ");
        System.out.println();

        scanner.close();
    }
}