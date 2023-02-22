public class RemoveSpace {
    public static void main(String[] args) {
        String str = "Java     C++ python    Java     C++     python";
        str = str.replaceAll("\\s","");
        System.out.println(str);
    }
}
