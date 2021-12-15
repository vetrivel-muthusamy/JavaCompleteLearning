package operators;

public class Relational {
    /*
    Operator        Name                        Example
    ==              Equal to                    a == b
    !=              Not Equal                   a != b
    >               Greater than                a > b
    <               Less than                   a < b
    >=              Greater than or Equal to    a >= b
    <=              Less than or equal to       a <= b
     */
    public static void main(String[] args) {

        int a = 111, b = 123;
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or Equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

    }
}
