package operators;

public class Logical {

    public static void main(String[] args) {
        int a=10, b= 25;
        System.out.println("And &&: "+ (a >= 35 && b >=35));
        System.out.println("OR ||: "+ (a >= 35 || b <=35));

        if (a >= 35 && b >=35) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

}
