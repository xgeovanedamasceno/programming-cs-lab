package oop.javaio;

import java.io.*;


public class TestJavaOutput {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("output.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Hello there!");
        bw.close();
    }
}
