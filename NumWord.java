import java.util.Scanner;

public class NumWord {
    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type a number(max upto 9 digits)");
        try {
               // read the number
           number = sc.nextInt();
           if (number == 0) {
            System.out.print("Number in words: Zero");
           } else {
            System.out.print("Number in words: " + numToWord(number));
           }
         } catch (Exception e) {
            System.out.println("Please enter a valid number");
         }
        // close the reader
        sc.close();
       }
     
       private static String numToWord(int number) {
            // variable to hold string representation of number 
            String words = "";
            String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                          "seven", "eight", "nine", "ten", "eleven", "twelve",
                          "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                          "eighteen", "nineteen" };
        String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                          "sixty", "seventy", "eighty", "ninety" };
     
        if (number == 0) {
            return "zero";
        }
        // add minus before conversion if the number is less than 0
        if (number < 0) { 
               // convert the number to a string
               String numberStr = "" + number; 
               // remove minus before the number 
               numberStr = numberStr.substring(1); 
               // add minus before the number and convert the rest of number 
               return "minus " + numToWord(Integer.parseInt(numberStr)); 
            } 
            // check if number is divisible by 1 million
            if ((number / 10000000) > 0) {
           words += numToWord(number / 10000000) + " crore ";
           number %= 10000000;
        }
        if ((number / 100000) > 0) {
            words += numToWord(number / 100000) + " lakh ";
            number %= 100000;
         }
        // check if number is divisible by 1 thousand
        if ((number / 1000) > 0) {
            words += numToWord(number / 1000) + " thousand ";
            number %= 1000;
        }
        // check if number is divisible by 1 hundred
        if ((number / 100) > 0) {
             words += numToWord(number / 100) + " hundred ";
             number %= 100;
        }
     
        if (number > 0) {
             // check if number is within teens
             if (number < 20) { 
                        // fetch the appropriate value from unit array
                        words += unitsArray[number];
                 } else { 
                    // fetch the appropriate value from tens array
                    words += tensArray[number / 10]; 
                    if ((number % 10) > 0) {
                words += " " + unitsArray[number % 10];
                    }  
             }
              }
          return words;
       }
}
