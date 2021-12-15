package statements;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        //leap year

        int year;
        System.out.println("Enter Year: ");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)){
            System.out.println("Year "+ year +" is a leap year");
        } else {
            System.out.println("Year "+ year +" is not a leap year");
        }

    }
}
