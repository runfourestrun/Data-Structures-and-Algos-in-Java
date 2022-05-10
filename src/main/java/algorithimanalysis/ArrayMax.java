package algorithimanalysis;


/***
 * All of the primitive operations described on page 154, are assumed to run in constant time: O(1)
 * a.length is a constant time operation
 * for an array A, A[j] can be found in constant time.
 */

public abstract class ArrayMax {






    public double arrayMax(double[] data){
        int n = data.length;
        double currentMax = data[0];
        for (int j=1; j < n; j++)
            if (data[j] > currentMax)
                currentMax = data[j];

            return currentMax;

    }
}
