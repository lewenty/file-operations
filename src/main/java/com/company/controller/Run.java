package com.company.controller;

import com.company.service.Operations;

import java.util.Date;

/**
 * Created by levent.yildiz on 11.10.2014.
 */
public class Run {

    public static void main(String[] args) {

        System.out.println("RUNING..");

        //call writer class
        Operations op = new Operations();

        Long currDate = System.currentTimeMillis();
        Date date = new Date(currDate);
        String timeStr = date.toString();

        //content to file  + system time
        String content1 = "ilk satiri dosyaya yaz " + timeStr + "\n";
        String content2 = "ikinci satiri dosyaya yaz " + timeStr + "\n";
        String content3 = "Ucuncu  satiri dosyaya yaz " + timeStr + "\n";

        //write to file
        op.writeFile(content1);
        op.writeFile(content2);
        op.writeFile(content3);

        //append to file
        op.appendFile(content1);
        op.appendFile(content2);
        op.appendFile(content3);


        //read file
        op.readFile("C:\\read-file.txt");


    }
}
