import java.util.*;
class Countdigits{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number ");
      int number=sc.nextInt();
      int count=0;
      if(number == 0){
         System.out.print("Number is zero");
         }
      else{
      while(number>0){
         number=number/10;
         count++;
      }
      }
      System.out.print("Total number of digits in number is "+count);
      }
   }