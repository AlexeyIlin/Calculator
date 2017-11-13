package com.skillsup.calculator.io;

import java.io.*;

/**
 * Created by Aleksey on 06.11.2017.
 */
public class WriteFile {

    private String fileName;

    public WriteFile (String fileName){
        this.fileName = fileName;
    }

    public void addToFile (double result, double nodResult, double nokResult) throws IOException {

        String finalResult = String.valueOf(result);
        String nod = String.valueOf(nodResult);
        String nok = String.valueOf(nokResult);

        try {

            writeData(fileName, " = "+finalResult );
            writeData(fileName, "\n The NOD is "+nod);
            writeData(fileName, "\n The NOK is "+nok);



        } catch (IOException e){
            e.printStackTrace();
        }

    }

    private static void writeData(String fileName, String data) throws IOException{
        RandomAccessFile file = new RandomAccessFile(fileName, "rw");
        long s = file.length();
        file.seek(s);
        file.write(data.getBytes());
        file.close();
    }

}
