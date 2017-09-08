package akhi.java.sorting;

import java.util.List;

/**
 * Created by akhi on 9/4/17.
 */
public  class  swap {

      static void swap(List<Integer> arr, int  a , int b){
          int temp = arr.get(a);
          arr.set(a, arr.get(b));
          arr.set(b,temp);

      }

}
