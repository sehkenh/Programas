//Demonstrate a one-dimensional array.
public class Array {
    public static void main(String[] args){
        int [] month_days;
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("April has " + month_days[3] + " days");
        /* It is possible to combine the declaration of the array variable with the allocation of the array itself, as shown here:

        int [] month_days = new int [12];

        This is the way that you will normally see it done in professionally written Java programs.
        */
    }
}
