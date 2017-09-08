import java.util.ArrayList;
import java.util.List;

/**
 * Created by akhi on 8/26/17.
 */
public class Test {

    public static void main(String[] arg) {
        int n = 5;
        List<Integer>  memo = new ArrayList<>(n +1) ;
        //int[] memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(i + ":" + fib(i, memo));
        }
    }


    static Integer fib(int i , List<Integer> memo) {

        if(i <= 0 ){
            return  0;
        }
        else if (i == 1) {
            return 1 ;
        }
        else if (memo.get(i) > 0 )
        {
            return memo.get(i);
        }

        memo.set(i , fib(i-1 , memo) + fib (i-2 ,memo)) ;
        return memo.get(i);
    }


}

