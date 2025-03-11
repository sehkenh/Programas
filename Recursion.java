// A simple example of recursion.
class Factorial{
    int fact(int n){
        int result;

        if(n == 1) return 1;
        result = fact(n-1) * n; //(1*1*2*3*4)*5
        return result;//That's why it says return result
    }
}
/*
    THIS:

    public class GfG{
    public static int findSum(int n) {

        // Base case
        if (n == 0)
            return 0;

        // Recursive case
        return n + findSum(n - 1);
    }

    is THIS:


    f(n) = 0                n=0

    f(n) = n + f(n-1)    n>=1

 */
public class Recursion {
    public static void main(String[] args){ Factorial f = new Factorial();
        System.out.println(f.fact(5));
        System.out.println(f.fact(4));
        System.out.println(f.fact(3));
        System.out.println(f.fact(2));
        System.out.println(f.fact(1));
    }

}
