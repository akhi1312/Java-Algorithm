package Leetcode;

/**7. Reverse Integer
 Reverse digits of an integer.
 Example1: x = 123, return 321
 Example2: x = -123, return -321*
 */

public class ReverseInteger {

    public static void main(String[] args){

        int b = -123;
        System.out.println("Reversed String "+ reverse(b));
        System.out.println(intPalindrom(121) ? "It is palindrome" : "Its not a palindrome");
    }


    static boolean intPalindrom(int a) {
        int rev = 0;
        int temp = a;

        if(a == 0)
            return true;
        if( a < 0)
            return false;
        while (temp != 0)
        {

            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if(a==rev)
            return true;
        return false;

    }



    public static  Integer reverse( int x){

        StringBuilder sb = new StringBuilder();
        sb.append(x);

        boolean negative = sb.toString().charAt(0) == '-' ? true :false;

        long reverx = x;
        if(negative)
        {
            String withOutNegativeSign = sb.substring(1).toString();
            reverx = Long.parseLong(withOutNegativeSign);
        }
        sb.setLength(0);
        long result = 0;

        System.out.println(sb);

        if(negative)
        {
                sb.append('-');

        }
        while(reverx!=0)
        {
           sb.append(reverx%10);
           reverx /= 10;

        }
        result = Long.parseLong(sb.toString());
        return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int) result;
    }




}



