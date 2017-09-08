package akhi.java.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * Created by akhi on 9/4/17.
 */
public class InsertionSort  {

    public static void main(String[] args){

        List<Integer> array = Arrays.asList(12 ,35 , 5, 26, 9 , 28,7);
        insertionSort(array);
        System.out.println("Sorted array using Insertion Sort " + array);
    }

    public static void insertionSort(List<Integer> arr){
        int n = arr.size();

        for(int i =1 ; i <n; i++ ){
        int temp = arr.get(i);
        int j = i-1;

        while(j >= 0 && temp < arr.get(j)){
            arr.set(j+1 ,arr.get(j));
            j--;
        }

         arr.set(j+1 ,temp);
        }

    }


}
