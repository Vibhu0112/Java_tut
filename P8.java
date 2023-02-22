package patterns;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        /*int row=1;
        while(row<=n){
            int col=1;
            int z=row;
            while(col<=row){
                System.out.print(z+" ");
                z =z+1;
                col=col+1;
            }
            System.out.println();
            row=row+1;        }*/
            
            int i=1;
            while (i <= n) {
                int j = 0;
                while(j < i) {
                    System.out.print((j+i)+" ");
                    j++;
                }
                System.out.print("\n");
                i++;}
    }
}
