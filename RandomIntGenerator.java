import java.util.Random;
import java.lang.Math;

public class RandomIntGenerator
{ 
    public static void main(String[] args) 
    { 
    Random generator = new Random();
    int num;
    num = generator.nextInt();
    num = generator.nextInt(21)+20;

   System.out.println("Generated number: " + num); 
   System.out.println("Sine: " + Math.sin(num)); 
   System.out.println("Cosine: " + Math.cos(num)); 
   System.out.println("Tangent: " + Math.tan(num));
    }
}    
