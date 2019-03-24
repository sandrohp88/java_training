public class JavaOperators {

    public static void main(String[] args) {
        logicOp(true, false);
    }

    /**
     * Logical operators are used when we want to check the truth value of certain statements. Logical operators help us
     * in checking multiple statements together for their truthness.
     * <p>
     * Here we will learn logical operators like AND(&&), OR(||), NOT(!). These operators produce either a true or a
     * false as an output.
     * <p>
     * Input Format: First line of input conatins number of testcases T. For each testcase, there will be one line of
     * input containing a and b separated by a space.
     * <p>
     * Output Format: For each testcase, print the required output.
     * <p>
     * User Task: Your task is to complete the provided function logicOp().
     * <p>
     * Constraints: 1 <= T <= 10 a, b, -> {true, false}
     */
    static void logicOp(boolean a, boolean b) {
        /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/
        System.out.println((a && b) + " " + (a || b) + " " + ((!a) && (!b)));
    }

    /**
     * Bitwise operators are useful when we want to work with bits. Here, we'll take a look at them.
     * <p>
     * Given three positive integers a, b and c. Your task is to perform some bitwise operations on them as given below:
     * 1. d = a ^ a 2. e = c ^ b 3. f = a & b 4. g = c | (a ^ a) 5. e = ~e Note: ^ is for xor.
     * <p>
     * Input Format: First line of input contains number of testcases. For each testcase, there will be single line
     * containing a, b and c.
     * <p>
     * Output Format: For each testcase, output the result of operations performed in all the above given 5 steps in new
     * line.
     */
    static void bitWiseOp(int a, int b, int c) {

        // Your code here
        System.out.println(a ^ a);
        System.out.println(c ^ b);
        System.out.println(a & b);
        System.out.println(c | (a ^ a));
        int e = c ^ b;
        System.out.println(~e);
    }
}
