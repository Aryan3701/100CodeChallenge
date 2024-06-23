import java.util.*;
class PalindromeString{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the word ");
      String word=sc.next();
      String original=word;
      String palindrome="";
      for(int i=word.length()-1;i>=0;i--){
         palindrome=palindrome + word.charAt(i);
         }
      if(original.equals(palindrome)){
         System.out.print("Palindrome String");
         }
      else{
         System.out.print("Not palindrome String");
         }
      
   }
   }