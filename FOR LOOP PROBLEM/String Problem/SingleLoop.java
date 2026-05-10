public class SingleLoop {
    /// DISPLAY STRINGS
    // Display "Hello World"
    public static void displayString() {
        String str = "Hello World!";

        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            System.out.println(chr);
        }
        System.out.println();
    }

    // Display Reverse "Hello World!"
    public static void reverseString() {
        String str = "Hello World!";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char chr = str.charAt(i);

            System.out.print(chr);
        }
    }

    // Display The String and index of "Hello World"
    public static void displayStringAndIndex() {
        String str = "Hello World";

        for(int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            System.out.println(chr + " <> " + i);
        }
        System.out.println();
    }

    // Remove Consonants and Display Vowels Letter of "Hello World"
    public static void displayVowelsOfString() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if((chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') ||
                    (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U')) {
                System.out.print(chr);
            }
        }
        System.out.println();
    }

    // Remove Vowels And Display Consonants Letter of "Hello World"
    public static void displayConsonantsOfString() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if ((chr != 'a' && chr != 'e' && chr != 'i' && chr != 'o' && chr != 'u') &&
                    (chr != 'A' && chr != 'E' && chr != 'I' && chr != 'O' && chr != 'U')) {
                System.out.print(chr);
            }
        }
    }

    // Remove All Digit and Special Character and Display The Alphabets
    public static void displayAllAlphabets() {
        String str = "123@Hello_World!123";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if ((chr >= 'A' && chr <= 'Z') || (chr >= 'a' && chr <= 'z')) {
                System.out.print(chr);
            } else if (chr == '_') {
                System.out.print(" ");
            }
        }
    }

    // Remove All Alphabet and Special Character and Display All Digits
    public static void displayAllDigits() {
        String str = "123@Hello_World!456";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= '0' && chr <= '9') {
                System.out.print(chr);
            }
        }
    }

    // Remove All Alphabet and Digits Number and Display All Special Character
    public static void displayAllSpecialCharacter() {
        String str = "123@Hello_World!456";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (!(chr >= 'a' && chr <= 'z' || chr >= 'A' && chr <= 'Z')
                    && !(chr >= '0' && chr <= '9')) {
                System.out.print(chr);
            }
        }
    }

    // Display All Character is Index Even Number
    public static void displayCharIsIndexEven() {
        String str = "Hello World!";

        for (int i = 0 ; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i % 2 == 0) {
                System.out.print(chr);
            }
        }
    }

    // Display All Character is Index Odd Number
    public static void displayCharIsIndexOdd() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i % 2 != 0) {
                System.out.print(chr);
            }
        }
    }

    /// CONVERT STRING
    // Convert Lowercase String to Uppercase String
    public static void convertStringToUpperCase() {
        String str = "hello word";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= 'a' && chr <= 'z') {
                chr = (char) (chr - 32);
            }

            System.out.print(chr);
        }
    }

    // Convert Uppercase String to Lowercase String
    public static void convertStringToLowercase() {
        String str = "HELLO WORLD!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= 'A' && chr <= 'Z') {
                chr = (char) (chr + 32);
            }

            System.out.print(chr);
        }
    }

    // All Lower to Upper And Upper To Lower Character
    public static void convertStringLowerToUpperViseVersa() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= 'a' && chr <= 'z') {
                chr = (char) (chr - 32);
            } else if (chr >= 'A' && chr <= 'Z') {
                chr = (char) (chr + 32);
            }

            System.out.print(chr);
        }
    }

    // Convert All Even Character to Underscore "_"
    public static void EvenCharToUnderscore() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i % 2 == 0) {
                chr = '_';
            }

            System.out.print(chr);
        }
    }

    // Convert All Odd Character to Hyphen "-"
    public static void OddCharToHyphen() {
        String str = "Hello World";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i % 2 != 0) {
                chr = '-';
            }

            System.out.print(chr);
        }
    }

    // Convert Odd to Underscore and Even to Hyphen
    public static void convertTheOddAndEven() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i % 2 == 0) {
                chr = '-';
            } else {
                chr = '_';
            }

            System.out.print(chr);
        }
    }

    // Convert every character by 3 (Basic Caesar Cipher).
    public static void convertChar3Steps() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if ((chr >= 'a' && chr <= 'z')) {
                chr = (char) (chr + 3);

                if (chr > 'z') {
                    chr = (char) (chr - 26);
                }
            }

            if (chr >= 'A' && chr <= 'Z') {
                chr = (char) (chr + 3);

                if (chr > 'Z') {
                    chr = (char) (chr - 26);
                }
            }

            System.out.print(chr);
        }
    }


    /// COUNT STRING
    // Count All The Alphabet Characters in a String
    public static void countTheAlphabetCharacters() {
        String str = "123&Hello World!_456";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if ((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z')) {
                count++;
            }
        }
        System.out.println("Total: " + count);
    }

    // Count All The Digits Number in a String
    public static void countTheDigitsNumbers() {
        String str = "_H3!l0 W0r!d!_";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= '0' && chr <= '9') {
                count++;
            }
        }
        System.out.println("Total: " + count);
    }

    // Count All The Special Characters in a String
    public static void countTheSpecialCharacters() {
        String str = "_H3!l0 W0r!d!_";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (!(chr >= '0' && chr <= '9') &&
                    !((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z'))) {
                count++;
            }
        }
        System.out.println("Total: " + count);
    }

    // Count All The Characters in a String
    public static void countAllTheCharacters() {
        String str = "_H3!l0 W0r!d!_";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        System.out.println("Total: " + count);
    }

    // Count All The Even Characters in a String
    public static void countAllEvenCharacter() {
        String str = "_H3!l0 W0r!d!_";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Total Even: " + count);
    }

    /// FIND STRING
    /// CHECK STRING

    static void main(String[] args) {
        countAllEvenCharacter();
    }
}
