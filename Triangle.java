import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
        double a, b, c, s, area; 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first side :"); 
        a = scan.nextDouble();
        System.out.print("Enter the second side :"); 
        b = scan.nextDouble();
        System.out.print("Enter the third side :"); 
        c = scan.nextDouble();
        s = (a + b + c )/ 3 ;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.print("Area of Triangle is:"+area+" sq units");
    }
}      

