package sortingarrays;

import java.sql.Array;

/*
 Simple sorting algorithim known as insertion-sort.
 1. The algorithim proceeds by considering one  element at a time, placing the elemnt in the correct order relative to those before it.
 2. Start with first element in the array, which is trivially sorted.
 3. When considering the next element in the array, if it is smaller than the first, we swap them.
 4. Next we consider the third element in the array, swapping it leftward until it is in its proper order relative to the first two items.

 Algorithim: InsertionSort(A)
 Input: An array of A of n comparable elements
 Output: The array A with elements rearranged in nondecreasing order


 */
public class InsertionSort {


    char[] testArray = new char[5];








    public static void insertionSort(char[] data){
        int n = data.length;
        for(int k = 1; k < n; k++){             //begin with second charachter
            char cur = data[k];                 // time to insert curr = data[k]
            int j = k;                          // find correct index j for cur
            while (j > 0 && data[j-1] > cur){   //thus data[j-1] must go after char
                data[j] = data[j-1]; //slide data[j-1] rightward
                System.out.println(data[j]);
                j--  ;
            }
            data[j] = cur;    //this is the proper place for cur

        }

    }
}
