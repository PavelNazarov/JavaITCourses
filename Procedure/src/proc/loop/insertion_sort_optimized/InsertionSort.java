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
        System.out.println("Sorting");
        for (int k = 1; k < arr.length; k++) {
            System.out.println("newElement = arr["+k+"] = " + arr[k]);
            int newElement = arr[k];
            int location = k - 1;




            while (location >= 0 && arr[location] > newElement) {
                int foundPosition = Arrays.binarySearch(arr, 0, location, newElement);
                arr[location + 1] = arr[location];
                location--;
            }


            arr[location + 1] = newElement;
        }
    }
}
