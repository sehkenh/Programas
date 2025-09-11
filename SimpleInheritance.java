//// interfaceextend.A simple example of inheritance
//
////Create a superclass
//class A11{
//    int i, j;
//
//    void showij(){
//        System.out.println(i + j);
//    }
//}
//
//class B extends interfaceextend.A11 {
//    int k;
//
//    void showk(){
//        System.out.println(k);
//    }
//
//    void sum(){
//        System.out.println(i+ j + k);
//    }
//}
//
//public class SimpleInheritance {
//    public static void main(String[] args) {
//        interfaceextend.A superOb = new interfaceextend.A();
//        interfaceextend.B subOb = new interfaceextend.B();
//
//        //The superclass may be used by itself.
//        superOb.i = 7;
//        superOb.j = 9;
//        superOb.showij();
//
//        //The subclass interfaceextend.B has access to all public members of its superclass interfaceextend.A.
//        subOb.i = 7;
//        subOb.j = 9;
//        subOb.showij();
//        subOb.k = 9;
//        subOb.showk();
//        subOb.sum();
//        System.out.println();
//    }
//}
