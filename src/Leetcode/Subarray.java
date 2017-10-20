package Leetcode;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */


public class Subarray {


    public static void main(String[] args){
        int nums[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subarrya(nums));
    }

    public static int subarrya (int[] nums)
    {
        int sum = 0;
        int max = 0;
        for(int num : nums)
        {

            if(sum<0)
                sum=0;
            sum+=num;
            if(sum > max)
                max=sum;
        }
        return max;
    }


}
