public class FloatingDataTypeDemo {
    public static void main(String[] args) {

        // float = 4 byte
        // double = 8 byte - default

        float f1 = 12.3F;    // float f1 = 83.28F;
        double d1 = 13.48;    // double d1 = 83.28;

        // operation between floating values will always give you floating values

        float g1 = 13.8F;
        float g2 = 12.4F;
        System.out.println(g1/g2);
        System.out.println(g1*g2);
        System.out.println(g1+g2);

        //float h1 = 0012;
        //System.out.println(h1);

        int k = 12;
        float f = k;
        System.out.println(f);

       // long l = 12;
        //float  = l;
        //System.out.println(f);


    }
}
