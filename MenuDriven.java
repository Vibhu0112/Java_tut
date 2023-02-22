// switch done  ,if done,for  done,while ,do

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
         System.out.println("1: Result .");
         System.out.println("2: Attendence .");
         System.out.println("3: Res .");  
         System.out.println("4: Exit .");  

         System.out.print("Enter your choice: ");
         ch= sc.nextInt();
          switch(ch)
          {
              case 1:// result
                 System.out.println("Enter marks of physics:");
                 int p =sc.nextInt();
                 System.out.println("Enter marks of chemistry:");
                 int c =sc.nextInt();
                 System.out.println("Enter marks of maths:");
                 int m =sc.nextInt();
                 int t=(p+c+m);
                 int P= (t*100)/300;
                 System.out.println("Total marks obtained:"+t);
                 System.out.print("percentage :"+P);
                 System.out.print("        Grade:");

                 if(P<100 && P>=75)
                    System.out.println("Destinction");                    
                 
                 else if(P<75 && P>=60)
                    System.out.println("First division ");                    
                 
                 else if(P<60 && P>=50)
                  System.out.println("Second division ");                    
                
                else if(P<50 && P>=33)
                  System.out.println("Third division ");                    
               
               else if(P<33)
                  System.out.println("Fail");                    
               
               if (p>100 || c>100 || m>100){
                  System.out.println("Invalid Input");
                  System.out.println("marks can't be greater than 100");
               }
               System.out.println(" ");

               break;
               case 2:
                 System.out.println("Enter number of days :");
                 int n= sc.nextInt();
                 int a[] = new int[n];
                 int sum=0;
                 System.out.println("Enter values:");
                 for(int i=0;i<a.length;i++){
                 a[i]=sc.nextInt();
                 if(a[i]<0 || a[i]>1)
                 System.out.println("Sorry ! Invalid input......");
                 
                /* if (a[i]==0)
                 System.out.println("abs");
                 else if (a[i]==1)
                 System.out.println("p");*/
                 sum=sum+a[i];
                 }
               System.out.println("attendence of student is:"+sum+" out of "+n+" days");
               System.out.println(" ");
               break;
               case 3:
                  
               break;
               case 4:
               break;
               default: System.out.println("You Entered wrong menuOption");
               
          }//switch

         }//do
         while (ch!=4);
    }//main
}//class
