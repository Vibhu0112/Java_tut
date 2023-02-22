public class StringCounts {
    public static void main(String[] args) {
        String str = "Java C++ python Java C++ python Java C++ python";
        int count = str.length();
        System.out.println("Total number of characters: " + count);

        str = "Java C++ python Java C++ python Java C++ python";
        String[] words = str.split(" ");
        System.out.println("Total number of words: " + words.length);

        str = "Java C++ python \nJava C++ python \nJava C++ python";
        String[] lines = str.split("\n");
        System.out.println("Total number of lines: " + lines.length);
    }
}
