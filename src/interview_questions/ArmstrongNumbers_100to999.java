package interview_questions;

public class ArmstrongNumbers_100to999 {
    public static void main(String[] args) {

        int digit1, digit2, digit3,digit4, digit5, digit6, copyNumber, number, result;
        for(number = 100; number <= 999; number++){

            copyNumber = number;

            digit6 = copyNumber%10;
            copyNumber=copyNumber/10;

            digit5 = copyNumber%10;
            copyNumber=copyNumber/10;

            digit4 = copyNumber%10;
            copyNumber=copyNumber/10;

            digit3 = copyNumber%10;
            copyNumber=copyNumber/10;

            digit2 = copyNumber%10;
            copyNumber=copyNumber/10;

            digit1 = copyNumber%10;
            result = (digit1 * digit1 * digit1 * digit1 * digit1 * digit1)
                    + (digit2 * digit2 * digit2 * digit2 * digit2 * digit2)
                    + (digit3 * digit3 * digit3 * digit3 * digit3 * digit3)
                    //+ (digit4 * digit4 * digit4 * digit4 * digit4 * digit4)
                    //+ (digit5 * digit5 * digit5 * digit5 * digit5 * digit5)
                    //+ (digit6 * digit6 * digit6 * digit6 * digit6 * digit6)
            ;

            if(result == number){
                System.out.println(number + " is a Armstrong Number");
            }
        }

    }
}
