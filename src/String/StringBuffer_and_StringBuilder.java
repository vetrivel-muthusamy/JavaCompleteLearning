package String;

public class StringBuffer_and_StringBuilder {

    public static void main(String[] args) {

        /*both having the same function - Difference is Thread safe
        StringBuffer - Thread safe
        StringBuilder - not a Thread safe

         */

        //StringBuffer
        StringBuffer buffer = new StringBuffer("Vetrivel");
        System.out.println(buffer);
        buffer.append(" Muthusamy");
        System.out.println(buffer);

        buffer.insert(18, " self Learning");
        System.out.println(buffer);

        StringBuffer SB = new StringBuffer();
        System.out.println("Default Capacity: "+ SB.capacity());

        SB.append("Learning java will make more flexible to learn other programming");//64 Characters
        System.out.println("Current Capacity: "+ SB.capacity());


        //StringBuilder
        StringBuilder builder = new StringBuilder("Vetrivel");
        System.out.println(builder);
        builder.append(" Muthusamy");
        System.out.println(builder);

        builder.insert(18, " self Learning");
        System.out.println(builder);

        StringBuilder SBuilder = new StringBuilder();
        System.out.println("Default Capacity: "+ SBuilder.capacity());

        SBuilder.append("Learning java will make more flexible to learn other programming");//64 Characters
        System.out.println("Current Capacity: "+ SBuilder.capacity());
    }
}
