public class Animal{ //creating a class for all the animals

  String name; //create a string for animal names

  public void setName(String n) { //method for setting names
    name = n;
  }

  public String getName() { //method for getting names
    return name;
  }

  public Animal(String n) {
    this.name = n;
  }

}
