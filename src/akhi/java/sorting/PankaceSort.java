package akhi.java.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * Created by akhi on 9/4/17.
 */
public class PankaceSort extends swap{

    public static void main(String[] args){
        List<Integer> array = Arrays.asList(12, 35, 3, 26, 2, 28, 7);
        pancakeSort(array);
        System.out.println("Sorted array with Pancake " + array);
    }

    static void pancakeSort(List arr){
        int n = arr.size();
        for(int i= n-1 ; i >= 0 ; i--){
            int maxId = findmax(arr, i);
            //System.out.println(maxId);
            if(maxId!= i){
                if(maxId != 0){
                    flip(arr ,maxId);
                }
                flip(arr ,i);
            }

        }
    }

    static int findmax(List<Integer> arr, int n) {
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if(arr.get(max) <arr.get(i)){
                max = i;
            }
        }
        return max;
    }

    static void flip(List<Integer> arr ,int maxId){
        int i = 0;
        int j = maxId;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}
