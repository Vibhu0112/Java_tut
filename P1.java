package patterns;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        int n = sc.nextInt();
        System.out.println();
        while(i<=n){
          int j=1;
          while(j<=n){
           System.out.print(" "+j);
           j=j+1;
          }
          System.out.println();
          i=i+1;
   
        }
   
    }
}
