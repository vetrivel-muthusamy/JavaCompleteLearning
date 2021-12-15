package operators;

public class Bitwise {
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("Bitwise And: "+ (a&b));
        System.out.println("Bitwise OR: "+ (a|b));
        System.out.println("Bitwise XOR: " + (a^b));
        System.out.println("Bitwise not: " + (~a));
    }
}
