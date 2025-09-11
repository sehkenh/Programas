class Test10{
    int a, b;

    Test10(int i, int j){
        a = i;
        b = j;
    }

    // pass an object
    void meth(Test10 o){
        o.a *=2;
        o.b /=2;
    }
}

public class PassObjRef {
    public static void main(String[] args){
    Test10 ob = new Test10(15, 20);

    System.out.println("a = " + ob.a);
    System.out.println("b = " + ob.b);
    ob.meth(ob);
    System.out.println("a = " + ob.a);
    System.out.println("b = " + ob.b);

    }
}
//Pass an object to a method.