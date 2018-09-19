// Gradebook.java by Rashida and Julia
// 9-19-18

public class gradebook {

  public static void main(String [] args) {

  StringBuilder myStr = new StringBuilder(); // StringBuilder is a object

    try {
      File Grade = new File ("grades.txt");
      Scanner sc = new  Scanner (grades);

      while (sc.hasNext());{ //checks to see if out file is empty
        Str1.append (sc.name());
        Str2.next (sc.grades());
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();

  /*  public static double mean (double [] m) {
      double sum = 0;
      for (int i = 0; i < m. length; i++) {
        sum += m [i];
      }
      return sum / m.length;

    }*/
  }

  }
}
