public class Main2 {
    public static void main(String[] args) {

        //constructor - a special method to initialize an object
        //              you can pass arguments to the constructor
        //              and set up its initial state

        // declaring objects

        Students student1 = new Students("Neil", 19, 1.0, true);
        Students student2 = new Students("Wayne", 24, 4.0, true);
        Students student3 = new Students("Cruz", 20, 3.0, true);

        student1.studying();
        student1.checkGpa(student1.Gpa);
        student2.studying();
        student2.checkGpa(student2.Gpa);
        student3.studying();
        student3.checkGpa(student3.Gpa);

    }
}
