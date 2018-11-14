public class Animal{ //creating a class for all the animals

  String name; //create a string for animal names
  String color;
  int height;

  public void setName(String n) { //method for setting names
    name = n;
  }

  public String getName() { //method for getting names
    return name;
  }

  public void setColor(String c) { //method for setting names
    color = c;
  }

  public String getColor() { //method for getting names
    return color;
  }

  public void setHeight(int h) { //method for setting names
    height = h;
  }

  public int getHeight() { //method for getting names
    return height;
  }


  public Animal(String n, String c, int h) {
    this.name = n;
    this.color = c;
    this.height = h;
  }

}
