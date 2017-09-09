package Java.Array;

import java.util.*;

public class CountFrequency {

    public static void main(String []  args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,2,3,3,3);
        countfrequency(list);
    }

    static void countfrequency(List<Integer> list)
    {
        int max = 0;
        int position = 0;
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(Integer arr : list)
        {
            if(map.containsKey(arr))
            {
                map.put(arr,map.get(arr)+1);
            } else
            {
                map.put(arr, 1);
            }

            if (max < map.get(arr)) {
                max =  map.get(arr);
                position = arr;
            }
        }

        Iterator it = map.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }

        System.out.println(position + ":" + max);
    }
}
