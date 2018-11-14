public class Animal{ //creating a class for all the animals

  String name; //create a string for animal names
  String color; //create a string for color
  int height; //create a integer for height

  public void setName(String n) { //method for setting names
    name = n;
  }

  public String getName() { //method for getting names
    return name;
  }

  public void setColor(String c) { //method for setting color
    color = c;
  }

  public String getColor() { //method for getting color
    return color;
  }

  public void setHeight(int h) { //method for setting height
    height = h;
  }

  public int getHeight() { //method for getting height
    return height;
  }


  public Animal(String n, String c, int h) {
    this.name = n;
    this.color = c;
    this.height = h;
  }

}
