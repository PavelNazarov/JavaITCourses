package ex.mech.InfOrNotInf;

/**
 * User: Igor Russo
 * Date: 01.02.13
 * Time: 1:09
 */
public class TryCatch {
    static int a = 0;
    public static void main(String[] args) {
        a++;
        try {
            System.out.println("m");
            main(args);
        } catch (StackOverflowError e) {
            System.out.println(a);
            main(args);
        }
    }
}
