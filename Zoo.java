import java.util.*;

public class Zoo{

  public static void main(String[] args) {
    Animal monkey = new Animal();
    monkey.setName("Monkey");
    monkey.setType("Forest");
    monkey.setTemp(85);
    Animal lion = new Animal();
    lion.setName("Lion");
    lion.setType("Jungle");
    lion.setTemp(91);
    Map<String,String> m = new HashMap<String, String>(); //animal, enclosure
    Map<String,Integer> f = new HashMap<String, Integer>(); //animal, temperature

    System.out.println("Welcome to the zoo!");
    System.out.println("Which animal would you like to know about?");
    System.out.println("Monkeys or lions?");

  }
}
