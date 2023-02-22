public class OverLoading {

    public static void rose() {
        System.out.println("Rose is a beautiful flower");
        System.out.println("Rose is a beautiful flower");
    }

    public static void rose(String flower) {
        System.out.println(flower + " is a beautiful flower");
        System.out.println(flower + " is a beautiful flower");
    }

    public static void rose(String flower,int times) {
        for (int i = 0;i<times;i++) {
            System.out.println(flower + " is a beautiful flower");
        }
    }

    public static void main(String[] args) {
        rose();
        rose("Sunflower");
        rose("Marigold",4);
    }
}
