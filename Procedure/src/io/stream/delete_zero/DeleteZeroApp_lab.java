package io.stream.delete_zero;

import java.io.*;

/**
 * User: Igor Russo
 * Date: 13.02.13
 * Time: 17:56
 */
public class DeleteZeroApp_lab {
    public static void main(String[] args) throws IOException {
        int buffSize = 10;
        InputStream in = null;
        OutputStream out = null;
        IOException ioException;
        long startTime = System.currentTimeMillis();

        try {
            in = new FileInputStream("d:/java.txt");
            out = new FileOutputStream("d:/java_out.txt", false);
            while (true) {
                byte[] buff = new byte[buffSize];
                int value = in.read(buff);

                if (value == -1) break;
                int lastZeroIndex = 0;
                for (int i = 0; i < buff.length; i++) {
                    if (buff[i] == 0 || i == buff.length - 1) {
                        if (i - lastZeroIndex > 0) out.write(buff, lastZeroIndex, i - lastZeroIndex);
                        lastZeroIndex = i + 1;
                    }
                }
            }
        } catch (IOException e) {
            ioException = e;
            new java.io.File("d:/java_out.txt").delete();
            throw ioException;
        } finally {
            long deltaTime = System.currentTimeMillis() - startTime;
            if (in != null) in.close();
            if (out != null) {
                out.flush();
                out.close();
            }
            System.out.println(deltaTime);
        }
    }
}
