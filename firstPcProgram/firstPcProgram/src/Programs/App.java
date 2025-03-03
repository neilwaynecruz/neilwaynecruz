package Programs;

public class App {
    public static void main(String[] args) {
        int Myage = 20;
        int Mybyear = 2005;
        int Mymoney = 50000000;
        Long Mymoney2 = 5000000000000000000L;
        double pi = 3.141592653589973238962643234565768;
        float pi2 = 3.141592653589973238962643234565768F;

        System.out.println("My age is " + Myage + ", My birthyear is " + Mybyear + ", I have money of " + Mymoney);
        System.out.println(pi);// output: 3.1415926535899734
        System.out.println(pi2);// output: 3.1415927
        System.out.println(Mymoney2);

        char grade = 'A';
        char symbol = '!';
        char currency = '₱';
        boolean IsStudent = true;
        boolean forsale = false;
        boolean IsOnline = true;
        
        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);
        System.out.println(IsStudent);
        System.out.println(forsale);
        System.out.println(IsOnline);
    }
}
