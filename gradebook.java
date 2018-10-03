// Gradebook.java by Rashida and Julia
// 9-19-18
import java.util.*;
import java.io.*;// import all the printers

public class gradebook { // create class

  public static Integer mean; // create a variable to hold the answer to mean

  public static void main(String [] args) { //main method

    System.out.println ("Welcome to the Student Gradebook, what would you like to see");
    System.out.println ("1. Mean Grade");
    System.out.println ("2. Grade Spread");
    System.out.println ("3. Top Grade");
    System.out.println ("4. Lowest Grade");
    System.out.println ("5. Class Subject and Teacher");
    System.out.println ("6. Student Roster");
    System.out.println ("7. Exit");

  StringBuilder myStr = new StringBuilder();// building a stringbuilder for all the names
  StringBuilder pro = new StringBuilder();// building a stringbuilder for the professor and class
  StringBuilder grade = new StringBuilder(); // building a srtingbuilder to get rid of the :
  StringBuilder bla = new StringBuilder(); // building a stringbuilder for all the grades

  try { //see if our text is empty
    File Grade = new File ("grades.txt");
    Scanner sc = new Scanner (Grade);
    pro.append(sc.next()+ " ");
    pro.append(sc.next()+ " ");
    pro.append(sc.next()+ " ");
    pro.append(sc.next()+ " ");
    pro.append(sc.next()+ " ");

    while (sc.hasNext()) {
      myStr.append (sc.next() + " ");// append all the names into the StrinngBuilder for names
      myStr.append (sc.next() + " " + "\n");
      bla.append(sc.next()); // append all : into the stringbuilder for :
      grade.append(sc.next()); // append all grades into the stringbuilder for grades

    }

  }
  catch (FileNotFoundException e) {
    e.printStackTrace ();
  }
// create the instant value
  int numO = 0;
  Double sum = 0.0;
  Double top = 0.0;
  Double low = 100.0;
  int A = 0;
  int B = 0;
  int C = 0;
  int D = 0;
  int F = 0;
  for (int i = 0; i < grade.length (); i = i + 5){ //create a loop to get all numbers in the string into the double
  Double d = Double.parseDouble (grade.substring (i, i + 4));
  numO++;
  sum = sum + d;
  if (top < d){ //if loop for top and low
    top = d;
  }
  else if (low > d){
    low = d;
  }
  else{
    top = top;
    low = low;
  }
  if (d >= 90.0){ // if loop for grade spread and 90.0 and up is an A
    A++;
  }
  else if (d >= 80.0){ // 80.0 and up till before 90.0 is a B
    B++;
  }
  else if (d >= 70){ // 70.0 and up till before 80.0 is a C
    C++;
  }
  else if (d >= 60){ // 60.0 and up till before 70.0 is a D
    D++;
  }
  else { // and thing lower than before 60 is a F
    F++;
  }
}
  Double mean = sum / numO; //final mean

while (true){ //while loop so the user can do it over and over again
  Scanner In = new Scanner(System.in); //scan user input
  String userIn = In.nextLine ();

  if (userIn.equals ("1")) {
    System.out.println ("The mean grade was");
    System.out.println(mean);

  }
  else if (userIn.equals ("2")) {
    System.out.println ("The grade spread was" // what percent of correspond with each grade
    + "\n A: " + Integer.toString(A)
    + "\n B: " + Integer.toString(B)
    + "\n C: " + Integer.toString(C)
    + "\n D: " + Integer.toString(D)
    + "\n F: " + Integer.toString(F));
  }
  else if (userIn.equals ("3")) {
    System.out.println ("The top grade was");
    System.out.println(top);
  }
  else if (userIn.equals ("4")) {
    System.out.println ("The lowest grade was");
    System.out.println(low);
  }
  else if (userIn.equals ("5")) {
    System.out.println ("The class subject and teacher was");
    System.out.println(pro);
      }
  else if (userIn.equals ("6")) {
    System.out.println ("The student roster was");
    System.out.println(myStr);
  }
  else if (userIn.equals("7")){
    System.exit(0);
  }
  else{
    System.out.println("this is not one of the option, choose again(from 1 to 6)");
    Scanner In2 = new Scanner (System.in);
    String userIn2 = In2.nextLine();
    System.out.println("or do you want to exit?(enter 7)");
  if (userIn2.equals ("1")) {
    System.out.println ("The mean grade was");
  }
  else if (userIn2.equals ("2")) {
    System.out.println ("The grade spread was");
  }
  else if (userIn2.equals ("3")) {
    System.out.println ("The top grade was");
  }
  else if (userIn2.equals ("4")) {
    System.out.println ("The lowest grade was");
  }
  else if (userIn2.equals ("5")) {
    System.out.println ("The class subject and teacher was");
  }
  else if (userIn2.equals ("6")) {
    System.out.println ("The student roster was");
  }
  else if (userIn2.equals("7")){
    System.exit(0);
  }
  else {
    System.out.println("Stop typing nonsense and bother the system. Try again later!");
    System.exit(0);
  }
}
}




  }
}
