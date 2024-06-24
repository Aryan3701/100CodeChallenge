import java.util.*;
class Sum_of_elements{
   public static void main(String args[]){
      int a[]={1,2,3,4,2};
      for(int j=0;j<a.length;j++){
         System.out.print(a[j]+" ");
      }
      
      int count=0;
      for(int i=0;i<a.length;i++){
         count=count+a[i];
         }
      System.out.println();
      System.out.println("Sum of all elements in the array is "+count);
      }}