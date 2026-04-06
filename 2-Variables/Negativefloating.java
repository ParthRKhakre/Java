public class Negativefloating {
    public static void main(String arg[]) {
        // Due to this loss in data Java Introduced BIG_DECIMAL

        float c = 9.25f;
        float f = 0.9f;

        System.out.printf("%.20f %n", c);
        System.out.printf("%.20f %n", f);

        // Implicit Conversion (byte to int)
        byte x = 10;
        int q;
        q = x;
        System.out.println("byte to int " + q);

        // Character to int
        char v = 'a';
        int m = v;
        System.out.println("Character to Integer " + m);

        // Explicit Conversion
        int a = 300;
        byte i;
        i = (byte) a; // Casting is required
        System.out.println("int to byte " + i);

        // long to int
        long big = 100000;
        int d;
        d = (int) big;
        System.out.println("long to int "+d);
    }
}
