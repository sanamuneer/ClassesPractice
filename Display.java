import java.util.Random;
import java.lang.Math;
public class Display
{
    public static void main(String[]args)
    {
        
        Random generator = new Random();
        int radius , height;
        height= generator.nextInt(11)+1;
        radius= generator.nextInt(11)+1;
        double volume , surfaceArea ;
        double PI;
        volume=  Math.PI*Math.pow(radius,2)*height;
        surfaceArea= 2* Math.PI*(radius*height);
        System.out.println("volume of cylinder." + volume);
        System.out.println("SurfaceArea of cylinder." + surfaceArea);
        
        
    }
}
