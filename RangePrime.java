import java.util.Scanner;

public class RangePrime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a minimum value of range :");
        int min = sc.nextInt();
        System.out.print("Enter a maximum value of range :");
        int max = sc.nextInt();
 
        for (int i = min; i <= max; i++)
            if (isPrime (i))
             System.out.println (i);
        }
     
        static boolean isPrime (int n)
        {
          int count = 0;
     
          // 0, 1 negative numbers are not prime
          if (n < 2)
            return false;
     
          // checking the number of divisors b/w 1 and the number n-1
          for (int i = 2; i < n; i++)
            {
          if (n % i == 0)
             return false;
            }
     
          // if reached here then must be true
          return true;
           } 
}
