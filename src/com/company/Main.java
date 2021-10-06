package com.company;

public class Main {

    public static void main(String[] args) {

        DecompressString ds = new DecompressString("3[abc]4[ab]c");
        String result = ds.decompress();
        //System.out.println("Result: " + result);
        checkDecompress("abcabcabcababababc", result);
        ds = new DecompressString("3[2[a]b]");
        result = ds.decompress();
        checkDecompress("aabaabaab", result);
        ds = new DecompressString("10[a]3[ph]");
        result = ds.decompress();
        checkDecompress("aaaaaaaaaaphphph", result);
    }

    public static void checkDecompress(String expected, String actual){
        System.out.println("Expected output: " + expected);
        System.out.println("Actual output: " + actual);
        if(expected.equals(actual)){
            System.out.println("Success!\n");
        }
        else{
            System.out.println("Failed!\n");
        }
    }
}
