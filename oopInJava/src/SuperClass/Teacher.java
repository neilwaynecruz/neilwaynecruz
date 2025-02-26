package SuperClass;

public class Teacher extends Person {

    String scode;

    Teacher(String firstname, String lastname, String scode) {
        super(firstname, lastname);
        this.scode = scode;
    }

    void showScode(){
        System.out.println(firstName + " " + lastName + " Teacher code is : " + this.scode);
    }


}
