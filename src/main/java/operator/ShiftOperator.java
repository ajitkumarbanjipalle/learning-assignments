package operator;

public class ShiftOperator {
    public static void main(String[] args) {
        // >> << ( signed operator ) >>> ( unsigned operator ) -> right most shift operator

        //int i = 20;
        // you have to make this number half without using any arithmetic operator
//        System.out.println(i >> 1); // (i >> 2); // 101 ,  (i >> 1); // 10
//        System.out.println(i >> 2);
//        System.out.println(i >> 3);
//        System.out.println(i >> 4);
        // 10100
        // 1010
        int i = -10;
        System.out.println(i << 1); // (i >> 2); // 101 ,  (i >> 1); // 10
        System.out.println(i << 2);
        System.out.println(i << 3);
        System.out.println(i << 4);
        System.out.println(i << 5);

        //System.out.println(i >>> 1); // >>> ( unsigned operator ) -> right most shift operator
    }
}
