public class Function1{
    // takes input and gives output
    public static double add(int a,double b){
        return (float) a + b;
    }

    public static void NoInNoOp(){
        System.out.println("Hello From No Input No Output Function");
    }

    public static void takeInputNoOp(String name){
        System.out.println("Hello" + name);
    }

    public static int NoIpGiveOp(){
        return 1;
    } 
    public static void main(String[] args) {
        double sum = add(10,9.5);
        System.out.println(sum);
    }
}
