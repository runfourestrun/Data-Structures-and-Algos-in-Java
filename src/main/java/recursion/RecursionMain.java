package recursion;


/***
 * One way to describe repetition within a computer program is the user of loops, an entirely different way to achieve repetition is through a process
 * known as recurssion. Recurssion is a technical by which a method makes one or more calls to iteself during execution. Or by which a data structure
 * relies upon smaller instances of the same structure in its representation. There are many different examples of recurssion in art and nature
 *
 * factorial function: commonly denoted as n!, is a classic mathamatical function that has a natural recursive definition
 * English ruler: has a recursive pattern that is a simple example of a fractal structure.
 * Binary Search: is among the most important computer algos
 * File system of a computer: has a recursive structure in which directors can be nested arbitrarily deeply within other directories.
 *
 *
 */
public  class RecursionMain {










    /***
     * This function uses no explicit loops. Reptition is achieved through repeated recursive invocations of the method.
     * The process is finite because each time the method is invoked, it's arguement is smaller by one, and when a base case is reached, no further
     * recursive calls are made.
     *
     *
     * Recursion trace can help understand what is happening.
     * @param n
     * @return
     */
    public static int factorial(int n){
        if(n < 0)
            throw new IllegalArgumentException(); //arg must be non-negative
        else if (n==0)
            return 1;
        else
            return n * factorial(n-1);

    }

}
