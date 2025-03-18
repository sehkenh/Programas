// A simple example of inheritance

//Create a superclass
class A{
    int i, j;

    void showij(){
        System.out.println(i + j);
    }
}

class B extends A{
    int k;

    void showk(){
        System.out.println(k);
    }

    void sum(){
        System.out.println(i+ j + k);
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        //The superclass may be used by itself.
        superOb.i = 7;
        superOb.j = 9;
        superOb.showij();

        //The subclass B has access to all public members of its superclass A.
        subOb.i = 7;
        subOb.j = 9;
        subOb.showij();
        subOb.k = 9;
        subOb.showk();
        subOb.sum();
        System.out.println();
    }
}
