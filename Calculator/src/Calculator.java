public class Calculator {

    public static void main(String[] args) {
        double x = 20.64;
        int a = (int)x;

        int b = 10;
        System.out.printf("a + b = %d%n", adunare(a, b));
        System.out.printf("a - b = %d%n", scadere(a, b));
        System.out.printf("a * b = %d%n", inmultire(a, b));
        System.out.printf("a / b = %f%n", impartire(a, b));
    }

    public static int adunare(int a, int b) {
        int s = a + b;
        return s;
    }

    public static int scadere (int a,int b) {
        int s = a - b;
        return s;
    }

     public static int inmultire ( int a, int b) {
        int s = a * b;
        return s;

    } public static float impartire ( int a, int b) {
        float s = a / b;
        return s;
    }
}
