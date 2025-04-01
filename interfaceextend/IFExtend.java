package interfaceextend;// One interface can extend another.

interface A10 {
    void meth1();
    void meth2();
}

interface B10 extends A10 {
    void meth3();
}

//This class must implement all of interfaceextend.A and interfaceextend.B

class MyClass implements B10 {
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }
}

/*

    Recordar que los métodos o constructores de las clases se deben invocar, chan!

 */

class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }

}
