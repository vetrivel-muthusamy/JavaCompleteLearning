package statements;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        System.out.println("Enter the number of Limit: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int i=1;

        do {
            System.out.println(i);
            i++;
        }while (i<=number);
    }
}
