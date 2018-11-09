// project zoo by Rashida and Julia

import java.util.*; //import printers

public class Zoo{ //create class Zoo

  public static void main(String[] args) { //main

    Animal Monkey = new Animal("Monkeys"); //create new animal - monkeys
    Enclosure Forest = new Enclosure("Forest", 85, "Julia");

    Animal Lion = new Animal("Lion"); //create new animal - lions
    Enclosure Plains = new Enclosure("Plains", 91, "Rashida");

    Animal Gator = new Animal("Gator"); //create new animal - gators
    Enclosure AWS = new Enclosure("Annie Wright", 100000, "Some one called Zach");

    Map<String,String> m = new HashMap<String, String>(); //create new hashmap for (animal, enclosure)
    m.put(Monkey.getName(),Forest.getType()); //add monkey to map
    m.put(Lion.getName(),Plains.getType()); //add lion to map
    m.put(Gator.getName(),AWS.getType()); //add gator to map

    Map<String,Integer> m2 = new HashMap<String, Integer>(); //create another hashmap for (animal, temperature)
    m2.put(Monkey.getName(), Forest.getTemp()); //add monkey to map
    m2.put(Lion.getName(), Plains.getTemp()); //add lion to map
    m2.put(Gator.getName(), AWS.getTemp()); //add gator to map

    Map<String,String> m3 = new HashMap<String, String>(); //create another hashmap for (animal, keeper)
    m3.put(Monkey.getName(), Forest.getKeeper()); //add monkey to map
    m3.put(Lion.getName(), Plains.getKeeper()); //add lion to map
    m3.put(Gator.getName(), AWS.getKeeper()); //add gator to map

    while(true){ //whilte loop so user can do it over and over again
    System.out.println("\n");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Welcome to the zoo!");
    System.out.println("Which animal would you like to know about?");
    System.out.println("Monkeys, lions, or gators?(enter exit if you want to quit)");

    Scanner In = new Scanner(System.in); //scan user input
    String answer = In.nextLine();
    if(answer.equals ("monkeys")||answer.equals("Monkeys")){ //if user wants to see monkeys
      String mon = m.get(Monkey.getName()); //get the enclosure value according to the key "monkeys"
      System.out.println("Monkeys live in the "+ mon + " enclosure!");
      int mon2 = m2.get(Monkey.getName()); //get the temperature value accoding to the key "monkeys"
      System.out.println("The temperature of that enclosure is "+ mon2 + ".");
      String monk = m3.get(Monkey.getName());
      System.out.println("And the keeper of this enclosure is "+ monk + ".");
    }
    else if(answer.equals ("lions")||answer.equals("Lions")){ //if user wants to see lions
      String mon3 = m.get(Lion.getName()); //get the enclosure value according to the key "lions"
      System.out.println("Lions live in the "+ mon3 + " enclosure!");
      int mon4 = m2.get(Lion.getName()); //get the temperature value accoding to the key "lions"
      System.out.println("The temperature of that enclosure is "+ mon4 + ".");
      String monkk = m3.get(Lion.getName());
      System.out.println("And the keeper of this enclosure is "+ monkk + ".");
    }
    else if(answer.equals ("gators")||answer.equals("Gators")){ //if user wants to see gators
      String mon5 = m.get(Gator.getName()); //get the enclosure value according to the key "gators"
      System.out.println("Gators live in "+ mon5);
      int mon6 = m2.get(Gator.getName()); //get the temperature value accoding to the key "gators"
      System.out.println("The temperature of AWS is "+ mon6 + ".");
      String monkkk = m3.get(Gator.getName());
      System.out.println("And the keeper of AWS is "+ monkkk + ".");
    }
    else if(answer.equals ("exit")||answer.equals("Exit")){ //if the user wants to quit
    break; //break while loop
  }
  }


  }
}
