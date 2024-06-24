import java.util.*;
class largest_Number{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number:- ");
      int first_Number=sc.nextInt();
      System.out.println("Enter the second number:- ");
      int second_Number=sc.nextInt();
      System.out.println("Enter the third number:- ");
      int third_Number=sc.nextInt();
      int largest=first_Number>second_Number?first_Number:second_Number;
      int answer=largest>third_Number?largest:third_Number;
      System.out.print("Largest number of all three is "+answer);
   }}