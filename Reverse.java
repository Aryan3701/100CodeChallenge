import java.util.*;
class Reverse{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number");
      int number=sc.nextInt();
      int rev=0;
      if(number>0){
         while(number>0){
            rev=rev*10+number%10;
            number=number/10;
            }
      }
      System.out.print("Reverse Number:-"+rev);
      }
}