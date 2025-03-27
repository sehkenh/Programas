class A9 {
    final void meth(){
        System.out.println("meth");
    }
}

class B8 extends A9 {
    void meth(){//ERROR!
        System.out.println("illegal");
    }
}

public class PreventOverring {
}
