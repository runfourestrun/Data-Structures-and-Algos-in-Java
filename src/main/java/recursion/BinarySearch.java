package recursion;

/**
 * When a sequence is unsorted, the standard approach to search for a target value is to use
 * a loop to examine every element, until either finding the target or exhausting the dataset
 * This is linear search: O(n)
 */
public class BinarySearch {

    public static boolean binarySearch(int [] data, int target, int low, int high){

        if(low > high)
            return false;

        else {
            int mid = (low + high) / 2;
            if (target == data[mid])
                return true;
            else if(target > data[mid])
                return binarySearch(data,target,low,mid -1 );
            else
                return binarySearch(data,target,mid + 1, high);
        }
    }
}
