public class Function {
    public static double add(int a,double b){
        return (float) a + b;
    }

    public static void main(String[] args) {
        double sum = add(10,9.5);
        System.out.println(sum);
    }
}
