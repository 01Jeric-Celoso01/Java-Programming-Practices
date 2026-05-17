public class BasicSingleLoop {
    ///100 Basic Java Single for Loop String Problems

    //Print every character of a string
    public static void printEveryCharacter() {
        String str = "Hello World!";

        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    //Count the number of characters in a string
    public static void countTheCharacter() {
        String str = "Hello World!";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            count++;
        }

        System.out.println("Total Characters: " + count);
    }

    //Count uppercase letters
    public static void countUppercase() {
        String str = "I Love Programming!";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if(chr >= 'A' && chr <= 'Z') {
                count++;
            }
        }

        System.out.println("Total Uppercase Letter: " + count);
    }

    //Count lowercase letters
    public static void countLowercase() {
        String str = "I Love Programming!";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if ( chr >= 'a' && chr <= 'z') {
                count++;
            }
        }

        System.out.println("Total Lowercase Letter: " + count);
    }

    //Count digits
    public static void countDigit() {
        String str = "1 Lov3 Pr0gramm1ng";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= '0' && chr <= '9') {
                count++;
            }
        }
        System.out.println("Total Digit Number: " + count);
    }

    //Count vowels
    public static void countVowels() {
        String str = "I Love programming";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);


            if ((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z')) {
                if ((chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') ||
                        (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U')) {
                    count++;
                }
            }
        }
        System.out.println("Total Vowels: " + count);
    }
    //Count consonants
    public static void countConsonants() {
        String str = "I Love Programming";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if ((chr >= 'a' && chr <= 'z') || chr >= 'A' && chr <= 'Z') {
                if ((chr != 'a' && chr != 'e' && chr != 'i' && chr != 'o' && chr != 'u') &&
                        (chr != 'A' && chr != 'E' && chr != 'I' && chr != 'O' && chr != 'U')) {
                    count++;
                }
            }
        }

        System.out.println("Total Consonants: " + count);
    }

    //Count spaces
    public static void countSpaces() {
        String str = "I Love Programming";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == ' ') {
                count++;
            }
        }

        System.out.println("Total Spaces: " + count);
    }

    //Count special characters
    public static void countSpecialCharacter() {
        String str = "Hello World!";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (!(chr >= 'a' && chr <= 'z') && !(chr >= 'A' && chr <= 'Z') &&
                !(chr >= '0' && chr <= '9') && chr != ' ') {
                count++;
            }
        }
        System.out.println("Total Special Characters: " + count);
    }

    //Reverse a string
    public static void reverseString() {
        String str = "Hello World!";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.print(reverse);
    }

    //Print characters in reverse order
    public static void reverseCharacter() {
        String str = "Hello World!";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }

    //Find the first character
    public static void findFirstCharacter() {
        String str = "Hello World!";

        for(int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i == 0) {
                System.out.print(chr);
            }
        }


    }

    //Find the last character
    public static void findLastCharacter() {
        String str = "Hello World!";

        for(int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i == str.length() - 1) {
                System.out.print(chr);
            }
        }
    }

    //Convert lowercase letters to uppercase manually
    public static void convertToUppercase() {
        String str = "hello world!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= 'a' && chr <= 'z') {
                chr = (char) (chr - 32);
            }

            System.out.print(chr);
        }
    }

    //Convert uppercase letters to lowercase manually
    public static void convertToLowercase() {
        String str = "HELLO WORLD";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= 'A' && chr <= 'Z') {
                chr = (char) (chr + 32);
            }

            System.out.print(chr);
        }
    }

    //Toggle character cases
    public static void toggleCaseCharacter() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i ++) {
            char chr = str.charAt(i);

            if (chr >= 'a' && chr <= 'z') {
                chr = (char) (chr - 32);
            } else if (chr >= 'A' && chr <= 'Z') {
                chr = (char) (chr + 32);
            }

            System.out.print(chr);
        }
    }

    //Replace spaces with underscores
    public static void replaceSpacesWithUnderScore() {
        String str = "I Love Programming";
        char replace = '_';

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == ' ') {
                chr = replace;
            }

            System.out.print(chr);
        }
    }

    //Remove all spaces
    public static void removeAllSpaces() {
        String str = "I Love Programming";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == ' ') {
                continue;
            }

            System.out.print(chr);
        }
    }

    //Print ASCII value of each character
    public static void printASCCIVALUEOfEachCharacter() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);

            System.out.println(str.charAt(i) + " = " + ascii);
        }
    }

    //Sum ASCII values of all characters
    public static void sumAllASCII() {
        String str = "Hello";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);

            sum += ascii;
        }

        System.out.println("Total ASCII Value: " + sum);
    }

    //Find the largest character
    public static void findTheLargestCharacter() {
        String str = "Hello World!";
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr > largest) {
                largest = chr;


            }
        }

        System.out.println("Largest Character: " + (char) (largest));
    }

    //Find the smallest character
    public static void findTheSmallestCharacter() {
        String str = "Hello World!";
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr < smallest) {
                smallest = chr;
            }
        }

        System.out.println("Smallest Character: " + (char) smallest);
    }

    //Check if a character exists in a string
    public static void checkCharacterInString() {
        String str = "Hello World!";
        char target = 'e';

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == target) {
                System.out.println("The Target Character Exists in a String");
                return;
            }
        }
        System.out.println("The Target Character not Exists in a String");
    }

    //Count occurrences of a specific character
    public static void countOccurrencesOfTarget() {
        String str = "I Love Programming";
        char target = 'm';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == target) {
                count++;
            }
        }System.out.println("The Total Of Target: " + count);
    }

    //Find the first occurrence of a character
    public static void findFirstOccurrenceOfCharacter() {
        String str = "I Love Programming";
        char target = 'm';
        int index = -1;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == target) {
                index = i;
                break;
            }
        }

        System.out.println(target + " = " + index);
    }

    //Find the last occurrence of a character
    public static void findLastOccurrenceOfCharacter() {
        String str = "I Love Programming";
        char target = 'm';
        int index = -1;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == target) {
                index = i;
            }
        }

        System.out.println(target + " = " + index);
    }

    //Remove a specific character
    public static void removeSpecificCharacter() {
        String str = "I Love Programming";
        char target = 'e';

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if(chr == target) {
                continue;
            }

            System.out.print(chr);
        }
    }

    //Replace a specific character
    public static void  replaceSpecificCharacter() {
        String str = "I Love Programming!";
        char replace = '1';

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == 'i' || chr == 'I') {
                chr = replace;
            }

            System.out.print(chr);
        }
    }

    //Duplicate every character
    public static void duplicateEveryCharacter() {
        String str = "I Love Programming";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            System.out.print(chr);
            System.out.print(chr);
        }
    }

    //Insert a dash after every character
    public static void insertDashInEveryCharacter() {
        String str = "I Love Programming";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            System.out.print(chr + "_");
        }
    }

    //Print characters at even indexes
    public static void printCharacterAtEvenIndex() {
        String str = "I Love Programming";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i % 2 == 0 ) {
                System.out.print(chr);
            }
        }
    }

    //Print characters at odd indexes
    public static void printCharacterAtOddIndexes() {
        String str = "I Love Programming";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i % 2 != 0) {
                System.out.print(chr);
            }
        }
    }

    //Count words using spaces
    public static void countWordsUsingSpace() {
        String str = " I Love Programming" ;
        str = str.trim();
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr != ' ' && !inWord) {
                inWord = true;
                count++;
            } else if (chr == ' ') {
                inWord = false;
            }
        }

        System.out.println("Total Words: " + count);
    }

    //Print first letter of every word
    public static void printFirstLetterOfEveryWord() {
        String str = "I Love Programming";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i == 0 || str.charAt(i - 1) == ' ') {
                System.out.print(chr);
            }
        }
    }

    //Capitalize first letter of each word
    public static void capitalizeFirstLetterEachWord() {
        String str = "i love programming";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i == 0 || str.charAt(i - 1) == ' ') {
                chr = (char) (chr - 32);
            }

            System.out.print(chr);
        }
    }

    //Convert sentence to snake_case
    public static void convertToSnakeCase() {
        String str = "I Love Programming";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == ' ') {
                chr = '_';
            } else if (chr >= 'A' && chr <= 'Z') {
                chr = (char) (chr + 32);
            }

            System.out.print(chr);
        }
    }

    //Convert sentence to kebab-case
    public static void convertToKebabCase() {
        String str = "I Love Programming";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == ' ') {
                chr = '-';
            } else if (chr >= 'A' && chr <= 'Z') {
                chr = (char) (chr + 32);
            }

            System.out.print(chr);
        }
    }

    //Remove vowels from a string
    public static void removeVowels() {
        String str = "I Love Programming";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if ((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z')) {
                if ((chr != 'a' && chr != 'e' && chr != 'i' && chr != 'o' && chr != 'u') &&
                        (chr != 'A' && chr != 'E' && chr != 'I' && chr != 'O' && chr != 'U')) {
                    System.out.print(chr) ;
                }
            }
        }
    }

    //Remove consonants from a string
    public static void removeConsonants() {
        String str = "I Love Programming";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if ((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z')) {
                if ((chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') ||
                    (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U')) {
                    System.out.print(chr);
                }
            }
        }
    }

    //Extract only digits from a string
    public static void extractOnlyDigitsFromString() {
        String str = "1 L0v3 Progr4mming";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= '0' && chr <= '9') {
                System.out.print(chr);
            }
        }
    }

    //Extract only alphabets from a string
    public static void extractAlphabetsOnlyInString() {
        String str = "1_L0v3_Progr4mming!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if ((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z')) {
                System.out.print(chr);
            }
        }
    }

    //Extract only special characters
    public static void extractSpecialCharacterOnly() {
        String str = "1_L0v3_Progr4mming!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (!(chr >= 'a' && chr <= 'z') && !(chr >= 'A' && chr <= 'Z') &&
                !(chr >= '0' && chr <= '9') && chr != ' ') {
                System.out.print(chr);
            }
        }
    }

    //Check if a string contains only digits
    public static void checkIfDigitOnly() {
        String str = "1 L0v3 Progr4mming";
        boolean isDigitOnly = true;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (!(chr >= '0' && chr <= '9')) {
                isDigitOnly = false;
                break;
            }
        }

        if (isDigitOnly) {
            System.out.println("The String is Digit Only");
        } else {
            System.out.println("The String is not Digit Only");
        }
    }

    //Check if a string contains only alphabets
     public static void  checkStringContainsAlphabet() {
        String str = "I Love Programming";
        boolean isAlphabetOnly = true;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (!(chr >= 'a' && chr <= 'z') && !(chr >= 'A' && chr <= 'Z') && !(chr == ' ')) {
                isAlphabetOnly = false;
                break;
            }
        }

        if (isAlphabetOnly) {
            System.out.println("The String is Alphabet Only");
        } else {
            System.out.println("The String is not Alphabet Only");
        }
     }

    //Check if a string contains only lowercase letters
    public static void checkIfStringAllLowercase() {
        String str = "hello world";
        boolean isAllLower = true;
        
        for(int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            
            if(!(chr >= 'a' && chr <= 'z') && chr != ' ') {
                isAllLower = false;
                break;
            }
        }
        
        if (isAllLower) {
            System.out.println("The String is All Lowercase");
        } else {
            System.out.println("The String is not All Lowercase");
        }
    }
    
    //Check if a string contains only uppercase letters
    //Check if a string contains spaces
    //Count how many times vowels appear individually
    //Print index and character together
    //Shift every character by +1 ASCII
    //Shift every character by -1 ASCII
    //Encrypt string using Caesar cipher (+3)
    //Decrypt Caesar cipher (-3)
    //Mirror characters (abc → cba)
    //Remove duplicate adjacent characters
    //Compress repeating adjacent characters
    //Expand repeated character notation (a3 → aaa)
    //Count transitions between uppercase and lowercase
    //Print alternate uppercase/lowercase characters
    //Reverse only uppercase letters
    //Reverse only lowercase letters
    //Replace vowels with *
    //Replace digits with #
    //Replace consonants with _
    //Print characters separated by commas
    //Count punctuation marks
    //Find longest continuous uppercase sequence
    //Find longest continuous lowercase sequence
    //Detect double letters (oo, ee)
    //Count repeated adjacent characters
    //Check if all characters are unique
    //Find duplicate characters
    //Print unique characters only
    //Remove consecutive spaces
    //Convert tabs to spaces
    //Count newline characters
    //Reverse words individually
    //Reverse entire sentence manually
    //Check if string is palindrome
    //Check if string is palindrome ignoring spaces
    //Check if string is palindrome ignoring case
    //Count matching characters between two strings
    //Compare two strings character by character
    //Find mismatch position between two strings
    //Merge two strings alternately
    //Interleave uppercase and lowercase letters
    //Convert CamelCase to spaced words
    //Verify if a string is CamelCase
    //Verify if a string is PascalCase
    //Verify if a string is snake_case
    //Verify if a string is kebab-case
    //Detect whether a sentence ends with punctuation
    //Remove punctuation marks
    //Count sentences using . ! ?
    //Print every second character in reverse
    //Swap adjacent characters
    //Rotate string left by one character
    //Rotate string right by one character
    //Find the most frequent character
    //Find the least frequent character
    public static void main(String[] args) {
        checkIfStringAllLowercase();
    }
}
