// Dynamic Method Dispatch

class A7{
    void callme(){
        System.out.println("A7 callme()");
    }
}

class B7 extends A7{
    void callme(){
        System.out.println("B7 callme()");
    }
}

class C7 extends A7{
    void callme(){
        System.out.println("C7 callme()");
    }
}


public class Dispatch {
    public static void main(String[] args) {
        A7 a7 = new A7();
        B7 b7 = new B7();
        C7 c7 = new C7();

        A7 r;

        r = a7;
        r.callme();

        r = b7;
        r.callme();

        r = c7;
        r.callme();
    }
}
