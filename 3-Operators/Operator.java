public class Operator {
    public static void main(String[]args){
        // Arithematic Operator: + - * / % += -= *= /= %= ++ --
        int a = 10;
        int b = 9;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        System.out.println(c+" , "+d+" , "+e+" , "+f+" , "+g);

        int h = a + 2;

        h += 2; // h = h + 2;
        h -= 2; // h = h - 2;
        h *= 2; // h = h * 2;
        h /= 2; // h = h / 2;
        System.out.println(h);

        int i = 9;
        i++; // i = i + 1 --> i += 1
        System.out.println(i);
        i--;
        System.out.println(i);

        // Pre Increment and Post Increment
        int j = 9;
        
        j++; // postfix increment
        ++j; // prefic increment
        j--;
        --j;

    }
}
