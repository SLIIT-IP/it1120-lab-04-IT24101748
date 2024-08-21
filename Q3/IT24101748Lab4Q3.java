import java.util.Scanner;

public class IT24101748Lab4Q3 {
      public static void main(String[]args) {
           
    //create a scanner object to read input
           Scanner scanner = new Scanner(System.in);
      
    //input a number
    System.out.print("Enter a NUmber: ");
    double number = scanner.nextDouble();
    scanner.close();

   //number checking
   String result =(number>0) ? ("Positive") : (number<0) ? ("Negative"):("Zero") ;
   System.out.print("The number is: " + result );
      }
}