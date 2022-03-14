package another;
public class Variable {
    public static void main(String[] args) {
        int a = 10;
        float f = a;

        f = 10.5f;
        // int a=f;//Compile time error
        a = (int) f;

        // Overflow
        a = 130;
        byte b = (byte) a;

        // add lower type
        a = 10;
        b = 10;
        // byte c=a+b;//Compile Time Error: because a+b=20 will be int
        byte c = (byte) (a + b);
        System.out.println(c);

    }
}
