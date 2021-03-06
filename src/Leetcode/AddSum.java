package Leetcode;

import java.util.HashSet;

/**
 * 1. Two Sum
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class AddSum {

    public static void main(String[] args)
    {
        int[] array = new int[]{2,7,11,5,6};
        System.out.println(addSum(array,15));



    }

    static boolean addSum( int [] arr  , int a)

    {
        HashSet<Integer> set = new HashSet<>();
        for(Integer b :arr)
        {
            if(set.contains(b))
            {
                return true;
            }
            else set.add(a-b);
        }

        return false ;
    }

}
