//This program will not compile.

class Outer2 {
    int outer_x2 = 10;

    void test () {
        Inner inner = new Inner();
        inner.display();

    }
    }

    //this is an inner class
    class Inner {
    int y = 10; //y is local to Inner

    void display () {
        System.out.println("display: outer_x: " + outer_x2);//Here void display does not have access to the outer class
    }

    void showy() {
        System.out.println(y); //error, y not know here!
    }
}


public class InnerClassDemo2 {
    public static void main(String[] args){
        Outer2 outer = new Outer2();
        outer.test();
    }
}
