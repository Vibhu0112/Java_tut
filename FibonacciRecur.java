import java.util.Scanner;

public class FibonacciRecur {
    public static int fibonacciRecur(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
                return 1;
            }
        return fibonacciRecur(n-2) + fibonacciRecur(n-1);
        }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        
        for(int i = 0; i < a; i++){
                System.out.print(fibonacciRecur(i) +" ");
            }
        }
}
