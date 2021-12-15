package statements;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        System.out.println("Enter the number Limit: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int i=1;
        while(i<=number) {
            System.out.println("Iterative Number: "+ i);
            i++;
        }
    }
}
