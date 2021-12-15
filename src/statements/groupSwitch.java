package statements;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class groupSwitch {

    public static void main(String[] args) {
        char c;
        System.out.println("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        c=input.next().charAt(0);

        switch (c) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c + " is a vowel");
                break;
            default:
                System.out.println(c + " constant");
                break;
        }
    }
}
