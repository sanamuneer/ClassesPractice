public class Sphere 
    {
         
    private double diameter;
    private double radius;
    
  public Sphere (double width)    
    {
        diameter = width;
    }
    public double radius()
    {
       double radius = diameter / 2;
        return radius;  
    }

    public double volume()
    {
       double volume = 4 * Math.PI * Math.pow(radius, 3);
   
     }
 
    public double SA()
    {
       double SA = 4 * Math.PI * Math.pow(radius, 2);
    }
     
    public String toString()
    {
     String result= ("Sphere diameter is:"+ diameter);
     return result;
       
    }
}
public class MultiSphere 
{
    public static void main(String[]args)
    {
         Sphere S1 = new Sphere(20);
        Sphere S2 = new Sphere(30); 
        System.out.println(S1);
        System.out.println(S2);
       
    }
    
}


    
    
