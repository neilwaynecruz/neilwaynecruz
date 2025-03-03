package Programs;

public class loopDeleteLater {
    public static void main(String[] args) {

        // practice only
        
        int num = 1;

       for (int i = 1; i<=3; i++){
            for (int j = 1; j<=i+2; j++){
                System.out.print(num);
                num++;
                
                if(num == 10){
                    num = 1;
                }

            }
            System.out.println();
       }
        
    }
    
}
