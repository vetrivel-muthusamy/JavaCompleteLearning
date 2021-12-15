package statements;

import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        /*Nested if statement
        A company insures its drivers in the following cases
            a. if the driver is married
            b. if the driver is unmarried, male & above 30 years of age.
            c. if the driver is unmarried, Female & above 25 years of age.*/

        Scanner input = new Scanner(System.in);

        char marital_Status, gender;
        System.out.println("Enter Employee Marital Status: ");
        marital_Status = input.next().charAt(0);

        if(marital_Status == 'U' || marital_Status =='u'){

            System.out.println("Enter Employee Gender");
            gender = input.next().charAt(0);
            System.out.println("Enter Employee Age: ");
            int age = input.nextInt();
            if((gender == 'M' || gender =='m') && age >=30){
                System.out.println("You are eligible for Insurance");
            }else if ((gender == 'F' || gender =='f') && age >= 25){
                System.out.println("You are eligible for Insurance");
            } else {
                System.out.println("you are not eligible for Insurance");
            }
        }else if(marital_Status == 'M' || marital_Status == 'm'){
            System.out.println("you are eligible for insurance");
        }else{
            System.out.println("invalid input");
        }
    }
}
