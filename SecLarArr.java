import java.util.Scanner;

public class SecLarArr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int t1=a[0];
        int t2=a[n-1];

        System.out.println("Enter numbers in array : ");
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        // for(int i=0;i<n;i++){
        //   if(a[i]>a[i+1]){
        //     first = a[i];
        //     second = a[i+1];
        //   }else{
        //     first = a[i+1];
        //     second = a[i];
        //   }
        // }
        // for(int)


        for(int i=0;i<n/2;i++){
          if(t1<a[i+1]){
            t1=a[i+1];
          }
          if(t2<a[n-2-i]){
            t2=a[n-i-2];
          }
        }
        if(t1>t2){
            System.out.print(t2+" is the second largest number");
        }else{
            System.out.print(t1+" is the second largest number");

        }
    }
}
