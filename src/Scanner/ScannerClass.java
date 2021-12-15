package Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;
        //a2+b2+2ab

        System.out.println("Enter 2 int numbers: ");
        a=input.nextInt();
        b=input.nextInt();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Result is: "+ c);

        float d,e,f;
        System.out.println("Enter 2 float numbers: ");
        d=input.nextFloat();
        e=input.nextFloat();
        f=(d*d)+(e*e)+(2*d*e);
        System.out.println("Result is: "+ f);

    }
}
