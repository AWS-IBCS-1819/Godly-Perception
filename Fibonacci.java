//return the nth Fibonacci number
//each number is sum of previous 2
import java.util.*;

public class Fibonacci{

  public static int fibonacci(int n){
    if(n == 1){
      return 1;
    }
    else if(n == 2){
      return 1;
    }
    else{
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }


  public static void main(String[] args) {
    int num = 6;
    int numm = fibonacci(num);
    System.out.println(numm);



  }

}
