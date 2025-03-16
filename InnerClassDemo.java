// Demonstrate an inner class.

class Outer{
    int outer_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        void display() {
            System.out.println("display: outer x = " + outer_x);
        }
    }
}


public class InnerClassDemo {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.test();//Here there is a nested method also.
    }
}


/*

    It is important to realize that an instance of Inner can be created only in the context
    of class Outer

 */