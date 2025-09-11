//Use type inference in a for loop
public class TypeInferenceInFor {
    public static void main(String[] args) {

        //Use type inference with the loop variable.
        System.out.print("Values of x: ");
        for(var x = 2.5; x < 100.0; x = x * 2)
            System.out.print(x + " ");

        System.out.println();

        //Use type inference with the iteration variable.
        int [] nums = {1,2,3,4,5,6};
        System.out.print("Values in nums array: ");
        for (var v : nums)
            System.out.print(v + " ");

        System.out.println();
    }
}
/*

    Local variable type inference will not be use by most of he for loops in the remainder of this book.
    You should of course, consider it for new code that you write.

 */