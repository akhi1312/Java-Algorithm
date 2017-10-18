package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    public static void main(String[] args)
    {
        List<Integer> arr = Arrays.asList(1,2,2,3);
        System.out.println(removeDuplicate(arr));


    }


    static Integer removeDuplicate(List arr)
    {
        int i =0;
        for(int j= 1;j< arr.size();j++)
        {
            if(arr.get(i)!=arr.get(j))
            {
                i++;
                arr.set(i,arr.get(j));
            }
        }
        return  i+1;
    }

    static Integer removeElement(List <Integer> arr , int a) {
        int i = 0;
        for (int j = 0; j < arr.size(); j++) {
            if (arr.get(j) != a) {
                arr.set(i, arr.get(j));
                i++;

            }
        }
        return i;
    }

}
