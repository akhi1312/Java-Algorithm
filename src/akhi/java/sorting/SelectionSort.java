package akhi.java.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * Created by akhi on 9/4/17.
 */
public class SelectionSort extends swap {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(12, 35, 87, 26, 9, 28, 7);
        insertionSort(array);
        System.out.println("Sorted array with bubble sort " + array);

    }

    public static void insertionSort(List<Integer> arr){

        int n = arr.size();

        if(arr == null || n < 2 ){
            return;
        }

        for(int i = 0 ; i < n ; i++){
            int minIndex = i;
            for(int j = i+1 ; j< n ; j++){
                if(arr.get(minIndex) > arr.get(j)){
                    minIndex = j;
                }
            }

            if( i != minIndex && arr.get(i) != arr.get(minIndex)){
                swap(arr , i , minIndex);
            }
        }
    }

 /*   public static void swap(List<Integer> arr , int a , int b) {

        int temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b,temp);
    }*/


}
