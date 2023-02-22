import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        int reverse=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        while(n!=0){
            int rem = n%10;
            reverse = reverse*10+rem;
            n=n/10;
        }
        System.out.println("Reverse of number is :"+reverse);
    }
}
