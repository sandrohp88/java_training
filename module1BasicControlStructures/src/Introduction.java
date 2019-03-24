import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        IOFunction();
    }

    /**
     * When learning a new language, we first learn to output some message. Here, we'll start with the famous Hello
     * World message. Now, here you are given a function to complete. Don't worry about the ins and outs of functions,
     * just add the command (System.out.print("Hello World")) to print Hello World. Input Format : No input
     * <p>
     * Output format : Hello World User Task: Your task is to complete the function below to print hello world.
     */


    // Function to print hello
    static void printHello() {

        // Your code here
        System.out.println("Hello World");

    }

    /**
     * You are familiar with producing output using JAVA In this task, you'll be required to write three messages in
     * three separate lines. Write Geeks for Geeks. But wait a minute!! You need to write each word of it in a separate
     * line. In the function printIndividualLine(), output each word of Geeks for Geeks in a separate line. Hint:
     * System.out.println() might be useful here!
     * <p>
     * Input Format: No input
     * <p>
     * Output Format: Geeks for Geeks
     * <p>
     * Example: Output: Geeks for Geeks
     */
    static void printIndividualLine() {

        // Your code here
        System.out.println("Geeks\nfor\nGeeks");

    }

    /**
     * Working with Data Types is very important in programming world. Here, we will learn to manipulate the basic data
     * types in Java. You will be given four different variables of different data types: a (int), b (float), c
     * (double), l (long), d (byte). Your task is to do step-wise operations as given below: 1. Divide c by b. 2. Divide
     * b by a. 3. Divide c by a. 4. Add result at step 3 with l. 5. Divide a by d.
     * <p>
     * Input Format: First line of input conatins number of testcases T. For each testcase, there will be one line of
     * input: a, b, c, l, and d.
     * <p>
     * Output Format: For each testcase, print the required output as directed in steps in a single line.
     * <p>
     * User Task: Your task is to complete the provided function dataTypes() following the above given steps.
     * <p>
     * Constraints: 1 <= T <= 10 1 <= a, b, c <= 106 1 <= d <= 127 1 <= l <= 1018
     */
    // Function to do operations with different data types
    static void dataTypes(int a, float b, double c, long l, byte d) {
         /*
            1. Divide c by b.
            2. Divide b by a.
            3. Divide c by a.
            4. Add result at step 3 with l.
            5. Divide a by d.
         */
        double p = c / b;//c/b
        double q = b / a;//b/a
        double r = c / a;//c/a
        double m = r + l;//r+l
        int s = a / d;//a/d

        System.out.println(p + " " + q + " " + r + " " + m + " " + s);

    }

    /**
     * Before implementing any algorithm, we should be thorough with taking inputs. Here, we will learn how to read
     * inputs. You are given four inputs: a(integer), b(float ), c(long), d(byte), s(string) respectively. You need to
     * take the input and print a and b separated by a space. Read : Java I/O
     * <p>
     * Input Format: First line of input conatins T, number of testcases. For each testcase, there will be five lines of
     * input containing a, b, c, d, s.
     * <p>
     * Output Format: For each testcase, print a, b, c, d, s in a new line.
     * <p>
     * User Task: Your task is to complete the provided function IOFunction().
     * <p>
     * Constraints: 1 <= T <= 10 1 <= a <= 106
     * <p>
     * Input: 1 5 2.5 6546854 120 geek for geeks
     * <p>
     * Output: 5 2.5 6546854 120 geek for geeks
     */
    // Function to take input using Scanner class
    static void IOFunction() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            // Your code here
            int a = sc.nextInt();
            float b = sc.nextFloat();
            long c = sc.nextLong();
            byte d = sc.nextByte();
            String s = sc.next();
            System.out.format("%d %f %d %d %s", a, b, c, d, s);

        }

    }

    /**
     * Comments are very useful in any language to tell user what is the task of any function or operation. The comments
     * are neglected by the compiler, so whatever you write in the comments won't have any effect on the working of a
     * code. In Java, comments can be written as mentioned below: This is a comment You are given a complete function
     * that outputs a,b, and c. Comment the code that outputs b, so only a and c gets printed.
     * <p>
     * <p>
     * Input Format:
     * <p>
     * First line of input conatins number of testcases T.For each testcase, there will be one line of input containing
     * a,b, and c.
     * <p>
     * <p>
     * Output Format:
     * <p>
     * For each testcase, print a, then print c in their separate lines.
     * <p>
     * <p>
     * User Task:
     * <p>
     * Your task is to comment the unnecessary statement.
     */
    // Function to print a and c
    //comment the line that outputs b
    static void comment(int a, int b, int c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    /**
     * Here, we will learn how  to take input of a string that comprises of multiple words. Also, we will learn to clear
     * the input buffer. Your task is to take input of strings and integers and produce the output. We must be clear
     * with next() and nextLine()
     * <p>
     * Note : Refer the following link to get better understanding: StackOverflow
     * <p>
     * Input Format: First line of input contains T,  number of testcases. For each testcase, there will be two lines of
     * input. First line contains integer, second line contains string.
     * <p>
     * Output Format: For each testcase, print the variables in same order as taken in input.
     * <p>
     * User Task: Your task is to complete the function getInput() to take input of strings and learn how to correctly
     * take input.
     * <p>
     * Example: Input: 1 5 Geeks For Geeks
     * <p>
     * Output: 5 Geeks For Geeks
     */

    static void getInput() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //Taking the number of testcases
        while (t-- > 0) {
            int a = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(a);
            System.out.println(s);
        }

    }

    /**
     * There are times when your answer is a floating point that contains undesired amount of digits after decimal.
     * Here, we'll learn how to get a precise answer out of a floating number. You are given two floating numbers a and
     * b. You need to output a/b and decimal precision of a/b upto 3 places after decimal point. Note: You may use
     * System.out.format()
     * <p>
     * Input Format: First line of input conatins number of testcases T. For each testcase, there will be one line of
     * input containing a and b separated by a space.
     * <p>
     * Output Format: For each testcase, print the required output in a new line.
     * <p>
     * User Task: Your task is to complete the provided function printInFormat().
     */
    static void printInFormat(float a, float b) {
        float result = a / b;

        System.out.format("%.7f %.3f\n", result, result);
    }


}
