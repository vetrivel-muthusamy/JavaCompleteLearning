package interview_questions;

import java.util.Scanner;

public class factorial_numbers {
    public static void main(String[] args) {

        System.out.println("Enter the number you want for Factorial: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int fact = 1;
        for (int n = 1; n<=number; n++){
            fact = fact * n;
            System.out.println(fact);
        }

    }
}
