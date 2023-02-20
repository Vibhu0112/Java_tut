public class MethodOverloaing {
    static void go(int [] arr){
        System.out.println("arr0 "+arr[0]);
        System.out.println("arr1 "+arr[1]);
        arr[1]=22;
    }
    static void go(int i){
        System.out.println("arr0 "+i+" go(int i)");
        // System.out.print("arr1"+arr[1]);
        // arr[1]=22;
    }
    static void go(short s){
        System.out.println("arr0 "+s+" go(short s");
        // System.out.print("arr1"+arr[1]);
        // arr[1]=22;
    }
    public static void main(String[] args) {
        int [] arr={1,2};
        go(arr);
        System.out.println("arr1 "+arr[1]);
        go(1000);
        byte b = 22;
        go(b);
    }
}
