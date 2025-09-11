//Demonstrate a three-dimensional array.
public class threeDMatrix {
    public static void main(String[] args){
        int[][][] threeD = new int[3][4][5];
        int i,j,k;
        for (i=0; i<3; i++){
            for (j=0; j<4; j++){
                for (k=0; k<5; k++){
                    threeD[i][j][k] = i * j * k;
                    System.out.print(threeD[i][j][k]+ " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}

/*
    CONTINUE READING

    In the book version the for loops had been written two times,
    but here you can save lines by writing them in the same for loops. !

    #####################################################################
    #####################################################################
    READ BELOW!

    Alternative Array Declaration Syntax

    int a1 [] = new int[3];
    int [] a2 = new int[3];

    The following declarations are also equivalent:

    char twod1 [] = new char[3][4];
    char [] twod2 = new char[3][4];

    VERY IMPORTANT

    The alternative declaration form offers convenience when converting code from C/C++ to Java.
 */