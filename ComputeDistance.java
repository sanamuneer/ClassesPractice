import java.util.Scanner;
 public class ComputeDistance{ 
 public static void main (String[] args){ 
    Scanner scan = new Scanner(System.in); 
   double x1,x2,y1,y2,distance; 
  System.out.print ("Enter the (x,y) coordinates of a point: "); 
  x1 = scan.nextDouble(); 
  y1 = scan.nextDouble(); 
  System.out.print ("Enter the (x,y) coordinates of another point: "); 
  x2 = scan.nextDouble(); 
  y2 = scan.nextDouble(); 
  distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 
  System.out.println ("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance + ".");
}
