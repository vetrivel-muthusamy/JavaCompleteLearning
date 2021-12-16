package interview_questions;

import java.util.Scanner;

public class reverseNnumber {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to make reverse: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();//123

        int reverse=0, rem;

        while(number != 0){ //123!=0    12!=0   1!=0    0!=0
            rem = number%10;//3         2       1
            reverse = (reverse*10)+rem;//(0*10)+3=>3    (3*10)+2=>32    (32*10)+1=>321(this will be printed)
            number=number/10;//12   1   0
        }
        System.out.println(reverse);//321
    }
}
