package com.company;

import java.io.*;

public class ReadWriteOperations {

public static void main(String []args)
{
//    JsonOjbect obj = new JsonObject();
//    try {
//        InputStream inputStream = new FileInputStream(new File("Y:\\Java repo\\src\\com\\company\\Test\\output.txt"));
//    }
//    catch(Exception e)
//    {
//        System.out.println(e.toString());
//    }



   Write("a\nb\nc\nd\ne");
   System.out.println(Read("a").toString());
   Read("a");
}

public static Boolean Write(String input){

    boolean result;

        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Y:\\Java repo\\src\\com\\company\\Test\\output.txt"));
            bw.write(input);
            bw.close();
            result = true;
        }

        catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
        return result;
}

public static String Read(String input) {
    String content = "";
    try
    {
        BufferedReader br = new BufferedReader(new FileReader("Y:\\Java repo\\src\\com\\company\\Test\\"+input+".txt"));

        String s;
        while((s = br.readLine()) != null)
        {
            content = content + s;
        }
        br.close();
    }
    catch (IOException e)
    {
        e.printStackTrace();
        content = e.toString();
    }
    return content;
}


    public static Boolean Write2(String input)
    {
        return true;
    }
}
