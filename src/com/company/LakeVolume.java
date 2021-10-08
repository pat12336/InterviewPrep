package com.company;

public class LakeVolume {

    public LakeVolume(){

    }

    public int volumeOfLake(int[] height){
        int leftPointer = 0;
        int rightPointer;
        int farthestElem = 0;
        int water = 0;
        for(int i = 0; i < height.length; i++){
            if(height[i] >= height[leftPointer]){
                leftPointer = i;
            }
            else{
                rightPointer = findRightPointer(height, leftPointer);
                if(rightPointer == -1){
                    break;
                }
                else{
                    water += addWater(height, leftPointer, rightPointer);
                    farthestElem = leftPointer;
                    leftPointer = rightPointer;
                    i = rightPointer;
                }
            }
        }
        rightPointer = height.length - 1;
        for(int i = height.length-1; i > farthestElem; i--){
            if(height[i] >= height[rightPointer]){
                rightPointer = i;
            }
            else{
                leftPointer = findLeftPointer(height, rightPointer, farthestElem);
                if(leftPointer == -1) {
                    break;
                }
                else{
                    water += addWater(height, leftPointer, rightPointer);
                    rightPointer = leftPointer;
                    i = leftPointer;
                }
            }
        }
        return water;
    }

    public int findRightPointer(int[] height, int leftPointer){
        for(int i = leftPointer+1; i < height.length; i++){
            if(height[i] >= height[leftPointer]){
                return i;
            }
        }
        return -1;
    }

    public int addWater(int[] height, int lp, int rp){
        int water = 0;
        int min = Math.min(height[lp], height[rp]);
        for(int i = lp+1; i < rp; i++){
            water = water + (min - height[i]);
        }
        return water;
    }

    public int findLeftPointer(int[] height, int rightPointer, int farthest){
        for(int i = rightPointer-1; i > farthest ; i--){
            if(height[i] >= height[rightPointer]){
                return i;
            }
        }
        return -1;
    }
}
