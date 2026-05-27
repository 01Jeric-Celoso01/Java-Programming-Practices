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
    public static void checkIfStringAllUppercase() {
        String str = "HeLLO";
        boolean isUppercase = true;

        for(int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (!(chr >= 'A' && chr <= 'Z')) {
                isUppercase = false;
                break;
            }
        }

        if (isUppercase) {
            System.out.println("The String is Uppercase Only");
        } else {
            System.out.println("The String is not Uppercase Only");
        }
    }

    //Check if a string contains spaces
    public static void checkIfStringContainsSpaces() {
        String str = "Hello World!";
        boolean hasSpace = false;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == ' ') {
                hasSpace = true;
                break;
            }
        }

        if (hasSpace) {
            System.out.println("The String has a spaces");
        } else {
            System.out.println("The String don't have any spaces");
        }
    }

    //Count how many times vowels appear individually
    public static void howManyTimesVowelsAppearIndividually() {
        String str = "I Love Programming!";
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int x = 0; x < str.length(); x++) {
            char chr = str.charAt(x);

            if (chr == 'a' || chr == 'A') {
                a++;
            } else if (chr == 'e' || chr == 'E') {
                e++;
            } else if (chr == 'i' || chr == 'I') {
                i++;
            } else if (chr == 'o' || chr == 'O') {
                o++;
            } else if (chr == 'u' || chr == 'U') {
                u++;
            }
        }

        System.out.println("A count: " + a);
        System.out.println("E count: " + e);
        System.out.println("I count: " + i);
        System.out.println("O count: " + o);
        System.out.println("U count: " + u);
    }

    //Print index and character together
    public static void printIndexAndCharacter() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            System.out.println(i + " = " + chr);
        }
    }
    //Shift every character by +1 ASCII
    public static void shiftEveryCharacterBy1ASCII() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);


            chr = (char) (chr + 1);
            System.out.print(chr);
        }
    }
    //Shift every character by -1 ASCII
    public static void shiftEveryCharacterMinusOneASCII() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            chr = (char) (chr - 1);
            System.out.print(chr);
        }
    }

    //Encrypt string using Caesar cipher (+3)
    public static void encryptCaesarCipher() {
        String str = "Hello World!";

        for(int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= 'a' && chr <= 'z') {
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
        System.out.println();
    }

    //Decrypt Caesar cipher (-3)
    public static void decryptCaesarCipher() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);


            if (chr >= 'a' && chr <= 'z') {
                chr = (char) (chr - 3);

                if (chr > 'z') {
                    chr = (char) (chr - 26);
                }
            }

            if (chr >= 'A' && chr <= 'Z') {
                chr = (char) (chr - 3);

                if (chr > 'Z') {
                    chr = (char) (chr - 26);
                }
            }

            System.out.print(chr);
        }
    }

    //Mirror characters (abc → cba)
    public static void mirrorCharacter() {
        String str = "abcd";
        String temp = str;
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(temp);
        System.out.println(reverse);
    }

    //Remove duplicate adjacent characters
    public static void adjacentCharacters() {
        String str = "aaabbbbccddddd";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i == str.length() - 1 || chr != str.charAt(i + 1)) {
                System.out.print(chr);
            }

        }
    }
    //Compress repeating adjacent characters
    public static void compressRepeatingAdjacentCharacters() {
        String str = "aaabbbcc";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(str.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }
        System.out.println();
    }

    //Expand repeated character notation (a3 → aaa)
    public static void expandRepeatedCharacter() {
        String str = "a2c3b3";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (Character.isLetter(chr)) {
                int count = (i + 1) - '0';

                for (int j = 0; j < count; j++) {
                    System.out.print(chr);
                }
            }
            i++;
        }
    }

    //Count transitions between uppercase and lowercase
    public static void countTransitionsUpperAndLower() {
        String str = "HeLlO World";
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            char curr = str.charAt(i);
            char next = str.charAt(i + 1);

            if (Character.isUpperCase(curr) != Character.isUpperCase(next)) {
                count++;
            }
        }
        System.out.println("Total Transition Upper / Lower: " + count);
    }

    //Print alternate uppercase/lowercase characters
    public static void printAlternateUpperAndLower() {
        String str = "Hello World";
        int toggle = 0; // control case switching

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == ' ') {
                System.out.print(chr);
                continue;
            }

            if (toggle % 2 == 0) {
                System.out.print(Character.toUpperCase(chr));
            } else {
                System.out.print(Character.toLowerCase(chr));
            }
            toggle++;
        }
        System.out.println();
    }

    //Reverse only uppercase letters
    //Reverse only lowercase letters

    //Replace vowels with *
    public static void replaceVowelsWithAsterisk() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if ((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z')) {
                if ((chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') || 
                    (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U')) {
                        chr = '*';
                    }
            }
            System.out.print(chr);
        }
    }

    //Replace digits with #
    public static void replaceDigitsWithHashtag() {
        String str = "123Hello World456";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= '0' && chr <= '9') {
                chr = '#';
            }
            System.out.print(chr);
        }
    }

    //Replace consonants with _
    public static void replaceConsonantsWithUnderscore() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if ((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z')) {
                if ((chr != 'a' && chr != 'e' && chr != 'i' && chr != 'o' && chr != 'u') && 
                    (chr != 'A' && chr != 'E' && chr != 'I' && chr != 'O' && chr != 'U')) {
                        chr = '_';
                    }
            }
            System.out.print(chr);
        }
    }

    //Print characters separated by commas
    public static void printCharacterByCommas() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            System.out.print(chr + ", ");
        }
    }

    //Count punctuation marks
    public static void countPunctuationMarks() {
        String str = "Hello World!";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (!(chr >= 'a' && chr <= 'z') && !(chr >= 'A' && chr <= 'Z') &&
                !(chr >= '0' && chr <= '9') && chr != ' ') {
                    count++;
                }
        }
        System.out.println("Total Punctuation: " + count);
    }

    //Find longest continuous uppercase sequence
    public static void findLongestContinuesUpper() {
        String str = "aBcDEFgh";
        int count = 0;
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
        
            if (chr >= 'A' && chr <= 'Z') {
                count++;

                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("Total Continues Upper: " + max);
    }

    //Find longest continuous lowercase sequence
    public static void findLongestContinuesLower() {
        String str = "abAcdeFGhIJ";
        int count = 0;
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if(chr >= 'a' && chr <= 'z') {
                count++;

                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("Total Continues Lower: " + max);
    }

    //Detect double letters (oo, ee)
    public static void detectDoubleLetters() {
        String str = "Hello World!";

        boolean hasEE = false;
        boolean hasOO = false;

        for (int i = 0; i < str.length() - 1; i++) {
            char current = Character.toLowerCase(str.charAt(i));
            char next = Character.toLowerCase(str.charAt(i + 1));

            if (current == 'e' && next == 'e') {
                hasEE = true;
            }

            if (current == 'o' && next == 'o') {
                hasOO = true;
            }
        }

        if (hasEE) {
            System.out.println("ee Detected");
        }

        if (hasOO) {
            System.out.println("oo detected");
        }

        if (!hasEE && !hasOO) {
            System.out.println("no o and e double letter detected");
        }
    }

    //Count repeated adjacent characters
    public static void countRepeatedCharacters() {
        String str = "Bookkepper";
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            char current = Character.toLowerCase(str.charAt(i));
            char next = Character.toLowerCase(str.charAt(i + 1));

            if (current == next) {
                count++;
            }
        }

        System.out.println("Total repeated Character is: " + count);
    }

    //Check if all characters are unique
    public static void isAllCharacterIsUnque() {
        String str = "Hello";
        boolean isAllUnique = true;

        for (int i = 0; i < str.length() - 1; i++) {
            char current = Character.toLowerCase(str.charAt(i));
            char next = Character.toLowerCase(str.charAt(i + 1));

            if (current == next) {
                isAllUnique = false;
            }
        }

        if (isAllUnique) {
            System.out.println("All Character Is Unique");
        } else {
            System.out.println("All Character Is Not Unique");
        }
    }

    //Find duplicate characters
    public static void findDuplicateCharacter() {
        String str = "Hello World!";
        boolean isDuplicate = true;

        for (int i = 0; i < str.length() - 1; i++) {
            char current = Character.toLowerCase(str.charAt(i));
            char next = Character.toLowerCase(str.charAt(i + 1));
        }
    }

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
    public static void snakeCase() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == ' ') {
                chr = '_';
            }

            System.out.print(chr);
        }
    }

    //Verify if a string is kebab-case
    public static void kebabCase() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == ' ') {
                chr = '-';
            }

            System.out.print(chr);
        }
    }

    //Detect whether a sentence ends with punctuation
    public static void detectSentenceEndsWithPunctuation() {
        String str = "Hello World!";
        char last = str.charAt(str.length() - 1);

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);


        }
    }

    //Remove punctuation marks
    public static void removePunctuation() {
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if ((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z') || chr == ' ') {
                System.out.print(chr);
            }
        }
        System.out.println();
    }

    //Count sentences using . ! ?
    public static void countSentenceUsingSpecialChar() {
        String str = "Hello. World!";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == '.' || chr == '!' || chr == '?') {
                count++;
            }
        }
        System.out.println("Total Sentence is: " + count);
    }

    //Print every second character in reverse
    public static void reverseEverySecondChar() {
        String str = "abcdef";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i -= 2) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println(reverse);
    }

    //Swap adjacent characters
    public static void swapAdjacentChar() {
        String str = "abcdef";

        String result = "";

        for (int i = 0; i < str.length(); i += 2) {
            if (i + 1 < str.length()) {
                result = result + str.charAt(i + 1) + str.charAt(i);
            } else {
                result = result + str.charAt(i);
            }
        }

        System.out.println(result);
    }

    //Rotate string left by one character
    public static void rotateLeftByOneChar() {
        String str = "Hello";
        char first = str.charAt(0);
        String result = "";

        if (str.length() <= 1) {
            System.out.println(str);
            return;
        }

        for (int i = 1; i < str.length(); i++) {
            result = result + str.charAt(i);

        }

        result = result + first;
        System.out.println(result);
    }

    //Rotate string right by one character
    public static void rotateRightByOneChar() {
        String str = "Hello";
        char last = str.charAt(str.length() - 1);
        String result = "" + last;

        if (str.length() <= 1) {
            System.out.println(str);
            return;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
    }

    //Find the most frequent character
    public static void mostFrequentChar() {
        String str = "Hello World!";
        char maxChar = str.charAt(0);
        int maxFreq = 0;

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == curr) {
                    count++;
                }

                if (count > maxFreq) {
                    maxFreq = count;
                    maxChar = curr;
                }
            }
        }

        System.out.println("Most Frequent Character Is: " + maxChar);
    }

    //Find the least frequent character
    public static void leastFrequentChar() {
        String str = "Hello World";
        char minChar = str.charAt(0);
        int minFreq = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
               if (str.charAt(j) == current) {
                    count++;
              }
            }

            // update minimum
            if (count < minFreq) {
                minFreq = count;
                minChar = current;
            }
        }
        System.out.println("Least Character is: " + minChar);;
    }

    public static void main(String[] args) {
        snakeCase();
    }
}
