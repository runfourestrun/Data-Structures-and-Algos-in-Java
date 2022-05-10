package algorithimanalysis;

import java.lang.reflect.Array;
import java.util.Arrays;

/***
 * Suppose we are given three sets: A,B and C, stored in three different integer arrays. We will assume that no individual set contains
 * duplicate values BUT that there may be some numbers that are in two or three of the sets.
 *
 *
 * Three-way set disointness problem is to determine if the intersection of the three sets is empty, namely, that there is no element x such t
 */
public class ThreeWaySet {

    public ThreeWaySet() {
    }

    /**
     * Worse case scenario is a cubic runtime
     *
     * @param groupA
     * @param groupB
     * @param groupC
     * @return
     */
    public static boolean disjoint1(int[] groupA, int[] groupB, int[] groupC) {
        for (int a : groupA)
            for (int b : groupB)
                for (int c : groupC)
                    if ((a == b) && (b == c))
                        return false;

    return true;
    }

    /***
     * Once inside the loop for groupB if nothing matches we stop iterating, since looking through C would be a waste of time.
     * it has a quadratic time complexity
     * @param groupA
     * @param groupB
     * @param groupC
     * @return
     */

    public boolean disjoint2(int[] groupA,int[] groupB,int[] groupC){
        for(int a: groupA)
            for(int b: groupB)
                if (a == b)
                    for (int c: groupC)
                        if(a == c)
                            return false;


    return true;
    }


    /***
     * solves the element uniquness problem by looping through all distinct pairs of indices j < k, checking if any of those pairs
     * refer to eleemnts taht are equivalant to another
     * @param groupA
     * @return
     */
    public boolean elementUniqueness(int[] groupA){
        int n = groupA.length;
        for(int j = 0; j < n-1;j++)
            for(int k = j + 1; k < n; k++)
                System.out.println(k);

    return true;
    }


    public boolean elementUniquenessSortingMethod(int[] groupA){
        int n = groupA.length;
        int[] temp = Arrays.copyOf(groupA,n);
        Arrays.sort(temp);
        for(int j =0; j < n-1; j++)
            if(temp[j]==temp[j+1])
                    return false;
        return true;

    }


    /***
     * Prefix averages have many applications in economics and statistics. given a series of numbers, n consisting of e elements, we want to compute
     * a sequence a given such that a j is the average of elements in the first sequence
     *
     * Many applications in economics and statistics. For example, given the year-by-year returns of a mutual fund, ordered from recent to past,
     * an investor will typically want to see the fund's average annual returns for the most recent year, three years and five years
     *
     * I really have no clue how this works..
     */



    public double[] prefixAverageQuadratic(double[] x) {
        int n = x.length;  // O(1) time
        double[] a = new double[n]; // O(1) time
        for (int j = 0; j < n; j++) {
            double total = 0;
            for (int i = 0; i <= j; i++)
                total += x[j];
            a[j] = total / (j + 1);

        }

        return a;

    }


    public double[] prefixAverageLinear(double[] x){
        int n = x.length;
        double[] a = new double[n];
        double total = 0;
        for(int j = 0; j < n; j++){
            total += x[j];
            a[j] = total / (j+1);
        }
        return a;
    }






}

