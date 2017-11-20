package com.level.zoo.animal;

import java.io.*;

public class FileUtils {
    private static File file;

    public static void write(String fileName, String text) {
        File file = new File(fileName);
        try {

            if (!file.exists()) {
                file.createNewFile();
            }


            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                out.print(text);
            } finally {

                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static String text = "This new text \nThis new text2\nThis new text3\nThis new text4\n";
    private static String fileName = "zoo.txt" + "output.txt";

    public static void main(String[] args) throws FileNotFoundException {
        FileUtils.write(fileName, text);
    }

    public static String read(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        exists(fileName);
        File file = new File(fileName);
        try {

            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    }

    private static void exists(String fileName) {
        FileUtils.fileName = fileName;
    }
}












