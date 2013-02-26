package thread.thread.rabbit_attack;

import sun.org.mozilla.javascript.internal.ast.NewExpression;
import thread.thread.PrintRunnable;

/**
 * User: Igor Russo
 * Date: 26.02.13
 * Time: 7:56
 */
public class Lab_Thread_Thread_Rabbit_Attack_Solution {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new RabbitPrinter()).start();

        for (int k = 1; k < 10000000; k++) {
            String spaces = spaces(k);
            Runnable printer = new PrintRunnable(spaces + k, 100);
            Thread thread = new Thread(printer);
            thread.start();
            Thread.sleep(100);
        }
    }


    private static String spaces(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += " ";
        }
        return result;
    }

    private static class RabbitPrinter implements Runnable {
        @Override
        public void run() {
            System.out.println("New rabbit born!");
            Runnable printer = new PrintRunnable(spaces + k, 100);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (...) {
                new Thread().start(new RabbitPrinter());

            }
        }
    }
}

