public class AutomaticTypePromotionExpressions2 {
    public static void main(String[] args) {
        /*
        byte b = 50;
        b = b * 2; // This will cause a compile-time error, due to the byte was promoted already to an int, it cannot be assigned to a byte again.
        */

        /*
        In cases ehre you understand the consequences of overflow, you should use an explicit cast such as

        byte b = 50;
        b = (byte) (b * 2);

        which yields the correct value of 100.
         */
    }
}
