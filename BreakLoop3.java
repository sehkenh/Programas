//Using break with nested loops.
public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i +": " );
            for (int j = 0; j < 101; j++) {
                if (j == 101) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loop complete.");
    }
}
