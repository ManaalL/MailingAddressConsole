
/**
 * Write a description of class BeginningtoProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class mailingadress {
public static void main (String[] args) {
      System.out.println("Welcome to the mailing adress form, please answer the following details:");  
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your full name");
      String name = scan.nextLine();
      System.out.println("Enter your home adress");
      String homeadress = scan.nextLine();
      System.out.println("Enter your city name");
      String city = scan.nextLine();
      System.out.println("Enter your country's two letter country code ");
      String country = scan.nextLine();
      System.out.println("Enter your postal code");
      String postalcode = scan.nextLine();
      
      System.out.println("-----------------------------------");
      System.out.println(name);
      System.out.println(homeadress);
      System.out.println(city + "," + country);
      System.out.println(postalcode);
      System.out.println("-----------------------------------");
      
      System.out.println("Thank you for filling this out!"); 
      
      
}
}






