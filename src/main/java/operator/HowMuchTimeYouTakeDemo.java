package operator;

public class HowMuchTimeYouTakeDemo {
    public static void main(String[] args) {
        // Logical operator - && (Logical AND) , || - Logical OR
        // Bitwise operator - & (Bitwise AND) , | - Bitwise OR
        //System.out.println(FALSE() & FALSE());
        //System.out.println(FALSE() && TRUE());
        System.out.println(TRUE() | FALSE());
        //System.out.println(TRUE() || FALSE());
    }

    public static boolean TRUE(){
        System.out.println("5 sec");
        return true;
    }

    public static boolean FALSE(){
        System.out.println("10 sec");
        return false;
    }

}
