// Demonstrate the for loop.
public class ForTick {
    public static void main(String[] args){
        int n;

        for (n = 10; n > 0; n--)
            System.out.println("tick "+ n);
    }
}
/*

    It is possible to declare the variable inside the initialization portion of the for. For example, here is the preceding
    program recoded so that the loop control variable n is declared as an int inside the for.

    // Declare a loop control variable inside the for.

    public class ForTick{
        public static void main (String[] args){

            //here n is declared inside the for loop
            for (int n = 10; n > 0; n--)
                System.out.print("tick " +n);
        }
    }

 */