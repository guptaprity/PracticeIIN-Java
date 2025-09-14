import java.util.Scanner;
public class OddEven{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if(n%2==0) {
      System.out.println("It is a even number =" +n);
    }

    else {
       System.out.println("It is a Odd number =" +n);
    }
    sc.close();
  } 
}
