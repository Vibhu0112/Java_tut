import java.util.Scanner;

public class findUnique {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            int n;
            // int m;
              n=sc.nextInt();
              int arr[]=new int[n];

              for(int j=0;j<n;j++){
                  arr[j]=sc.nextInt();
              }
          findUnique(arr);
    }
    public static int findUnique(int[] arr){
      //Your code goes here
          int ans = 0 ; 
          for(int i=0;i<arr.length;i++){
              ans =ans^arr[i];
          }
          System.out.print(ans);
        return ans;
          
    }
}
