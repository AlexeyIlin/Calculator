package com.skillsup.calculator.io;

import java.io.*;

/**
 * Created by Aleksey on 06.11.2017.
 */
public class WriteFile {

    private String fileName;
    double result, nodResult, nokResult;

    public WriteFile (String fileName){
        this.fileName = fileName;
    }

    public void addToFile (double result, double nodResult, double nokResult) throws IOException {

        String finalResult = String.valueOf(result);
        String nod = String.valueOf(nodResult);
        String nok = String.valueOf(nokResult);


        try {
            new String(readCharsFromFile(fileName, 1, 1));

            writeData(fileName, " = "+finalResult , 1);
            writeData(fileName, "\n The NOD is "+nod , 1);
            writeData(fileName, "\n The NOK is "+nok , 1);
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    private static void writeData(String fileName, String result, int seek) throws IOException{
        RandomAccessFile file = new RandomAccessFile(fileName, "rw");
        long s = file.length();
        file.seek(s);
        file.write(result.getBytes());
        file.close();
    }

    private static byte[] readCharsFromFile(String fileName, int seek, int chars) throws IOException{
        RandomAccessFile file = new RandomAccessFile(fileName, "r");
        file.seek(seek);
        byte[] bytes = new byte[chars];
        file.read(bytes);
        file.close();
        return bytes;
    }
}
