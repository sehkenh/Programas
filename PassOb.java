class Test1 {
    int a, b;

    Test1(int i, int j) { //constructor
        a = i;
        b = j;
    }

    boolean equalTo(Test1 o) {//passing the constructor to the method. Constructor initialize objects, methods performs actions.
        if(o.a == a & o.b == b) return true;
        else return false;
    }
}

public class PassOb {
    public static void main(String[] args) {
        Test1 ob1 = new Test1(100, 22);
        Test1 ob2 = new Test1(100, 22);
        Test1 ob3 = new Test1(-1, -1);

        System.out.println(ob1.equalTo(ob2));
    }
}

/*

    Notice that the parameter o in equalTo() specifies Test as its type. Although Test is a class
    type created by the program, it is used in just the same way as Java's built-in types.

*/