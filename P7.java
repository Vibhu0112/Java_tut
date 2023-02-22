package patterns;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =1;
        int row =1;
        while(row<=n){
            int col =1;
            while(col<=row){
                System.out.print(count+" ");
                count = count+1;
                col = col+1;
            }
            System.out.println();
            row=row+1;
        }
    }
}
