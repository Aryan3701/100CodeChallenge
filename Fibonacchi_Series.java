import java.util.*;
class Fibonacchi_Series{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number upto which u want the series ");
      int n=sc.nextInt();
      int num1=0;
      int num2=1;
      int sum=0;
      System.out.print(num1+" "+num2);
         for(int i=3;i<=n;i++){
          sum=num1+num2;
          num1=num2;
          num2=sum;
          System.out.print(" "+sum+" ");             
         }
         }}
      
      
   

