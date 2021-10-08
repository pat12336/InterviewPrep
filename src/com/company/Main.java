package com.company;

public class Main {

    public static void main(String[] args) {
        /*
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
        */
        LakeVolume lv = new LakeVolume();
        int[] heights = {1,3,2,4,1,3,1,4,5,2,2,1,4,2,2};
        int totalVolume = lv.volumeOfLake(heights);
        //System.out.println(totalVolume);
        checkLakeVolume(15, totalVolume);
        int[] heights2 = {0,1,0,2,1,0,1,3,2,1,2,1};
        totalVolume = lv.volumeOfLake(heights2);
        //System.out.println(totalVolume);
        checkLakeVolume(6, totalVolume);
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

    public static void checkLakeVolume(int expected, int actual){
        System.out.println("Expected output: " + expected);
        System.out.println("Actual output: " + actual);
        if(expected == actual){
            System.out.println("Success!\n");
        }
        else{
            System.out.println("Failed!\n");
        }
    }
}
