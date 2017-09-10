package Java.Array;

import java.util.Arrays;
import java.util.List;

public class FindElementRotArray {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(56,58,67,76,21,32,37,40,45,49);
        Integer pivot = findElementRotArray(arr ,67);
        System.out.println(pivot >= 0 ? "Element at index " + pivot + " Elememt is " + arr.get(pivot) : "Element not found");
    }

    static Integer findElementRotArray(List<Integer> arr, int data)
    {
        int start = 0;
        int end = arr.size()-1;
        int pivot = 0;

        if(arr.get(0) < arr.get(end))
            return 0;

        while(start<= end)
        {
            int mid = start + ((end-start)/2);
            if(arr.get(mid) > arr.get(mid+1))
            {
                if(arr.get(mid+1)< data)
                {
                    start =0;
                    end = mid ;
                    break;
                }
                start = mid+1;
                end = arr.size()-1;
                break;
            }

            if(arr.get(start)<=arr.get(mid))
                start = mid+1;

            else
                end = mid-1;
        }

        while(start<= end)
        {
            if(start > end)
                return -1;
            int mid =  start + ((end-start)/2);
            if(arr.get(mid)== data)
                return mid;
            if(arr.get(mid)< data )
                start = mid+1;
            else
                end = mid -1 ;

        }

        return -1;
    }
}
