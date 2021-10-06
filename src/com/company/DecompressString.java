package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class DecompressString {

    String compressedString;

    public DecompressString(String compressedString){
        this.compressedString = compressedString;
    }

    public String decompress(){
        StringBuffer result = new StringBuffer();
        StringBuffer temp = new StringBuffer();
        Stack<Integer> repeater = new Stack<>();
        int numToRepeat = 0;
        char c;
        for(int i = 0; i < compressedString.length(); i++){
            c = compressedString.charAt(i);
            if(isNumeric(c)){
                while(c != '['){
                    numToRepeat = numToRepeat * 10 +Integer.parseInt(String.valueOf(c));
                    i++;
                    c = compressedString.charAt(i);
                }
                repeater.push(numToRepeat);
                numToRepeat = 0;
            }
            else{
                while(c != ']'){
                    temp.append(c);
                    i++;
                    if(i >= compressedString.length()){
                        break;
                    }
                    else {
                        c = compressedString.charAt(i);
                    }
                }
                //System.out.println(temp);
                if(!repeater.isEmpty()) {
                    int rep = repeater.pop();
                    if(!repeater.isEmpty()){
                        String s = temp.toString();
                        for(int j = 0; j < rep-1; j++){
                            temp.append(s);

                        }
                    }
                    else {
                        for (int j = 0; j < rep; j++) {
                            result.append(temp.toString());

                        }
                        temp = new StringBuffer();
                    }
                }
                else{
                    result.append(temp.toString());
                    temp = new StringBuffer();
                }
            }
        }
        return result.toString();

    }

    public String decompress(String s, String subString){
        /*
            function placed here for recursive implementation
         */
        return "";
    }

    public static boolean isNumeric(char c){
        int num;
        try{
            num = Integer.parseInt(String.valueOf(c));
            return true;
        }catch(NumberFormatException e){
            //System.out.println("Not a number");
        }
        return false;
    }
}