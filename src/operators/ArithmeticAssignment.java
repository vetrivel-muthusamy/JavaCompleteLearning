package operators;
/*
=	    a = 123		a = 123
+=	    a += 10		a = a + 10
-=	    a -= 10		a = a - 10
*=	    a *= 10		a = a * 10
/=	    a /= 10		a = a / 10
%=	    a %= 10		a = a % 10
*/
public class ArithmeticAssignment {

    public static void main(String[] args) {
        int number = 123;
        System.out.println(number);
        number += 123;
        System.out.println(number);
        number -= 123;
        System.out.println(number);
        number *= 123;
        System.out.println(number);
        number /= 123;
        System.out.println(number);
        number %= 10;
        System.out.println(number);
    }
}
