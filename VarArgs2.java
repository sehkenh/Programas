// Use varargs with standard arguments.
public class VarArgs2 {

    //Here, msg is a normal parameter and v is a
    //varargs parameter.

    static void vaTest(String msg, int ... v) {
        System.out.println(msg +" "+ v.length);

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }
    public static void main(String[] args) {
        vaTest("Hello World", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        vaTest("Hello World", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        vaTest("Hello World");
    }
}
