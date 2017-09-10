package Java.Array;

import java.util.Arrays;
import java.util.List;


// Program Contain Both Pivot Element and Peak Element and Binary Search with Roated Array


public class PeakElement {

    public static void main(String[] args){

        List<Integer> arr = Arrays.asList(67,76,21,32,37);
       // Integer peak = peakElement(arr);
        Integer pivot = pivotElement(arr);
       // System.out.println(peak != null ? "Element is " + peak : "Element not exist");
        System.out.println(pivot >= 0 ? "Element at index " +pivot +" Elememt is "+arr.get(pivot) : "Element not found" );
    }

    static Integer peakElement(List<Integer> arr)
    {
        int start = 0;
        int end = arr.size()-1;
        while(start<=end)
        {
            int mid =  (start + end) / 2;
            if((mid==0||arr.get(mid-1) <= arr.get(mid))&& (mid==arr.size()-1 || arr.get(mid+1)<=arr.get(mid)))
                return arr.get(mid);
            else if(mid >0 && arr.get(mid-1)> arr.get(mid))
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return null;
    }


    public static Integer pivotElement(List<Integer> arr)
    {
        int n = arr.size()-1;
        if(arr.get(0)<arr.get(n))
            return 0;
        int start = 0;
        while(start<=n)
        {
            int mid = start + ((n-start)/2);
            if(arr.get(mid) > arr.get(mid+1))
                return mid+1;
            if(arr.get(start)<=arr.get(mid))
                start= mid+1;
            else
                n= mid-1;
        }


        return 0;
    }


}


