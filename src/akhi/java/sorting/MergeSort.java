package akhi.java.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by akhi on 9/4/17.
 */
public class MergeSort {


    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(12,03,87,26,9,28,7);
        mergeSort(array);
        System.out.println("Sorted array with Merge sort " + array);
    }

    static void mergeSort(List<Integer> arr){
        int end = arr.size() -1 ;
        int start = 0 ;
        mergeSort(arr , start , end);
    }

    static void mergeSort(List<Integer> arr , int start , int end){
        if(start< end){
            int mid = (start+end)/2;
            mergeSort(arr , start , mid);
            mergeSort(arr , mid+1 ,end);
            merge(arr ,start,mid,end);
        }
    }

    static void merge(List<Integer> arr,int start,int mid,int end){
        int n1 = mid-start+1;
        int n2 = end-mid ;

        List<Integer> temp1= new ArrayList<Integer>(n1);
        List<Integer> temp2= new ArrayList<Integer>(n2);

        for(int i =0;i<n1;i++){
            temp1.add(arr.get(start+i));
        }

        for(int i =0;i<n2;i++){
            temp2.add(arr.get(mid+i+1));
        }

        int i =0 ,j =0 ;
        int k = start;
        while(i < n1 && j < n2){
            if(temp1.get(i) < temp2.get(j)){
                arr.set(k ,temp1.get(i));
                i++;
            }
            else {
                arr.set(k ,temp2.get(j));
                j++;
            }
            k++;
         }

         while(i<n1){
             arr.set(k ,temp1.get(i));
             i++;
             k++;
         }
         while(j<n2){
             arr.set(k ,temp2.get(j));
             j++;
             k++;
         }
    }
}
