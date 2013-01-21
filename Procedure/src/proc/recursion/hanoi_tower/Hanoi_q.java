package proc.recursion.hanoi_tower;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 20.01.13
 * Time: 1:57
 * To change this template use File | Settings | File Templates.
 */
public class Hanoi_q {

    public static void main(String[] args) {
        Stack<Integer> from = new Stack<>();
        Stack<Integer> help = new Stack<>();
        Stack<Integer> to = new Stack<>();
        from.push(3);
        from.push(2);
        from.push(1);
        exchange(from, help, to, from.size());
    }

    public static void exchange(
            Stack<Integer> from, Stack<Integer> help,
            Stack<Integer> to, int count) {
        if (count > 0) {
            exchange(from, to, help, count-1);
            int biggest = from.pop();
            to.push(biggest);
            exchange(help, from, to, count-1);
        }
    }
}
