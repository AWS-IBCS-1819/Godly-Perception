public class Enclosure{

  String type;
  String keeper;
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

  public void setKeeper(String ke) {
    keeper = ke;
  }

  public String getKeeper() {
    return keeper;
  }

  public Enclosure(String ty, int t, String ke) {
    this.type = ty;
    this.temp = t;
    this.keeper = ke;
  }
}
