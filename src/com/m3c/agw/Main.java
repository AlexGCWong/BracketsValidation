package com.m3c.agw;

public class Main {

    public static void main(String[] args) {

        BracketCounter bracketCounter = new BracketCounter();
        String stringToCheck = "[[[]]]";
        boolean check = bracketCounter.countBrackets(stringToCheck);
        if (check == true){
            System.out.println("YAY: valid String!!!!!!");
        }
        else{
            System.out.println("WARNING: Invalid String");
        }
    }
}
