///*
//
//    This program contains an error.
//
//    A subclass must come before its superclass in
//    a series of catch statements. If not,
//    unreachable code will be created and a
//    compile-time error will result.
//
// */
//
//class SuperSubCatch {
//    public static void main(String[] args) {
//        try {
//            int a = 0;
//            int b = 42 / a;
//        } catch (Exception e) {
//            System.out.println("Generic Exception catch.");
//        }catch (ArithmeticException e) { //This catch is never reached
//            System.out.println("This is never reached.");
//        }
//    }
//}
//
///*
//
//    The first catch statement will handle all Exception-based errors, including
//    ArithmeticException. This means that the second catch statement will never execute.
//    To fix the problem, reverse the order of the catch statements.
//
// */