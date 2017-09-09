package Java.Array;

//Find Element using Binary Search return index

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(2,4,9,10,23,35,49,52,60);
        binarySearch(list ,35);
    }

    public static void binarySearch(List<Integer> arr , int x)
    {
        binarySearch(arr,x,0,arr.size()-1);
    }

    public static void binarySearch(List<Integer> arr , int x, int left , int right)
    {
        if(left > right)
        {
           System.out.println("Element Not Found");
           return;
        }

        int mid = left + ((right-left)/2);
        if(arr.get(mid)==x)
        {
            System.out.println("Index of the Element " + mid);
            return;
        }
        if(arr.get(mid)>x)
        {
            binarySearch(arr,x,left,mid-1);
        }
        else
        {
            binarySearch(arr,x, mid+1,right);
        }
    }


}
