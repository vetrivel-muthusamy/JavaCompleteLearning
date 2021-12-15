package interview_questions;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want for Fibonacci: ");
        int number = input.nextInt();//5

        int numberOne=-1, numberTwo = 1, numberThree;
        for (int i = 1; i <= number; i++) { //1 <= 5    2 <= 5  3 <= 5  4 <= 5  5 <= 5
            numberThree = numberOne + numberTwo;//-1+1=0    1+0=1   0+1=1   1+1=2   1+2=3
            System.out.println(numberThree);    //0   1   1   2   3
            numberOne = numberTwo;//    1   0   1   1   2
            numberTwo = numberThree;//  0   1   1   2   3
        }
    }
}
