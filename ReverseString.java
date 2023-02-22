public class ReverseString {
    public static void main(String[] args) {
        
        String str = "Printing the string in reverse order";
        String[] words = str.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1;i>= 0;i--) {
            sb.append(words[i] + " ");
        }
        System.out.println(sb.toString());
    }
}
