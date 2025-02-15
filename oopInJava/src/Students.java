// for Main2.java
public class Students {

    String name;
    int age;
    double Gpa;
    boolean isEnrolled;

    Students(String name, int age, double Gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.Gpa = Gpa;
        this.isEnrolled = isEnrolled;
    }


    public void studying() {
        System.out.println(this.name + " is studying");
    }

    public void checkGpa(double Gpa) {
        if(this.Gpa >= 5.0) {
            System.out.println("FAILED!\n");
        } 
        else if (this.Gpa >= 4.0) {
            System.out.println("Conditional\n");
        }
        else {
            System.out.println("PASSED!\n");
        }

    }

}
