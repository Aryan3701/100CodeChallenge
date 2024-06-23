import java.util.*;
class Even_Odd_Digits{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number ");
      int number=sc.nextInt();
      int even=0;
      int odd=0;
      while(number>0){
         int digit=number%10;
         if(digit == 0){
            even++;}
         if(digit % 2 == 0){
            even++;}
         else{
            odd++;}   
         number=number/10;   
         }
         System.out.print("Even digits:- "+even+" Odd digits:- "+odd);      
   }
   }