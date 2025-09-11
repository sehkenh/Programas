public class OneDimensionalArrays {
    public static void main(String[] args){
        int [] month_days;//declaration
        //array-var = new type [size]
        month_days = new int [12];

        /*
        After this statement executes, month_days will refer to an array of 12 integers. Further, all elements
        in the array will be initialized to zero.

        Obtaining and array is a two-step process.
        */

        month_days[1] = 28;
        //this statement assigns the value 28 to the second element of month_days.

        System.out.println(month_days[1]);
    }
}
