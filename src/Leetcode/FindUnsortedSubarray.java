package Leetcode;

public class FindUnsortedSubarray {

  public static void main(String[] args){
      int nums[] = new int[]{1,3,2,4,5};
      System.out.println(findUnsortedSubarray(nums));

  }
        public static int findUnsortedSubarray(int[] nums) {

            int i = 0;
            int j = nums.length - 1;
            int max  = Integer.MIN_VALUE;
            int min  = Integer.MAX_VALUE;
            boolean indexFound = true;
            int minBreak = 0;
            int maxBreak = 0;

            if(nums.length == 1)
                return 0;

            if(nums[i] > nums[j])
                return nums.length;


            while(i<=j)
            {
                if(nums[i+1] < nums[i] && minBreak == -1) {
                    minBreak = i + 1;
                    min = nums[minBreak];
                }
                if(nums[j-1] > nums[j] && maxBreak == -1) {
                    maxBreak = j - 1;
                    max = nums[maxBreak];
                }

                if(max != Integer.MIN_VALUE && min != Integer.MAX_VALUE)

                {

                    if (min > nums[i])
                        min = nums[i];

                    if (max < nums[j])
                        max = nums[j];

                }

                i++;
                j--;

            }

            if(minBreak == -1 && maxBreak == -1)
                return 0;


            for(int k = 0 ; k < nums.length ;k++)
            {
                if(nums[k] > min)
                {
                    minBreak = k ;
                    break ;
                }
            }

            for(int l = nums.length-1; l > 0 ;l--)
            {
                if(nums[l] < max)
                {
                    maxBreak = l ;
                    break ;
                }
            }

            if(minBreak == -1 && maxBreak == -1)
                return 0;

            return maxBreak - minBreak + 1 ;
        }


    }

