import java.util.*;
class Even_and_odd_Array{
   public static void main(String args[]){
      int a[]={1,2,3,4,5,6};
     System.out.println("Even elements in array.....");
      for(int i=0;i<a.length;i++){
         if(a[i]%2 == 0){
            System.out.println(a[i]);
            }
            }
       System.out.println("Odd elements in array....");
       for(int i=0;i<a.length;i++){
         if(a[i]%2 != 0){
            System.out.println(a[i]);}
   }}}