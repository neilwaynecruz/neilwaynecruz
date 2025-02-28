package JavaProgrammingAct;

public class Sagot {
    public static void main(String[] args) {

        boolean Sagot = true;
        int A = 2;
        int B = 4;
        char Letter = 'c';
        double Pi = 3.14;

        System.out.println("The value of A is " + A + " while B is " + B);
        System.out.println("Letter " + Letter);
        System.out.println("Initial value of Sagot is " + Sagot);
        System.out.printf("Pi contains value of %.2f\n", Pi);
        Sagot = false;
        System.out.println("Sagot is now is " + Sagot);
        String choice = (A > B)? "A is greater than B" : "A is less than B";
        System.out.println(choice);

        System.out.println(A + " * " + B + " = " + (A * B));



    }
}
