/*
    When you allocate memory for a two-dimensional array,
    you need only specify the memory fot the first(leftmost) dimension.
    You can allocate the remaining dimensions separately.
*/

/*
    For example, this following code allocates memory for the first
    dimension of twoD when it is declared. It allocates the second
    dimension separately.
*/
public class MemoryAllocationTwoDArray {
    public static void main(String[] args){
        int [][] twoD = new int[4][];
        twoD[0] = new int[5];
        twoD[1] = new int[5];
        twoD[2] = new int[5];
        twoD[3] = new int[5];
    }
}

