import java.util.*;
class Reversestring{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the string ");
     String s=sc.next();
     String reverse="";
     for(int i=s.length()-1;i>=0;i--){
         reverse=reverse+s.charAt(i);
         }
      System.out.print("Reverse string "+reverse);
      }
}