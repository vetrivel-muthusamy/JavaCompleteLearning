package statements;

import java.util.Scanner;

public class IFStatement {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible for vote");
        } else {
            System.out.println("You are not eligible for vote");
        }
    }
}
