package com.m3c.agw;

/**
 * Created by alumniCurie02 on 11/10/2017.
 */
public class SplitString {

    public char[] StringToArray(String stringToCheck){


        String alteredString = stringToCheck.replace("[^()]","");
        char[] arrayChecker = alteredString.toCharArray();
        return arrayChecker;

    }
}
