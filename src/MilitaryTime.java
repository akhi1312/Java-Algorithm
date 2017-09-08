/**
 * Created by akhi on 8/25/17.
 */
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Comparator;
        import java.util.List;

public class MilitaryTime {

    public static void main(String[] arg) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(3,4,2));

        numbers.sort(Comparator.reverseOrder());

        List<Integer> final_list = new ArrayList<>();


        for (Integer item : numbers) {
            if (item == 2 || item == 1 || item == 0){
                final_list.add(0, item);
                numbers.remove(item);
                break;
            }
        }


        if (final_list.size() != 1) {
            System.out.println("Not possible");
            System.exit(0);
        }

        for (Integer item : numbers) {
            if (final_list.get(0) == 2 && item <= 3) {
                final_list.add(1,item);
                numbers.remove(item);
                break;
            }

            if (final_list.get(0) != 2 ) {
                final_list.add(1,item);
                numbers.remove(item);
                break;
            }
        }

        if (final_list.size() != 2) {
            System.out.println("Not possible");
            System.exit(0);
        }

        for (Integer item : numbers) {
            if (item <= 5) {
                final_list.add(item);
                numbers.remove(item);
                break;
            }
        }

        if (final_list.size() == 3 && numbers.size() == 1 && numbers.get(0) <= 9 ) {
            final_list.add(numbers.get(0));
        } else {
            System.out.println("Not Possible");
            System.exit(0);
        }


        System.out.print("Time is " + final_list.get(0) + final_list.get(1) + ":" + final_list.get(1) + final_list.get(2));
    }
}