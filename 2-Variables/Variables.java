public class Variables {
    public static void main(String[] args) {
        // Integer --> byte,short,int,long
        byte b = 5;
        short s = 10;
        int i = 400;
        long l = 10_000; // 10000 (_)underscore can be used to make it readable
        System.out.println("Integer Value -->" + " , " + b + " , " + s + " , " + i + " , " + l);

        // Number System :
        // Binary(2)
        // Octal (8)
        // Hexadecimal(16)
        byte binary = 0b011; // 0b informs compiler about the value being a binary
        int octal = 05; // 0 is used infront of the value to represent the octal
        int hexa = 0x5; // 0X is used for hexadecimal(0-15 i.e. 0-9,A,B,C,D,E,F)
        System.out.println("Binary Value " + binary + " Octal Value " + octal + " Hexadeciaml " + hexa);

        // Floating Point
        float f = 9.21f;
        // Decimal Values are default float in Java Due to Optimization in Modern
        // Compilers
        // float is single precision
        double d = 9.99182; // Double is double precision 
        double avgadro = 6.022e23; // 6.022 x 10^23
        System.out.println("Floating Value -->" + " " + f + " , " + d + " Avagadro Constant " + avgadro);

        // Character
        char c = 'a';
        System.out.println("Character Value --> " + c);

        // Boolean
        boolean bool = true;
        System.out.println(bool);
    }
}