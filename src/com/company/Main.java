package com.company;

import java.util.Arrays;
import java.util.Iterator;

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

        /*LakeVolume lv = new LakeVolume();
        int[] heights = {1,3,2,4,1,3,1,4,5,2,2,1,4,2,2};
        int totalVolume = lv.volumeOfLake(heights);
        //System.out.println(totalVolume);
        checkLakeVolume(15, totalVolume);
        int[] heights2 = {0,1,0,2,1,0,1,3,2,1,2,1};
        totalVolume = lv.volumeOfLake(heights2);
        //System.out.println(totalVolume);
        checkLakeVolume(6, totalVolume);
         */

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        int[] arr3 = {6, 7, 8, 9};
        Iterator<Integer> a = Arrays.stream(arr1).iterator();
        Iterator<Integer> b = Arrays.stream(arr2).iterator();
        Iterator<Integer> c = Arrays.stream(arr3).iterator();
        Iterator<Integer>[] iterlist = new Iterator[]{a, b, c};

        IF itfl = new IF(iterlist);
        while(itfl.hasNext()){
            //itfl.next();
            System.out.print(itfl.next());
        }

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
