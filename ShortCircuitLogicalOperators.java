public class ShortCircuitLogicalOperators {
    /*

        if (denom !=0 && num / denom > 10 )

        Since the short-circuit form of AND(&&)is used, there is no risk of causing a run-time
        exception when denom is zero. If this line of code were written using the single & version of
        AND, both sides would be evaluated, causing a run-time exception when denom is zero.

        However, there are exceptions to this rule. For example, consider the following statement:

        if(c == 1 & e++ < 100) d = 100;

        Here, using a single & ensures that the increment operation will be applied to e whether c is
        equal to 1 or not.

     */
}
