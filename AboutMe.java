import java.util.*;
import java.util.Scanner; //import scanner so that the program can scan user input

public class AboutMe{ //create class called AboutMe

  public static String user;
  public static String name; //create static variables to the class
  public static String nationality;
  public static String FavAnimal;
  public static String TieColor;
  public static String LauralOrYanny;
  public static Integer age;
  public static Integer YearsAtAws;

  public AboutMe(){ //Add information to the variables
    user = "Charlie";
    name = "Chloe Arranza";
    nationality = "Filipino";
    FavAnimal = "Tiger";
    TieColor = "Green";
    LauralOrYanny = "Laural";
    age = 17;
    YearsAtAws = 4;
  }

  public void changeName(String newName) {
   user = newName;
 }

  public static void main(String[] args) { //main method
    AboutMe Chloe = new AboutMe();
    System.out.println("Hellooooo! Welcome to today's 'get to know Chloe!'");
    System.out.println("Let's welcome our first contestant: Charlie! \n Are you ready to get statred? ...Or is your name not Charlie...?");
    System.out.println(" Yes I'm Charlie!(answer yes), \n who the heck is Charlie??(answer change name), \n I don't even want to know about Chloe!(answer exit)");
    Scanner in4 = new Scanner(System.in);
    String charlie = in4.nextLine();
    if (charlie.equals("yes")||charlie.equals("Yes")||charlie.equals("YES")){
      //create if else statement, scan the user input for answer "yes"
      System.out.println("Okay Charlie! Let's get started.");
    }
    else if (charlie.equals("Exit")||charlie.equals("exit")||charlie.equals("EXIT")){//if the answer is exit
      System.out.println("K bye.");//print "K bye" and exit.
      System.exit(0);
    }
    else if(charlie.equals("Change name")||charlie.equals("change name")||charlie.equals("CHANGE NAME")){//if answer is change name
      Chloe.changeName("Mr.Considine");//change Chloe.user from "charlie" to "Mr.Considine"
      System.out.println("Okay " + Chloe.user + "! Let's get started.");
    }
    else{
       System.out.println("So...is that a yes or a change name or an exit?");
       //if the answer is something else(i assueme that the user typed something accidentally), ask again.
       Scanner in3 = new Scanner(System.in);//create a scanner for this input
       String decision2 = in3.nextLine();
       if (decision2.equals("Yes")||decision2.equals("yes")||decision2.equals("YES")){
         System.out.println("Okay Charlie! Let's get started.");
       }
       else if(charlie.equals("Change name")||charlie.equals("change name")||charlie.equals("CHANGE NAME")){
         Chloe.changeName("Mr.Considine");
         System.out.println("Okay " + Chloe.user + "! Let's get started.");
       }
       else{
         System.out.println("K bye.");
         System.exit(0);
       }
    }

    System.out.println("So, what do you want to know? \n Choose a catagory from below:"
    + "\n Name(dah) \n Nationality\n"
    + " Favorite Animal \n Tie color \n Laural or Yanny(a popular challange online)"
    + "Age \n Years at AWS \n I wanna know about EVERYTHING!!(answer 'everything' for this option)");
    Scanner in2 = new Scanner(System.in); //create another scanner
    String answer = in2.nextLine();
    //scan what the user input is and give different answer according to the input
    if (answer.equals("Name")||answer.equals("name")||answer.equals("NAME")) {
      System.out.println("Chloe's full name is " + Chloe.name);
    }
    else if (answer.equals("Nationality")||answer.equals("nationality")||answer.equals("NATIONALITY")) {
      System.out.println("Chloe's from The Philippines! She is " + Chloe.nationality);
    }
    else if (answer.equals("Favorite Animal")||answer.equals("favorite animal")||answer.equals("FAVORITE ANIMAL")) {
      System.out.println("Chloe's favorite animal is......" + Chloe.FavAnimal + "! That's why she always uses the name 'littletiger' when playing kahoot.");
    }
    else if (answer.equals("Tie Color")||answer.equals("tie color")||answer.equals("TIE COLOR")) {
      System.out.println("Chloe's a " + Chloe.TieColor + ", aka, the best tie.");
    }
    else if (answer.equals("Laural or Yanny")||answer.equals("laural or yanny")||answer.equals("LAURAL OR YANNY")) {
      System.out.println("Chloe hears" + Chloe.LauralOrYanny + "! Which she thinks is the 'correct' answer, and I strong disagree.");
    }
    else if (answer.equals("Age")||answer.equals("age")||answer.equals("AGE")) {
      System.out.println("Chloe's " + Chloe.age + " years old.");
    }
    else if (answer.equals("Years At Aws")||answer.equals("years at aws")||answer.equals("YEARS AT AWS")||answer.equals("years at AWS")) {
      System.out.println("Chloe spent " + Chloe.YearsAtAws + " years at AWS! She's a senior now.");
    }
    else if (answer.equals("everything")||answer.equals("EVERYTHING")) {
      System.out.println("Chloe's full name is " + Chloe.name
      + ", she's " + Chloe.nationality + ", and her favorite animal is " + Chloe.FavAnimal
      + "! She's" + Chloe.age + " years old, a " + Chloe.TieColor
      + "tie senior and she spent " + Chloe.YearsAtAws + " at AWS." +
      "PS: she hears '" + Chloe.LauralOrYanny + "' in the Laural and Yanny challange.");
    }
    else{
    System.out.println("Well...I don't know about that, you could go ask Chloe.");
  }//if it matches none of the catagory, return this answer.

  } //closes main method
} // closes whole class
