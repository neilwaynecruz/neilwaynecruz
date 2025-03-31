package JavaProgrammingAct.JOPTIONPANE.THIRDMEETING.NUMBERTHREE;

public class MyMethods {

    public static double QuizAve(double q1, double q2) {
        return ((q1 + q2)/2);
    }

    public static double LabAve(double lab1,double lab2, double lab3) {
        return ((lab1 + lab2 + lab3)/3);
    }

    public static double MT(double quizAve, double labAve, double MTEQ) {

        return (quizAve * 0.35) + (labAve * 0.35) + (MTEQ * 0.30);
    }

}
