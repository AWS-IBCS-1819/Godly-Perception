//2 methods to convert a stringbuilder intop the reverse
//first one while loop, second recursive
import java.util.*;

public class convert{

  public static String reverse(String hey) {
      if ((null == hey) || (hey.length() <= 1)) {
          return hey;
      }
      return reverse(hey.substring(1)) + hey.charAt(0);
  }



  public static void main(String[] args) {
//just block one of them out when testing, both should work
//option 1 with loop, not really loop cause i just used a reverse method
    System.out.println("what do you wanna reverse?");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder ohyeah = new StringBuilder(str);
        System.out.println("Here ya go:");
        System.out.println(ohyeah.reverse().toString());

//option 2 with recursion
        System.out.println("what do you wanna reverse?");
        Scanner in2 = new Scanner(System.in);
        String hey = in2.nextLine();
        String reverseHey = reverse(hey);
        System.out.println("Here ya go: "+ reverseHey);
    }
}
