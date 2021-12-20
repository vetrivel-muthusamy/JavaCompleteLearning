package String;

public class countCharacter {
    public static void main(String[] args) {
        //Program to count Uppercase, Lowercase, Space, Number, Vowels and Symbols in a String
        StringBuilder sb = new StringBuilder("my age is 30@--");
        System.out.println(sb);
        int upper = 0, lower = 0, space = 0, number = 0, vowels = 0, symbols = 0;

        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) >= 97 && sb.charAt(i) <= 122) {
                lower++;
            }
            if(sb.charAt(i) >= 65 && sb.charAt(i) <= 90) {
                upper++;
            }
            if(sb.charAt(i) == 32) {
                space++;
            }
            if(sb.charAt(i) >= 48 && sb.charAt(i) <= 57) {
                upper++;
            }
            if(sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O' || sb.charAt(i) == 'U' ||
                    sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u') {
                vowels++;
            }

        }
    }
}
