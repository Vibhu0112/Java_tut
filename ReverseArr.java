import java.util.Scanner;

public class ReverseArr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int a[]= new int[n];
    for(int i=0;i<a.length;i++){
      (a[i])=sc.nextInt();
    }
    int st=0;
    int end = (a.length)-1;
    int temp=0;
    for(int i=0;i<a.length/2;i++){
      temp=a[st];
      a[st]=a[end];
      a[end]=temp;
      st++;
      end--;
    }
    System.out.println("new reversed array is: ");

    for(int i=0;i<a.length;i++){
      System.out.print(" "+a[i]);
    }
  }    
}
