package Programs;

public class twoDimensinalArray {
    public static void main(String[] args) {
        
        // 2D array - an array where each element is an array. Useful for storing data in a table or matrix of data .
        //            2d array can be thought of as an array of arrays.

        // syntax: datatype[row][column] arrayName = new datatype[rowSize][columnSize];
        // or      dattype[row][column] arrayName = {{value1, value2, value3}, {value4, value5, value6}, {value7, value8, value9}};
        // or      datatype arrayName[row][column] = new datatype[rowSize][columnSize];
        // or      datatype[row] arrayName[column] = new datatype[rowSize][columnSize];

                                                        //actual example

        // 2d array of Telephone Pad

        char [][] telephonePad = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };

        System.out.println("  Telephone Pad  ");
        System.out.println("-----------------");

        // for-each loop
/* 
         for (char[] row : telephonePad){
            for (char column : row){
                System.out.printf("%4c ", column);
            }
            System.out.println();
        }
        System.out.println();
*/


        // traditional for loop

        for(int i = 0; i < telephonePad.length; i++){
            for (int j = 0; j < telephonePad[i].length; j++){
                System.out.printf("%4c ", telephonePad[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
    
}
