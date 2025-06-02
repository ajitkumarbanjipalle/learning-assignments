public class CharDemo {
    public static void main(String[] args) {

        // a b c d
        // ASCIT Code - Keyboard System - 1 byte
        // singleequote
        // all characters are int by default but all int not chr

        char c1 = 'a';
        System.out.println(c1);
        int k = c1;
        System.out.println(k);

        // 1 byte -> 4 byte

        int m = 87;   // 4 byte                      // int n = 100;
        char j = (char)m;   // casting required      // char c = (char)n;
        System.out.println(j);                       // System.out.println(c);


        // Unicode character system - 2 byte
        char h1 = '\u0905';
        char h2 = '\u091C';
        char h3 = '\u093F';
        char h4 = '\u0924';
        char b1 = '\u092C';
        char b2 = '\u093E';
        char b3 = '\u0932';
        char b4 = '\u093E';
        char b5 = '\u091C';
        char b6 = '\u0940';



        System.out.println(" " + h1 + h2 + h3 + h4 + " " + b1 + b2 + b3 + b4 + b5 + b6);
        System.out.println("" + " ");


    }
}
