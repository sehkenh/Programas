//Demonstrate the lifetime of a variable.
public class LifeTime {
    public static void main(String[] args){
        int x;

        for (x = 0; x < 3; x++){//every time x do a x++, its left the for, and then reenter the for loop!!
            int y = -1; // y is initialized each time block is entered
            System.out.println("y is : " +y);//this always prints -1
            y = 100;
            System.out.println("y is now: " +y);
        }
    }
}
