package akhi.java.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * Created by akhi on 9/4/17.
 */
public class BubbleSort {



    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(12,35,87,26,9,28,7);
        bubbleSort(array);
        System.out.println("Sorted Array with Bubble Sort " + array );


    }

    public static void bubbleSort(List<Integer> arr){

        boolean swap = true ;
        int n = arr.size();
        while(swap) {

            swap = false;

            for (int j = 1; j < n; j++) {

                if (arr.get(j - 1) > arr.get(j)) {
                    swapNumber(arr, j - 1, j);
                    swap = true;
                }

            }
            n--;
        }
    }

    public static void swapNumber (List<Integer> arr , int a , int b){

        int temp = arr.get(a);
        arr.set(a , arr.get(b));
        arr.set(b , temp);
    }
}
