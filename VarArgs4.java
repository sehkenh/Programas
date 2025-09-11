/*

    VarArgs, overloading and ambiguity.

 */

public class VarArgs4 {
    static void vaTest(int ... v) {
        System.out.println(v.length);

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.println(v.length);

        for (boolean x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        vaTest(true, false, false);
//        vaTest(); // The program will not compile due to this method call that is not defined.
    }
}
