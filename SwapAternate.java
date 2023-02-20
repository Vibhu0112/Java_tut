import java.util.Scanner;

public class SwapAternate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int a[]= new int[n];
    for(int i=0;i<a.length;i++){
      (a[i])=sc.nextInt();
    }
    int start=0;
    int next=start+1;
    int temp=0;
    for(int i=0;i<a.length/2;i++){
      temp=a[start];
      a[start]=a[next];
      a[next]=temp;
      start=start+2;
      next=next+2;
    }
    System.out.println("new swapped array is: ");

    for(int i=0;i<a.length;i++){
      System.out.print(" "+a[i]);
    }
  }   
}
