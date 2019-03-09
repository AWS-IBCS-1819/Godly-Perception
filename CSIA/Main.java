//main class of IA
//Julia Zhu
import java.util.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends Frame{

  //construct the main window, there will be more stuff
  private Frame f;


  public Main() {

    //set size for frame
    setSize(500,500);
    setLayout(null);
    setVisible(true);
    setBackground(new Color(40,50,80));

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

  }

  public void readCloth(){
    try{
      File collab = new File("");//enter file that contains clothes' info
      Scanner sc = new Scanner();

      //each cloth will contain: "category(casual, formal, etc), name, color, number"
      //this loop aims to put clothes into different categories
      for (int i=0;i<=(number of clothes in file);i++ ) {
        if (sc.next().equals("casual")){
          Casual[i] = sc.next();
        }
        else if (sc.next().equals("formal")){
          Formal[i] = sc.next();
        }
        else if (sc.next().equals("stylish")){
          Stylish[i] = sc.next();
        }
        else if (sc.next().equals("comfortable")){
          Comfortable[i] = sc.next();
        }
        else if (sc.next().equals("luxurious")){
          Luxurious[i] = sc.next();
        }
        else{
          Lucky[i] = sc.next();
        }
        sc.nextLine();
      }


    }
    catch(FileNotFoundException e){
      e.printStackTrace();
    }

  }

  public void readJew(){
    try{
      File collab = new File("");//enter file that contains jewelry info
      Scanner sn = new Scanner();

      //this loop aims to put all jewelries in an array since they don't have categories
      for (int i=0;i<=(number of jewelries in file);i++ ) {
        Jewelry[i] = sn.next();
        sn.nextLine();
    }
  }

    catch(FileNotFoundException e){
      e.printStackTrace();
    }
  }

  public void random(){
    //this aims to randomly choose clothes from each catagory
  }

  public static void main(String[] args) {

  }

}
