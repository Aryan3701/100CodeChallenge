class Missing_no{
   public static void main(String args[]){
      int arr[]={1,2,3,5};
      int n=5; // number of terms in array
      int sum=n*(n+1)/2; // sum of first n natural numbers
      int actual_Sum=0;
      for(int num:arr){
         actual_Sum+= num; // Subtraction of sum and actual sum to find the missing number
      }
      int missing_No=sum-actual_Sum;
      System.out.print("Missing number is:- "+missing_No);
      }}