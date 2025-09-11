//Local variable type inference with a user-defined class type.

//class MyClass {
//    private int i;

//    MyClass(int k){ i = k; }
//
//    int geti() {return i; }
//    void seti(int k) {if(k >= 0) i = k; }
//}
//public class RefVarDemo {
//    public static void main(String[] args) {
//        var mc = new MyClass(10);
//        System.out.println(mc.geti());
//        mc.seti(19);
//        System.out.println(mc.geti());
//    }
//}
