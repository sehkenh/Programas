//Left shifting as a quick way to multiply by 2
public class MultByTwo {
    public static void main(String[] args){
        int i;
        int num = 0xFFFFFFE;

        for(i = 0; i < 4; i++){
            num = num << 1;
            System.out.println(num);
        }
    }
}
/*

    (FFFFFFE)₁₆ = (15 × 16⁶) + (15 × 16⁵) + (15 × 16⁴) + (15 × 16³) + (15 × 16²) + (15 × 16¹) + (14 × 16⁰) = (268435454)₁₀

    The starting value was carefully chosen so that after being shifted left 4 bit positions, it
    would produce -32. As you can see, when a 1 bit is shifted into bit 31, the number is interpreted
    as negative.
*/
