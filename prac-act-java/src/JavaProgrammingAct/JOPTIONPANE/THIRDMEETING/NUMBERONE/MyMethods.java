package JavaProgrammingAct.JOPTIONPANE.THIRDMEETING.NUMBERONE;

public class MyMethods {

    public static int getLow(int [] arr1){
        int low = arr1[0];
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] < low){
                low = arr1[i];
            }
        }
        return low;
    }

    public static int getHigh(int [] arr1){
        int high = arr1[0];
        for(int i = 0; i<arr1.length;i++){
            if(arr1[i] > high){
                high = arr1[i];
            }
        }
        return high;
    }
}
