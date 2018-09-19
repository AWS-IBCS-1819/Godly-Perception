// Conditions.java by Mr. Considine
// 9/14/18

import java.util.*;
import java.io.*;

public class Readbooook {

  public static void main(String[] args) {

    StringBuilder myStr = new StringBuilder();

    int count = 0;
    try {
      File Harry = new File("Harry Potter 1.txt");
      Scanner sc = new Scanner(Harry);

      while (sc.hasNext()) { //checks to see if our file is empty
        myStr.append(sc.next() + " ");
        count++;
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(myStr);

    int numO = 0;
    for (int i = 0; i < myStr.capacity() - 5; i++) {
      if (myStr.substring(i, i + 5).equals("Harry")) {
        System.out.println(myStr.substring(i, i + 5));
        numO++;
      }
      else if (myStr.substring(i, i+ 3).equals("END")){
       break;
     }
    }
    System.out.println("Number of 'Harry' in The Harry Potter: " + Integer.toString(numO));

  }
}
