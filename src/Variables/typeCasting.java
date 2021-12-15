package Variables;

/*
Widening Casting
	BYTE → SHORT → CHAR → INT → LONG → FLOAT → DOUBLE

Narrowing Casting
	DOUBLE → FLOAT → LONG → INT → CHAR → SHORT → BYTE
*/

public class typeCasting {

    public static void main(String[] args) {

        //Widening Casting
        int a = 10;
        double b = a;
        System.out.println("Int: "+a); //output: 10
        System.out.println("Double: "+ b); //output: 10.0

        //Narrowing Casting
        double d = 25.5385;
        int c = (int)d;
        System.out.println("Int: "+c); //output: 25
        System.out.println("Double: "+ d); //output: 25.5385

    }
}
