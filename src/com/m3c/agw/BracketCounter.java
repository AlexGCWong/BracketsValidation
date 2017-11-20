package com.m3c.agw;

/**
 * Created by alumniCurie02 on 11/10/2017.
 */
public class BracketCounter {

    SplitString splitString = new SplitString();

    public boolean countBrackets(String stringToCheck){

        char[] arrayToCheck = splitString.StringToArray(stringToCheck);


       long squareBracket = 0;
       long roundBracket = 0;
       long midpointArray = arrayToCheck.length / 2;


       for (int i = 0; i < arrayToCheck.length; i++) {

           switch (arrayToCheck[i]) {
               case '[': squareBracket += 1;break;
               case ']': if(arrayToCheck[i-1] == '('){ return false;} squareBracket -= 1;break;
               case '(': roundBracket += 1;break;
               case ')': if(arrayToCheck[i-1] == '['){ return false; }roundBracket -= 1;break;
           }

           if (roundBracket  < 0 || squareBracket < 0){
               return false;
           }
       }
       if (roundBracket != 0 || squareBracket != 0){
           return false;
       }

       return true;
    }

}
