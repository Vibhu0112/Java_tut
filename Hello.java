import java.util.Scanner;

class Hello {

   public static void main(String[] args){
     System.out.println("Hello Vibhu.....");
     Scanner sc = new Scanner(System.in);
     int max=0;
     int output[];
     output = new int[6];
     int a[];
     a=new int[5];
       //	int count[max+1];
       //	int output[5];
         System.out.println("enter elements in array - ");
 
         for(int i=0;i<5;i++){
             a[i] = sc.nextInt(); 
         }
         for(int i=0;i<5;i++){
           System.out.print(a[i]+" ");  
              }
         for(int i=0;i<5;i++){
           if(a[i]>max){
             max = a[i];
           }
         }
         System.out.println();  
         System.out.println("max element is "+max);
         int count[]=new int[max+1];

         for (int i = 0; i <= max; ++i)   
         {  
           count[i] = 0; // Initialize count array with all zeros  
         } 

         for(int i=0;i<5;i++){
          count[a[i]]++; 
            }
         for(int i=1;i<=max;i++){
          count[i]=count[i]+count[i-1];
         }  
         for(int i=4;i>=0;i--){
           output[count[a[i]]-1]=a[i];
           count[a[i]]--;
         } 
         for(int i=0;i<5;i++){
           a[i]=output[i];
        }
        for(int i=0;i<5;i++){
          System.out.print(a[i] + " ");
       }
}

}  
