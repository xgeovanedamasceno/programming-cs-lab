package oop.javaio;

import java.io.*;

public class TestJavaInput {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("file.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        while(s != null) {
            System.out.println(s);
            s = br.readLine();
        }

        br.close();

        InputStream isk = System.in;
        InputStreamReader isrk = new InputStreamReader(isk);
        BufferedReader brk = new BufferedReader(isrk);

        String sk;
        do {
            sk = brk.readLine();
            System.out.println(sk);
            sk = brk.readLine();
        } while (sk != null);
    }
}
