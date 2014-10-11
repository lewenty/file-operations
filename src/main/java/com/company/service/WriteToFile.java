package com.company.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by levent.yildiz on 11.10.2014.
 */
public class WriteToFile {

    public static void writeFile(String content) {

        File file = new File("write-file.txt");

        //if file doesn't exists , then create it
        if (!file.exists())
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }

        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            System.out.println("SUCCESS..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void appendFile(String content) {
        File file = new File("append-file.txt");

        //if file doesn't exists , then create it
        if (!file.exists())
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }

        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            System.out.println("SUCCESS..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}