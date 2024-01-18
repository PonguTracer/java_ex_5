import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);         
      /* Type your code here. */
      int one, two, three, sum;
      
      one = scnr.nextInt();
      two = scnr.nextInt();
      three = scnr.nextInt();
      
      if (one < 0 || two < 0 || three < 0) {
         System.out.println("Invalid input!");
         return;    
      }
      sum = one * 100 + two * 10 + three * 1;
      
      if (sum % 3 == 0) {
         System.out.println(sum + " is divisible by 3!");
      } else {
         System.out.println(sum + " is not divisible by 3!");
      }
   }
}
