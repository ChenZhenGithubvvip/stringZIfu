package com.chen.ping;

import com.chen.ping.util.ReadFiles;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String testFile = "C:\\Users\\Administrator\\Desktop\\no_contact2_2019116.log";
        String str1 = "encIdNum=";
        String str2 = "codeIdNum";
        ReadFiles.readFile(testFile,str1,str2);
    }
}
