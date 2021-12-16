package interview_questions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to check is that Armstrong or not: ");
        int number = input.nextInt();
        int copyNumber = number;

        int digit1, digit2, digit3;

        digit3 = copyNumber%10;
        copyNumber=copyNumber/10;

        digit2 = copyNumber%10;
        copyNumber=copyNumber/10;

        digit1 = copyNumber%10;
        int result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);

        if(result == number){
            System.out.println(number + " is a Armstrong Number");
        } else {
            System.out.println(number + " is not a Armstrong Number");
        }
    }
}
