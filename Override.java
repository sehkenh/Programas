//Method overriding

class A5 {
    int i, j;

    A5(int a, int b){
        i = a;
        j = b;
    }

    //display i and j.

    void show(){
        System.out.println("i = " + i + ", j = " + j);
    }
}

class B5 extends A5{
    int k;

    B5(int a, int b, int c){
        super(a, b);
        k = c;
    }

    //display k - this overrides show() in A5

    void show(){
        System.out.println("k = " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B5 subOb = new B5(1,2,3);
        subOb.show(); // this call show() in B5.
    }
}

/*

    If you wish to access the superclass version of an
    overridden method, you can do so by using super.



 */

//class B5 extends A5 {
//    int k;
//    B5(int a, int b, int c){
//        super(a, b);
//        k = c;
//    }
//    void show(){
//        super.show(); // This calls interfaceextend.A's show
//        System.out.println("k = " + k);
//    }
//}

