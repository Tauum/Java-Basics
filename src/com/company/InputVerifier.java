package com.company;

import javax.swing.*;

public class InputVerifier{

    public static Integer CheckStringAndConvertInt(String input)
    {
        Integer result;

        if (CheckString(input))
            try { result = Integer.parseInt(input); }
            catch (NumberFormatException e) { result = null; }
        else { result = null; }

        return result;
    }

    public static boolean CheckString(String input)
    {
        if(input != null && !input.isEmpty()) { return true; }
        return false;
    }
}
