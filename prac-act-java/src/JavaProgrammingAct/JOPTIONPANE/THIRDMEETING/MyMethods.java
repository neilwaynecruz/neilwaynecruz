package JavaProgrammingAct.JOPTIONPANE.THIRDMEETING;

public class MyMethods {
    public static double TG(double score, int no_items){ // accepts score and no items
        double tg = score * 50.0 / no_items + 50.0;  // compute tg
        return tg; //return the computed tg
    }

    public static double EQ(double tg){ // accepts the tg
        // this method return the EQ value based on the tg passed
        if (tg >= 97) return 1.00;
        if (tg >= 94) return 1.25;
        if (tg >= 91) return 1.50;
        if (tg >= 88) return 1.75;
        if (tg >= 85) return 2.00;
        if (tg >= 82) return 2.25;
        if (tg >= 79) return 2.50;
        if (tg >= 76) return 2.75;
        if (tg == 75) return 3.00;
        if (tg == 74) return 3.25;
        if (tg >= 72) return 3.50;
        if (tg >= 70) return 3.75;
        if (tg >= 65) return 4.00;
        if (tg >= 60) return 4.25;
        if (tg >= 58) return 4.50;
        return 5.00;
    }
}

