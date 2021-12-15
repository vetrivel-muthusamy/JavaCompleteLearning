package statements;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        int a,b,c,choice;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Select any one choice:");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        System.out.println("Enter the number1: ");
        a = input.nextInt();
        System.out.println("Enter the number2: ");
        b = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1.Addition: ");
                c = a + b;
                System.out.println(c);
                break;
            case 2:
                System.out.println("2.Subtraction");
                c = a - b;
                System.out.println(c);
                break;
            case 3:
                System.out.println("3.Multiplication");
                c = a * b;
                System.out.println(c);
                break;
            case 4:
                System.out.println("4.Division");
                c = a / b;
                System.out.println(c);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

}
