import java.util.*;

public class Spooky{

  public static void main(String[] args) {

    System.out.println("Welcome to Spooky. Would you like to check out our collection of Halloween costumes?");
    Scanner yes = new Scanner(System.in);
    Scanner answer = yes.nextLine();
    if (answer.equals("Yes")||)


    Map<String,Integer> m = new HashMap<String, Integer>();
    m.put("Regular Zombie", 1);
    m.put("Regular Vampire", 1);
    m.put("Dracula", 3);
    m.put("Hades", 4);
    m.put("Cerberus", 3);
    m.put("Ginormous Zombie", 3);
    m.put("Snowman", 0);
    m.put("Michael Myers", 4);
    m.put("Leatherface", 4);

    System.out.println(m);
  }
}
