public class P10 {
    public static void main(String[] args) {
        int n=5;
		int j;
		for(int i=0;i<n;i++){
		    //System.out.print(" ");
		    for(j=n-i;j>0;j--){
		        System.out.print(" ");
		    }
		    for(int k=0;k<i+1;k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	
    }
}
