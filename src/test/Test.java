package test;

import java.util.*;

public class Test {

    public static void main(String[] args){

        HashMap<Integer,String> map= new HashMap<Integer,String>();
        Set<Integer> set = new HashSet<>();

        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);


        for(Integer set1 :set){
            System.out.print(set1+ " ");
        }
// For Iterating through key
        for(Integer key :map.keySet()){
            System.out.println(key);

        }
        // Iterating value
        for (String value : map.values())
        {
            System.out.println(value);

        }

        //for Both
        for(HashMap.Entry<Integer, String> entry : map.entrySet()){

            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);

        }
        // Using Iterator
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + ":" +pair.getValue());
        }


    }
}
