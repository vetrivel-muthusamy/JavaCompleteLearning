package statements;

public class break_and_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            if(i==5)
                continue; //to skip the number 5 and remaining numbers will be printed.
            System.out.println(i);
            if(i==8)
                break;
        }
    }
}
