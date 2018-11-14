// project zoo by Rashida and Julia

import java.util.*; //import printers

public class Zoo{ //create class Zoo

  public void printAnimal (Animal[] a){
    for(int i = 0; i < a.length; i++){
      System.out.println(a[i].getName());
    }


  }
  public Zoo(){
  }


  public static void main(String[] args) { //main

    Zoo z = new Zoo();


    Enclosure g1 = new Enclosure("Plains", 91, "Rashida");
    Enclosure g2 = new Enclosure("Forest", 75, "Julia");
    Enclosure[] yes = {g1, g2};

    Animal q1 = new Animal("Big Giraffee", "Black", 6);
    Animal q2 = new Animal("Silly Giraffee", "Brown", 13);
    Animal q3 = new Animal("Mad Giraffee", "Spots", 100);
    Animal q4 = new Animal("Happy Giraffee", "White", 25);
    Animal[] Giraffee = {q1, q2, q3, q4};

    Animal w1 = new Animal("Black Bear", "Black",23);
    Animal w2 = new Animal("Grizzly Bear", "Brown", 56);
    Animal w3 = new Animal("Polar Bear", "White", 2100);
    Animal w4 = new Animal("Bear Bear", "Rainbow", 20);
    Animal[] Bear = {w1, w2, w3, w4};

    Map<String, Animal[]> m;
    m = new HashMap<String, Animal[]>();
    m.put(g1.getType(), Giraffee);
    m.put(g2.getType(), Bear);

     //whilte loop so user can do it over and over again
    System.out.println("\n");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Welcome to the zoo!");
    System.out.println("Here are all the enclosures we have:");
    System.out.print(yes[0].getType() + ", ");
    System.out.print(yes[1].getType());
    while(true){
    System.out.println("\n Which one would you like to know about? Plains or forests? (enter exit if you want to quit)");
    Scanner In = new Scanner(System.in); //scan user input
    String answer = In.nextLine();
    if(answer.equals ("plains")||answer.equals("Plains")){ //if user wants to see monkeys
      System.out.println("The temperature of the plains is "+ g1.getTemp());
      System.out.println("And the keeper of the plains is "+ g1.getKeeper());
      System.out.println("Here are all the animals in the plains: ");
      z.printAnimal(m.get("Plains"));
      System.out.println("Which specific giraffee do you want to know more about?");
      Scanner In1 = new Scanner(System.in); //scan user input
      String answer2 = In1.nextLine();
      if(answer2.equals ("Big Giraffee")||answer2.equals("big giraffee")){
        System.out.println("The big giraffee is " + q1.getColor() + " and he is " + q1.getHeight() + " feet tall.");
      }
      else if(answer2.equals ("Silly Giraffee")||answer2.equals("silly giraffee")){
        System.out.println("The silly giraffee is " + q2.getColor() + " and he is " + q2.getHeight() + " feet tall.");
      }
      else if(answer2.equals ("Mad Giraffee")||answer2.equals("mad giraffee")){
        System.out.println("The mad giraffee is " + q3.getColor() + " and she is " + q3.getHeight() + " feet tall.");
      }
      else if(answer2.equals ("Happy Giraffee")||answer2.equals("happy giraffee")){
        System.out.println("The happy giraffee is " + q4.getColor() + " and she is " + q4.getHeight() + " feet tall.");
      }
    }
    else if(answer.equals ("forest")||answer.equals("Forest")){ //if user wants to see monkeys
      System.out.println("The temperature of the forest is "+ g2.getTemp());
      System.out.println("And the keeper of the forest is "+ g2.getKeeper());
      System.out.println("Here are all the animals in the forest: ");
      z.printAnimal(m.get("Forest"));
      System.out.println("Which specific bear do you want to know more about?");
      Scanner In2 = new Scanner(System.in); //scan user input
      String answer3 = In2.nextLine();
      if(answer3.equals ("Black Bear")||answer3.equals("black bear")){
        System.out.println("The black bear is " + w1.getColor() + " and he is " + w1.getHeight() + " feet tall.");
      }
      else if(answer3.equals ("Grizzly Bear")||answer3.equals("grizzly bear")){
        System.out.println("The grizzly bear is " + w2.getColor() + " and he is " + w2.getHeight() + " feet tall.");
      }
      else if(answer3.equals ("Polar Bear")||answer3.equals("polar bear")){
        System.out.println("The polar bear is " + w3.getColor() + " and he is " + w3.getHeight() + " feet tall.");
      }
      else if(answer3.equals ("Bear Bear")||answer3.equals("bear bear")){
        System.out.println("The bear bear is " + w4.getColor() + " and she is " + w4.getHeight() + " feet tall.");
      }
    }
    else if(answer.equals ("exit")||answer.equals("Exit")){ //if the user wants to quit
    break; //break while loop
      }
    }
  }
}
