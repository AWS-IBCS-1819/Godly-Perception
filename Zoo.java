import java.util.*;

public class Zoo{

  public static void main(String[] args) {
    Animal Monkey = new Animal("Monkeys");
    Enclosure Forest = new Enclosure("Forest", 85);
    Animal Lion = new Animal("Lion");
    Enclosure Plains = new Enclosure("Plains", 91);
    Map<String,String> m = new HashMap<String, String>(); //animal, enclosure
    m.put(Monkey.getName(),Forest.getType());
    m.put(Lion.getName(),Plains.getType());
    System.out.println("Welcome to the zoo!");
    System.out.println("Which animal would you like to know about?");
    System.out.println("Monkeys or lions?");
    Scanner In = new Scanner(System.in); //scan user input
    String answer = In.nextLine();
    if(answer.equals ("monkeys")||answer.equals("Monkeys")){
      System.out.print(m);

    }


  }
}
