/*

    Method overriding occurs only when the names and the type signature of the two
    methods are identical. If they are not, then the two methods are simply overloaded.
    For example consider this modified version of the preceding example:

 */

// Methods with differing type signatures are overloaded - not overridden.

class A6 {
    int i, j;

     A6(int a, int b) {
         i = a;
         j = b;
     }

     //display i and j

     void show(){
         System.out.println(i + " " + j);
     }
}

class B6 extends A6{
    int k;

    B6(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //overload show()
    void show(String msg){
        System.out.println(msg + k);
    }
}

public class Override2 {
    public static void main(String[] args) {
        B6 subOb = new B6(1,2,3);

        subOb.show("This is k: ");
        subOb.show();
    }
}
