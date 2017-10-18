package twitter_test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Twitter1 {


    static void maskUsername(String s)
    {
       /* String suffix = s.split("@")[1];
        String username = s.split("@")[0];
*/




      /*  System.out.println(username.charAt(0) +
                "*****"
                + username.charAt(username.length()-1)
                + "@" +
                suffix);*/
    }

    static void maskPhoneNumber(String s)
    {
         s = s.replaceAll("\\s","-");
         s = s.replaceAll("\\(|\\)","");
         



    }

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    while(sc.hasNext()) {
        String input1 = sc.nextLine();


        String[] arr = input1.split(":");

        if (arr[0].toLowerCase().equals("e")) {
            maskUsername(arr[1]);
            System.out.println("Printig Username " + arr[1]);
        } else
            System.out.println("Printing PhoneNumber " + arr[1]);
            maskUsername(arr[1]);

    }
}


}


