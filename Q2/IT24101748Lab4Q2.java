import java.util.Scanner;

public class IT24101748Lab4Q2 {
      public static void main(String[]args) {
           
    //create a scanner object to read input
           Scanner scanner = new Scanner(System.in);
      
    //input exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
         if (examMarks>100 || examMarks<0)
         {
            System.out.print("Invalid input for exam marks. Terminatig program.");
            System.exit(0);
         }
         
      //input lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
         double labMarks = scanner.nextDouble();
         if (labMarks>100 || labMarks<0)
         {
             System.out.print("Invalid input for lab marks. Terminatig program.");
              System.exit(0);
         }
         
    //input exam percentage
        System.out.print("Please enter the percentage given for the exam: ");
         double examPercentage = scanner.nextDouble();
    //input lab submission percentage
        System.out.print("Please enter the percentage given for the lab submission : ");
         double labPercentage = scanner.nextDouble();
        if (examPercentage+labPercentage>100 || examPercentage+labPercentage<100)
        {
            System.out.print("The percentage must add up to 100. Terminating program");
            System.exit(0);
        }
    
    //calculation for final marks
    double finalMarks=((labMarks*labPercentage)/100) + ((examMarks*examPercentage)/100);
    System.out.print("Final Exam Mark is: " + finalMarks);
    
      }
}