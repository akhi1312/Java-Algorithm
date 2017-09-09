package Java.Array;

import java.util.Arrays;
import java.util.List;

public class LearderArray {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(98,23,54,12,20,7,27);
        leaderArray(list);
    }

    static void leaderArray(List<Integer> arr)
    {
        for(int i = arr.size()-1 ; i > 0 ; i--)
        {
            int max = arr.get(i);
            if(arr.get(i-1) < max)
            {
                arr.set(i-1 ,max);
            }
            max = arr.get(i-1);
        }

        System.out.println(arr.get(0));
        for(int i=0; i<arr.size()-1;i++)
        {
            if(arr.get(i)!=arr.get(i+1))
            {
                System.out.println(arr.get(i+1));
            }
        }


    }

}
