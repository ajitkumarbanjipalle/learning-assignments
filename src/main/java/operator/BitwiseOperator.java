package operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        // & and |
        // AND - & - strict conditional check

        // true & true = true
        // true & false = false
        // false & true = false
        // false & false = false

        //OR | non-strict operator
        // true | true = true
        // true | false = true
        // false | true = true
        // false | false = false

        int i = 10;
        int j = 20;

        // placement - clg
        // TCS - 12th percentage is more then 80% and CGPA > 8

        System.out.println((i > j) & (i == j));
        System.out.println((i > j) | (i == j));


    }
}
