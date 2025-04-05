import java.util.Random;

class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for(int i = 0; i<320000; i++){
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
                a = 0; // set a to zero and continue
            }
            System.out.println("a: " + a);
        }
    }
}
//Wow!

/*

    catch (ArithmeticException e) {
        System.out.println("Exception: " + e);
        a = 0; //set ato zero and continue
    }

    The ability to display a description of an exception is valuable in other circumstances
    -particularly when you are experimenting with exceptions or when you are debugging.

 */