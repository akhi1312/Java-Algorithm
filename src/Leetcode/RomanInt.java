package Leetcode;

import java.util.HashMap;

public class RomanInt {

    public static void main(String[] args)
    {
        System.out.println(romanInt("CXXIV"));
    }

    static Integer romanInt(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char [] carr = s.toCharArray();
        int result = 0;
        for(int i = 0;i<s.length();i++)
        {
            if(i> 0 && map.get(carr[i]) > map.get(carr[i -1]))
                result = result + map.get(carr[i]) - 2 * map.get(carr[i-1]);
            else
                result = result + map.get(carr[i]);
        }
        return result;

    }
}
