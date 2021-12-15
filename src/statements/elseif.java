package statements;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {

        double avg;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Average Marks: ");
        avg = input.nextDouble();
        if (avg <=100 && avg >=90) {
            System.out.println("Percentage fall under Grade A");
        } else if(avg <=89 && avg >=80) {
            System.out.println("Percentage fall under Grade B");
        } else if(avg <=79 && avg >=70) {
            System.out.println("Percentage fall under Grade C");
        } else if(avg <70) {
            System.out.println("Percentage fall under Grade D");
        }
    }
}
