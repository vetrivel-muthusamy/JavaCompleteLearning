package String;

public class StringConstantPool {
    public static void main(String args[]) {
        String fname = "Vetrivel";
        String lname = "Vetrivel";

        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);

        System.out.println("fname Hashcode: "+ fname.hashCode());
        System.out.println("lname Hashcode: "+ lname.hashCode());

        System.out.println("Equals: "+fname.equals(lname));
        System.out.println("Equals ignore case: "+fname.equalsIgnoreCase(lname));

        System.out.println("Length: "+fname.length());
        System.out.println("CharAt: "+fname.charAt(0));

        System.out.println("Uppercase: "+fname.toUpperCase());

        System.out.println("Replace: "+fname.replace("Vetrivel", "Vetri"));

        System.out.println("Contains: "+fname.contains("Vetri"));
        System.out.println("Empty: "+fname.isEmpty());
        System.out.println("Ends with: "+fname.endsWith("el"));
        System.out.println("Starts with: "+fname.startsWith("Ve"));

        System.out.println("Substring: "+fname.substring(5));
        System.out.println("Substring: "+ fname.substring(0,5));

        char[] carray = fname.toCharArray();
        for (char c : carray) {
            System.out.println("Character Array: "+c);
        }

        String value = " New Content ";
        System.out.println("Length: "+value.length());
        System.out.println(value);
        System.out.println("Trim: "+value.trim());
        System.out.println("Trim: "+value.trim().length());


    }
}
