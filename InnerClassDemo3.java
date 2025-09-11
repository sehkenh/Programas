// Define an inner class within a for loop.

class Outer4 {
    int outer_x3 = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner4 {
                void display () {
                    System.out.println("Outer x3 = " + outer_x3);
                }
            }
            Inner4 inner4 = new Inner4();
            inner4.display();
        }
    }

}

public class InnerClassDemo3 {
    public static void main(String[] args){
        Outer4 outer4 = new Outer4();
        outer4.test();
    }
}
