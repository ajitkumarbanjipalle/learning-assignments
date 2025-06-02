package operator;

public class UnaryOperator {
    public static void main(String[] args) {
        // one operand
        // + , - , ++ , -- , ! , ~
//        int i = 10;
//        System.out.println(+i);
//        System.out.println(-i);
        // increment and decrement
        // increment add by 1
        // i++ = post increment (first assignment and then increment)
        // ++i = pre increment (first increment and then assignment)

       // int i = 10;
       // i = i + 5;
//        System.out.println(i++);
//        System.out.println(i);

        int i = 10;
        int j = i++ + ++i;  // 22
        //int j = ++i;
//        int j = ++i + i++;      // 22
//        int j = ++i + ++i;      //23
//        int j = ++i + i++ + i++ + ++i + i++;   // 11+11+12+14+14
//        int j = i++ + i++ + ++i + i++ + --i;
//        int j = i++ + i++ + --i + i++ + i++;     // 10+11+11+11+12

        // jaha per variable ata hai , vaha per value incres and decress

        System.out.println("i -> " + i); // 13
        System.out.println("j -> " + j); // 10+11+11+11+12


    }
}
