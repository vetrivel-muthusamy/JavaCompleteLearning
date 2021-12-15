package statements;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        System.out.println("Enter the Limit: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        for(int i=1;i<=number;i++){
            System.out.println(i);
        }
    }
}
