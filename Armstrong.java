import java.util.*;
class Armstrong{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:- ");
  int n=sc.nextInt();
  int actual=n;
  String number=Integer.toString(n);//converting number to string to find its length to determine how many digits are present in number
  int pow=number.length();
  int sum=0;
  while(n>0){
   sum+=Math.pow(n%10,pow);
   n=n/10;
   
  }
  if(sum == actual){
   System.out.println("Number is armstrong");
   }
  else{
   System.out.println("Not Armstrong");
   }
 }  }                                                                                         