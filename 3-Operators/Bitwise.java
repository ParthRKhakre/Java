public class Bitwise {
    public static void main(String[] args) {
         int a = 2; // 0000000 00000000 00000000 00000010
         int b = 3; // 11

         int c = a & b; // 10(2)
         int d = a | b; // 11(3)
         int e = a ^ b; // 01(1)
         int f = ~a;    // 0...0010 -> 11..1101(-3)
         System.out.println(c+" "+d+" "+e+" "+f);

         // Shift Operations
         int g = 1 ;
         g = g << 31; // Integer.MIN_VALUE
         System.out.println(g);

         int h = 2;
         h = h >> 3;
         System.out.println(h);

         // Typecasting
         byte i = 9;
         i =(byte) (i << 2);
         System.out.println(i);
    }
    
}
