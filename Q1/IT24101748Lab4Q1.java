import java.util.Scanner;

public class IT24101748Lab4Q1 {
      public static void main(String[]args) {
           
    //create a scanner object to read input
           Scanner scanner = new Scanner(System.in);
      
    //input a number
    System.out.print("Enter a NUmber: ");
    double number = scanner.nextDouble();
    scanner.close();
    if (number>0)
    {
        System.out.print("The number is: Positive ");
    }
    else if (number<0)
    {
        System.out.print("The number is: Negative ");
    }
    else
    {
        System.out.print("The number is Zero ");
    }
      }
}