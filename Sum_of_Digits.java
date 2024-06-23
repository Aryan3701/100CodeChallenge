import java.util.*;
class Sum_of_Digits{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number:- ");
      int number=sc.nextInt();
      int sum=0;
      while(number>0){
         sum=sum + number%10;
         number/=10;
         }
      System.out.print("Sum of digits of number:- "+sum);
   }
   }