import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int previousNo = 0;
        int nextNo =1;
        int sum ;
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(" "+previousNo);
            
            sum= previousNo+nextNo;
            previousNo = nextNo;
            nextNo = sum;

        }
    }
}
