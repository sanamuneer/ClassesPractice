import java.util.Scanner;
import java.util.Random;
public class PhoneNo {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner (System.in);
        Random r = new Random ();
        int abc,d,efgh;
         
        abc = r.nextInt(1000);
        efgh = r.nextInt(10000);
         
        d = r.nextInt(743);
        if ( d >= 100 && d <= 742)
            System.out.println ("The phone number is: " + abc + "-" + d + "-" + efgh);
        if ( d < 100 && d >= 10)
            System.out.println ("The phone number is: " + abc + "-" + "0" + d + "-" + efgh);
        if ( d < 10 && d > 0)
            System.out.println ("The phone number is: " + abc + "-" + "00" + d + "-" + efgh);
        if ( d == 0)
            System.out.println ("The phone number is: " + abc + "-" + "000" + "-" + efgh);
    }
 
 
 
    }
