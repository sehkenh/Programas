/*
    In a class hierarchy, private members remain private
    to their class.

    This program contains an error and will not compile
 */
class A2{
    int i; //default access
    private int j; //private to A

    void seti(int x, int y){
        i = x;
        j = y;
    }
}

//A's j is not accessible here.
class B2 extends A2{
    int total;

    void sum(){
        total = i + j; // ERROR, j is no accessble here
    }
}

public class Access {
    public static void main(String[] args) {}
}
