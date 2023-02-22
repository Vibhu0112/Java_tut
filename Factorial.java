import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long factorial=1;
        System.out.print("Enter a Number: ");
        long a =sc.nextLong();
        for(long i=1;i<=a;i++){
            factorial=i*factorial;
        }
        System.out.print("Factorial of "+a+" is : "+factorial);
    }
     
   }
