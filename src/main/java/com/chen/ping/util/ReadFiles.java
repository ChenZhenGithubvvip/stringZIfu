package com.chen.ping.util;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.StringJoiner;

public class ReadFiles {

    public static void readFile(String testFilePath,String str1,String str2){
        File testFile = new File(testFilePath);
        try {
            List<String> lines = Files.readLines(testFile, Charsets.UTF_8);
            for (String line : lines) {
                int indexStart = line.indexOf(str1);
                int indexEnd = line.indexOf(str2);
                System.out.println(line.substring(indexStart+str1.length(),indexEnd));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFileR(String testFilePath,String str1,String str2){
        File testFile = new File(testFilePath);
        StringJoiner stringJoiner = new StringJoiner("");
        try {
            List<String> lines = Files.readLines(testFile, Charsets.UTF_8);
            for (String line : lines) {
                int indexStart = line.indexOf(str1);
                int indexEnd = line.indexOf(str2);
                System.out.println(line.substring(indexStart+str1.length(),indexEnd));
                stringJoiner.add(line.substring(indexStart+str1.length(),indexEnd)).add("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringJoiner.toString();
    }
}
