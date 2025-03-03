package Programs;

public class printf {
    public static void main(String[] args){

        double a = 10.12;
        double b = 3.14654;
        double c = -345.324612;

        //precisions
        System.out.println("\n\nFOR PRECISION");
        System.out.printf("Value for a = %f\n", a);
        System.out.printf("Value for b = %.4f\n", b);
        System.out.printf("Value for c = %.2f\n\n", c);

        double d = 1000.123123;
        double e = 2340232.1231;
        double f = -142000123.123123;

        //flags
        // + = output a plus (positive)
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus (-) if negative (-), space if positive(+)
        System.out.println("FOR FLAGS");
        System.out.printf("Value for d = %+,.2f\n", d);
        System.out.printf("Value for e = %+,.2f\n", e);
        System.out.printf("Value for f = %+,.2f\n\n", f);

        int g = 1;
        int h = 23;
        int i = 456;
        int j = 7890;

        //padding/width
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        System.out.println("FOR PADDING/WIDTH");
        System.out.printf("Value for d = %6d\n", g);
        System.out.printf("Value for e = %6d\n", h);
        System.out.printf("Value for f = %6d\n", i);
        System.out.printf("Value for f = %6d\n\n", j);

    }
}
