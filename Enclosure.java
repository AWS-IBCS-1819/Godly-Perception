public class Enclosure{

  String type;
  int temp;

  public void setType(String ty) {
    type = ty;
  }

  public String getType() {
    return type;
  }

  public void setTemp(int t) {
    temp = t;
  }

  public Integer getTemp() {
    return temp;
  }

  public Enclosure(String ty, int t) {
    this.type = ty;
    this.temp = t;
  }
}
