package twodimensionalarray;

import java.util.Arrays;

public class SimpleTwoDimensionalArray {
    private int rowSize;
    private int columnSize;
    private String[][] stringTwoDArray;




    public SimpleTwoDimensionalArray(int rowSize, int columnSize) {

        this.stringTwoDArray = new String[rowSize][columnSize];


        int increment = 0;


        for (int row = 0; row < stringTwoDArray.length; row++) {
            String row_string = String.format("row_string" + increment);
            increment++;
            for (int col = 0; col < stringTwoDArray[row].length; col++)
                stringTwoDArray[row][col] = row_string;
        }



    }



    public String[][] getStringTwoDArray() {
        return stringTwoDArray;
    }


    @Override
    public String toString() {
        return "SimpleTwoDimensionalArray{" +
                "stringTwoDArray=" + Arrays.toString(stringTwoDArray) +
                '}';
    }





}




