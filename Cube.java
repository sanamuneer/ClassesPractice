import java.util.Scanner;
public class Cube {
    public static void main(String[]args)
    {
      int num1 = 0;
      int num2 = 0;
      double cube = 0;
      Scanner scan = new Scanner(System.in);
      System.out.println("please enter first number");
      num1= scan.nextInt();
      System.out.println("please enter second number");
      num2 = scan.nextInt();
      cube=Math.pow(num1,3)+ Math.pow(num2,3);
      System.out.println("Cube of"+num1+"and"+num2+"="+cube);
    }
    
}
