class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a: " + a);
            int b = 42 / a;
            int [] c = { 1 };
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: " + e); //oob = out of bounds
        }
        System.out.println("After try/catch block");
    }
}

/*

    Will cause an ArrayIndexOutOfBoundsException, since the int array c has a length of 1, yet
    the program attempts to assign a value to c[42].

 */