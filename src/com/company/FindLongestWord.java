package com.company;

public class FindLongestWord {
    FindLongestWord(){

    }

    public boolean isInString(String s, String word){
        int indexOfs = 0;
        for(int i = 0; i < word.length(); i++){
            for(int j = indexOfs; j < s.length(); j++){
                if(j == s.length()-1 && s.charAt(j) != word.charAt(i)){
                    return false;
                }
                if(s.charAt(j) == word.charAt(i)){
                    indexOfs = j;
                    break;
                }
            }
        }
        return true;
    }

    public String checkWords(String s, String[] words){
        String longestWord = "";
        for(String word: words){
            if(isInString(s, word) && word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        if(longestWord.length() > 0)
            return longestWord;
        else
            return "no substrings found";
    }

}
