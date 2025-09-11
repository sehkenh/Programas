//Using super to overcome name hiding.
class A3{
    int i;
}

//Create a subclass by extending class interfaceextend.A.
class B3 extends A3{
    int i;//This i hides the i in interfaceextend.A

    B3(int a, int b){
        super.i = a; //i in interfaceextend.A
        i = b; // i in interfaceextend.B
    }

    void show(){
        System.out.println(super.i);
        System.out.println(i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B3 subOb = new B3(1, 2);

        subOb.show();
    }
}
