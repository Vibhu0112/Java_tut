import java.util.Scanner;

public class FactorialRecur {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        long factorial = FactorialRecur(num);
        System.out.print("Factorial of " + num + " is : " + factorial);
    }
    public static long FactorialRecur(long num)
    {
        if (num >= 1)
            return num * FactorialRecur(num - 1);
        else
            return 1;
    }
    }

