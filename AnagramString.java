import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        boolean isAnagram = false;
        if (str1.length() == str2.length()) {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            isAnagram = Arrays.equals(ch1,ch2);
        }
        System.out.println("Is anagram: " + isAnagram);
        sc.close();
    }
}
