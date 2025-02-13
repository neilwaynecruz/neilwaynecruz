public class twoDimensinalArray {
    public static void main(String[] args) {
        
        // 2D array - an array where each element is an array. Useful for storing data in a table or matrix of data .
        //            2d array can be thought of as an array of arrays.

        // syntax: datatype[row][column] arrayName = new datatype[rowSize][columnSize];
        // or      dattype[row][column] arrayName = {{value1, value2, value3}, {value4, value5, value6}, {value7, value8, value9}};
        // or      datatype arrayName[row][column] = new datatype[rowSize][columnSize];
        // or      datatype[row] arrayName[column] = new datatype[rowSize][columnSize];

        //actual example

        String[][] groceries = {{"Apple", "Banana", "Orange"}, 
                                {"Milk", "Cheese", "Butter"}, 
                                {"Chicken", "Beef", "Fish", "Pork"}};

        // accessing elements of 2D array
     /*  
       System.out.println(
              groceries[0][0] + " " + groceries[0][1] + " " + groceries[0][2] + "\n" +
              groceries[1][0] + " " + groceries[1][1] + " " + groceries[1][2] + "\n" +
              groceries[2][0] + " " + groceries[2][1] + " " + groceries[2][2] + " " + groceries[2][3] + "\n"
       );
*/  
       //or using for loop, can use traditional for loop or for-each loop

         //traditional for loop
         System.out.println("TRADITIONAL FOR LOOP\n");
            for(int i = 0; i < groceries.length; i++){
                for(int j = 0; j < groceries[i].length; j++){
                    System.out.print(groceries[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("FOR-EACH LOOP\n");

            // for-each loop
            for(String[] grocery : groceries){
                for(String item : grocery){
                    System.out.print(item + " ");
                }
                System.out.println();
            }
            System.out.println();
    }
    
}
