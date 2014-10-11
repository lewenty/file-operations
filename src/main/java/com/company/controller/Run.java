package com.company.controller;

import com.company.service.WriteToFile;

import java.util.Date;

/**
 * Created by levent.yildiz on 11.10.2014.
 */
public class Run {

    public static void main(String[] args) {

        System.out.println("RUNING..");

        //call writer class
        WriteToFile wf = new WriteToFile();

        Long currDate = System.currentTimeMillis();
        Date date = new Date(currDate);
        String timeStr = date.toString();

        //content to file  + system time
        String content1 = "ilk satiri dosyaya yaz " + timeStr + "\n";
        String content2 = "ikinci satiri dosyaya yaz " + timeStr + "\n";
        String content3 = "Ucuncu  satiri dosyaya yaz " + timeStr + "\n";

        //write to file
        wf.writeFile(content1);
        wf.writeFile(content2);
        wf.writeFile(content3);

        //append to file
        wf.appendFile(content1);
        wf.appendFile(content2);
        wf.appendFile(content3);


    }
}
