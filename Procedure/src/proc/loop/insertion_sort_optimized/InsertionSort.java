package proc.loop.insertion_sort_optimized;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 18.01.13
 * Time: 1:45
 * To change this template use File | Settings | File Templates.
 */
public class InsertionSort {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;

            while (location >= 0 && arr[location] > newElement) {
                location--;
            }

            int newElementPosition = Arrays.binarySearch(arr, 0, k, newElement);
            newElementPosition = (newElementPosition >=0) ? newElementPosition : -newElementPosition-1;

            int lengthToCopy = k - location - 1;
            if(lengthToCopy > 0) // used for micro optimisation, not sure if it's needed
            {
                System.arraycopy(arr, newElementPosition,arr , newElementPosition + 1, lengthToCopy);
            }
            arr[newElementPosition] = newElement;
        }
    }
}
