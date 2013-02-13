package io.stream.delete_zero;

import java.io.*;

/**
 * User: Igor Russo
 * Date: 13.02.13
 * Time: 17:56
 */
public class DeleteZeroApp_lab {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("d:/java.txt");
        OutputStream out = new FileOutputStream("d:/java_out.txt", false);
        long startTime = System.currentTimeMillis();
        while (true) {
            int value = in.read();
            if (value > 0) {
                out.write(value);
            } else if (value == -1) {
                break;
            }
        }
        long deltaTime = System.currentTimeMillis() - startTime;
        in.close();
        out.flush();
        out.close();
        System.out.println(deltaTime);
    }
}
