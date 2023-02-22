public class ReverseEveryWord {
    public static void main(String[] args) {
        String str1 = "Java is not a scripting language";
        String[] each_words = str1.split(" ");
        String revString = "";
        for (int i = 0;i<each_words.length;i++) {
            String word = each_words[i];
            String reverseWord = "";
            for (int j = word.length() - 1;j>= 0;j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            revString = revString + reverseWord + " ";
        }
        System.out.println(revString);
    }
}
