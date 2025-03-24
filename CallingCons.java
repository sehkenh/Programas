//Demonstrate when constructor are executed.

//Create a superclass.
class A4{
    A4() {
        System.out.println("A4 constructor");
    }
}

class B4 extends A4{
    B4(){
        System.out.println("B4 constructor");
    }
}

class C4 extends B4{
    C4(){
        System.out.println("C4 constructor");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C4 c = new C4();
    }
}
