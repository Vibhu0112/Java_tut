import java.util.Scanner;

public class DeclareImplement {
    public static void main(String[] args) {

        //predefined array size and input
        // 1st method 
        int a[]= new int[4];
        a[0]=1;
        a[1]=3;
        a[2]=6;
        a[3]=12;
        for(int i=0;i<a.length;i++){
            System.out.println("term "+(i+1)+" : "+a[i]);
        }

        //2nd method
        int c []= new int[] {1,8,2,9};
        for(int i=0;i<c.length;i++){
            System.out.println("term "+(i+1)+" : "+c[i]);
        }

        //3rd method
        int d []=  {1,5,7,9};
        for(int i=0;i<d.length;i++){
            System.out.println("term "+(i+1)+" : "+d[i]);
        }


        // Student []students = {new Student(),new Student(),new Student()};
        // students[0].name="vibhu";
        // students[1].name="xyz";
        // students[2].name="abc";
        // System.out.println("term  : "+students[0].name);
        // System.out.println("term  : "+students[1].name);
        // System.out.println("term  : "+students[2].name);

        // for(int i=0;i<students.length;i++){
        //     System.out.println("term "+(i+1)+" : "+students[i].name);
        // }


       //  taking size and input of an array from user
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of an array : ");
       int n = sc.nextInt();
       int b[] = new int[n]; 
       //taking input form user
       for(int i=0;i<b.length;i++){
             b[i]=sc.nextInt();
       }
       //displaying the array
       for(int i=0;i<b.length;i++){
            System.out.println("term "+(i+1)+" : "+b[i]);
        }




       
    }
}
