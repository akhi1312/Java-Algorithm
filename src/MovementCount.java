import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by akhi on 8/26/17.
 */
public class MovementCount {

  public static void main(String[] args)  {

      int counter = 0;

      List<Integer> numbers = new ArrayList<>();
      numbers.addAll(Arrays.asList(1,2,6,5,8,9));

      List<Integer> temp = new ArrayList<>(numbers);
      System.out.println(temp);
      numbers.sort(Comparator.naturalOrder());
      System.out.println(numbers);

      for(Integer num : numbers){
          if(num != temp.get(numbers.indexOf(num))){
              counter++;
          }
          else
          {
              continue;
          }
      }
      System.out.println("Total shift in the given array " + counter);
  }
}
