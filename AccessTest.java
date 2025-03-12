/*

    This program demonstrate the diffeerence between
    public and private.

 */

class Test12{
    int a;
    public int b;
    private int c;

    void setc(int i){ //set c's value
        c = i;
    }
    int getc(){ //get c's value
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args){
        Test12 ob = new Test12();

        ob.a = 10;
        ob.b = 20;
        ob.setc(30); // Tiene que ser con setc, oséa accede al method primero

        //ob.c = 10;
        // no se puede

        ob.setc(10);
        System.out.println("ob.a = " + ob.a);
        System.out.println("ob.b = " + ob.b);
        System.out.println("ob.c = " + ob.getc());
    }
}
