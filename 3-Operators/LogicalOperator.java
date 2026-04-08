public class LogicalOperator {

    public static void main(String[] args) {
        // Logical Operator
        int a = 5;
        int b = 10;
        int c = 15;

        boolean d = (a < b) && (b < c);
        // short circuting 
        System.out.println(d);

        // Assignment Operator Chaining 
        int x,y,z;
        x = y = z = 10;
        System.out.println(x+" "+ y +" "+z);
    }
    
}
