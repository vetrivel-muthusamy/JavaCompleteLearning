package interview_questions;

import java.util.Scanner;

public class sum_and_avg {
    public static void main(String[] args) {
        System.out.println("enter the num that you want for sum and avg: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int sum = 0, numInput;
        for(int i=1;i<=number;i++) {
            System.out.println("Enter the number "+i+":");
            numInput = input.nextInt();
            sum+=numInput; //sum = sum + numInput;
        }
        System.out.println("The Sum of given number is: "+ sum);
        System.out.println("The average of given number is: "+ sum/number);

    }
}
