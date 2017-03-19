import java.util.Scanner;
public class UserName
{
public static void main(String[] args)
{
String FirstName;
String LastName;
String Result;

Scanner input = new Scanner(System.in);


System.out.print("Please Enter First Name: ");
FirstName=input.nextLine();


System.out.print("Please Enter Last Name: ");
LastName=input.nextLine();

System.out.println("Name is:"+FirstName+" "+LastName);


int randomNum = 10 + (int)(Math.random()*99);

Result=FirstName.substring(0,1)+LastName.substring(0,5)+randomNum;


System.out.println("Output is:"+Result);

}

}

        
