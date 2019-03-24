public class JavaControlFlow {
    public static void main(String[] args) {
        isPrime(23);
    }


    /**
     * We've learnt about operators and other basics of Java Now, it's time to take another leap and learn to use
     * control structures that helps us choose flow of any code. Given two integers A and B. Your task is to print the
     * even number first and odd number next in individual lines.
     * <p>
     * Input Fomat: First line of input contains number of testcases denoted by T. For each testcase, there will be
     * single line containing a and b separated by space.
     * <p>
     * Output Fomat: For each testcase, print the even number first and odd number next in individual lines.
     * <p>
     * User Task: Sinc this is a function problem, you don't have to take any input. You just have to complete the
     * function evenOdd().
     * <p>
     * Constraints: 1 <= T <= 100 0 <= A,B <= 108
     * <p>
     * Example: Input: 1 4 5
     * <p>
     * Output: 4 5
     */
    static void evenOdd(int a, int b) {
        //Your code here
        int even = a % 2 == 0 ? a : b;
        int odd = a % 2 != 0 ? a : b;
        System.out.println(even);
        System.out.println(odd);

    }

    /**
     * Sometimes, the normal if-else isn't enough. In such cases, we have what we call ladder if and else conditions. So
     * here we'll learn to use them.
     * <p>
     * Given a positive integer N. Your task is to check if it divisible as given below: 1. If it is divisible by
     * 2,print "Two". 2. If it is divisible by 3, print "Three". 3. If it is divisible by 11, print "Eleven". 4. If not
     * follow above three rules, print "-1". Note: If N is divisible by more than one of the above given numbers, print
     * the one which is largest.
     * <p>
     * Input Format: First line of input contains number of testcases T. For each testcases, there will be a single line
     * containing N.
     * <p>
     * Output Format: For each testcase, check divisibility and print statements accordingly as given in above steps
     * (without quotes).
     * <p>
     * Your Task: Your task is to complete the function to check divisibility as required.
     */
    static void isDivisibleByPrime(int n) {

        //Your code here
        if ((n % 2 == 0 && n % 3 == 0 && n % 11 == 0) ||
                (n % 3 == 0 && n % 11 == 0) ||
                (n % 2 == 0 && n % 11 == 0)
                || (n % 11 == 0)) {
            System.out.println("Eleven");
        } else if ((n % 2 == 0 && n % 3 == 0) || n % 3 == 0) {
            System.out.println("Three");
        } else if (n % 2 == 0) {
            System.out.println("Two");
        } else {
            System.out.println(-1);
        }

        System.out.println();
    }

    /**
     * What do you do when you need to execute certain statements more than once? You put them in a loop. Loops are very
     * powerful. Majority of coding questions need loops to work. You can't even input testcases without loops!
     * <p>
     * Here, we will use for loop and check if the given number n is prime or not. Note: A number is prime if it's
     * divisible by itself and 1. Also, 1 is not prime.
     * <p>
     * Input Format: First line of input conatins number of testcases T. For each testcase, there will be one line of
     * input containing a number n.
     * <p>
     * Output Format: For each testcase, print "Yes" if n is prime, else print "No".
     * <p>
     * User Task: Your task is to complete the provided function.
     */
    static void isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            //Your code here
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime && n > 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * While loop is another loop like for loop but unlike for loop it only checks for one condition.
     * <p>
     * Here, we will use while loop and print a number n's table in reverse order.
     * <p>
     * Input Format: First line of input conatins number of testcases T. For each testcase, there will be one line of
     * input containing a number n.
     * <p>
     * Output Format: For each testcase, print n*10, n*9....n*1.
     * <p>
     * User Task: Your task is to complete the provided function.
     */
    static void printTable(int n) {
        int multiplier = 10;
        while (multiplier > 0) {
            System.out.print(n * multiplier + " ");
            multiplier--;

        }
        System.out.println();
    }
}


