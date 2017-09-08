package Java.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by akhi on 8/27/17.
 * Reverse array with disturbing the order of special character
 *
 *
 */
public class ReverseArray {

    public static void main(String[] args) {

        List<Character> arr = new ArrayList<>();
        arr.addAll(Arrays.asList('a','#','d','c'));
        System.out.println(arr);
        List<Character> arr1 = copyString(arr);
        System.out.println("Copied String without character " + arr1);
        reverse(arr1);
        System.out.println("Reversed array " + arr1);
        System.out.println("Orginal String" + arr);




        for(int i =0 ,j =0; i<arr.size() ; i++) {
            if (isAlphabet((int)arr.get(i))) {
                arr.set(i, arr1.get(j));
                j++;
            }
        }

        System.out.println("Reversed String without changing Special Character" + arr);
    }


    static boolean isAlphabet(int x)
    {
        return ((x >= 'A' &&  x <= 'Z') || (x >= 'a' &&  x <= 'z')) ? true:  false ;
    }

    static List copyString(List<Character> arr) {
        List<Character> arr2 = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (isAlphabet((int) arr.get(i))) {
                arr2.add(arr.get(i));
            } else {
                continue;
            }

        }
        return arr2 ;
    }


    static void reverse (List<Character> arr){

        int start = 0;
        int end = arr.size() - 1;

        while(start<end){

            Character temp = arr.get(start);
            arr.set(start , arr.get(end));
            arr.set(end , temp) ;
            start++;
            end--;


        }

    }
}


