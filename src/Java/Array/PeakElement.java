package Java.Array;

import java.util.Arrays;
import java.util.List;

public class PeakElement {

    public static void main(String[] args){

        List<Integer> arr = Arrays.asList(1,4,3,6,7,8);
        Integer peak = peakElement(arr);
        System.out.println(peak != null ? "Element is " + peak : "Element not exist");
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
}


