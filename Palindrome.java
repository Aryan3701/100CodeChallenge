import java.util.*;
class Palindrome{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number ");
      int number=sc.nextInt();
      int original=number;
      int Palindrome=0;
      while(number>0){
         Palindrome=Palindrome*10 + number%10;
         number=number/10;
         }
      if(original == Palindrome){
         System.out.print("Palindrome Number");
         }
      else{
         System.out.print("Not Palindrome Number");
         }
   }
   }