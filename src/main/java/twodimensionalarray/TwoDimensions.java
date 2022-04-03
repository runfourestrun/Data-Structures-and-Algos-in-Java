package twodimensionalarray;

import java.util.Arrays;
import java.util.Random;

/***
*Arrays in java are one dimensional; we use a single index to access each cell of an array
* nevertheless, there is a way we can define two-dimensional arrays in Java - we can create a 2-D array as an array of arrays.
* also called a matrix.
***/


/***
A feeling I was getting when doing this class is that I should try to keep this more atomic. I can't describe it but it should resemble arays.ScoreBoard class
 ***/

/**
 * Also giving me an IndexOutofBound bullshit error.
 */
public class TwoDimensions {

    public static void main(String[] args){
        int[][] twodarray = seed(5,5);
        Arrays.toString(twodarray);

    }



    /***
     * I don't think this is right?
     ***/
    public static int[][] seed(int rowsize,int columnsize){

        int[][] twodarray = new int[rowsize][columnsize];


        Random random = new Random();
        random.setSeed(0);
        int j = 0;
        int i = 0;
        while(j < rowsize){
            twodarray[j] = twodarray[random.nextInt()];
            j++;
            while(i < columnsize){
                twodarray[i] = twodarray[random.nextInt()];
                i++;
            }

        }

        return twodarray;

    }
}
