import java.util.ArrayList;
import java.util.List;

/**
 * Created by akhi on 8/26/17.
 */
public class FibMemonization {

    public static void main(String[] args) {
         int n = 10 ;
        // List<Integer>  memo = new ArrayList<>(n +1) ;
        int[] memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(i + ":" + fib(i, memo));
        }
    }


        static int fib(int i , int [] memo) {
            if(i <= 0 ){
                return  0;
            }
            else if (i == 1) {
                return 1 ;
            }
            else if (memo[i] > 0 )
            {
                return memo[i];
            }

            memo[i] = fib(i-1 , memo) + fib (i-2 ,memo) ;
            return memo[i];
    }





}
