import java.util.*;
class Swap{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter first number");
      int a=sc.nextInt();
      System.out.print("Enter second number");
      int b=sc.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("Numbers after swap:-"+a+" "+b);
   }
   }
   
   