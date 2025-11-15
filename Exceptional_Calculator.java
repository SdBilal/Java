import java.util.Scanner;


class InvalidInputException extends Exception{
    @Override
    public String getMessage() {
        return ("enter a valid input");
    }

    @Override
    public String toString() {
        return ("an unrecognised symbol was passed ");
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String getMessage() {
        return("cannot divide an integer with 0");
    }

    @Override
    public String toString() {

        return("integer 0 cannot be further divided ; change the input !");
    }
}
class MaxinputException extends Exception{
    @Override
    public String getMessage() {
        return("maximum limit of an integer has been breached");
    }

    @Override
    public String toString() {
        return("enter a integer value less than 1,00,000");
    }
}
class MaxMultiplierException extends Exception{
    @Override
    public String getMessage() {
        return("Maximum limit of a multiplier is 7000");
    }

    @Override
    public String toString() {
        return("Decrease the input value");
    }
}
/**
 * This is a class created for practicing the java Exceptions with Creating a Calculator which gives Exceptions when the rules are not being followed as expected
 * @author Syed Bilal
 * @since 2005
 * @version best version available
 * @see "CWH course on YouTube"
 */
public class Exceptiional_Calculator {

    static int a,b;
    static String c;

    /**
     * this is a constructor for Exceptional calculator class . this takes all the inputs needed ( int a - for storing integer value , int b - for storing another integer value , String c - for choosing an operator from the give list of 4 (+,-,*,/) )and stores the input for execution purposes
     */
    Exceptiional_Calculator(){
    Scanner sc=new Scanner(System.in);
        System.out.println("enter a number =");
        a=sc.nextInt();
        System.out.println("enter another number =");
        b=sc.nextInt();
        System.out.println("choose an operator \n 1. enter '+' for addition \n 2. enter '-' for subraction \n 3. enter '*' for multiplication \n 4. enter '/' for division");
        c=sc.next();
    }
    /**
     * This is an exceptional calculator which means this calculator has been created to practice the Exceptions in java some of the Exceptions Thrown
     * are not very professional and has no real life meaning of them as an example the MaxMultiplierException is thrown to avoid the user from entering a
     * value greater than 7000 as an input while executing the Multiplication process this Exception is baseless as if normally we put 9000 also as an input
     * java is capable to provide the solution for it .  anyway this method should be implemented in a try catch situation or the programmer should include
     * that the main function throws Exceptions when implemented .
     * @return this returns the final value obtained after completing the task which was given by the user .
     * @throws InvalidInputException  when an unrecognised symbol is passed or anything other than an integer is given as an input then this Exception occurs .
     * @throws MaxinputException the maximum input value for any integer is 1,00,000 ( 1 lakh ) and if the input value exceeds the limit this Exception pops up .
     * @throws MaxMultiplierException the maximum input value for a multiplier is 7000 and if the multiplier value exceeds the limit the Exception pops up .
     * @throws CannotDivideByZeroException this  Exception is thrown to avoid the input as 0 while executing the division method .
     */
    public static int Exp_calci() throws InvalidInputException, MaxinputException, MaxMultiplierException, CannotDivideByZeroException {
        if (a >= 100000 || b >= 100000) {
            throw new MaxinputException();
        }
        if (c.equals("+")) {
            return (a + b);
        }
        if (c.equals("-")) {
            return (a - b);
        }
        if (c.equals("*")) {
            if (a >= 7000 || b >= 7000) {
                throw new MaxMultiplierException();
            }
            return (a * b);
        }
        if (c.equals("/")) {
            if (a == 0 || b == 0) {
                throw new CannotDivideByZeroException();
            }
            return (a / b);
        } else {
            throw new InvalidInputException();
        }
    }

    /**
     * the main function is used to execute the code . the try catch method is used for Exception handling puposes
     * @param args args is the arguments of the main function this is a pre-existent format which cannot be ignored
     */
    public static void main(String[] args) {
        int r;
        Exceptiional_Calculator e=new Exceptiional_Calculator();
        try {
            r = e.Exp_calci();
            System.out.format("the answer is %d",r);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
