package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IF {
    Iterator[] iter;
    int currIndex;
    Set<Integer> emptyLists;

    IF(Iterator[] iter){
        this.iter = iter.clone();
        currIndex = 0;
        emptyLists = new HashSet<>();
    }

    public boolean hasNext(){
        return iter[currIndex].hasNext();
    }

    public Object next(){
        Object nx = iter[currIndex].next();
        if(!iter[currIndex].hasNext()){
            emptyLists.add(currIndex);
        }
        currIndex++;
        while(currIndex < this.iter.length && emptyLists.contains(currIndex)){
            currIndex++;
        }
        if(currIndex == this.iter.length){
            int i;
            for(i = 0; i < iter.length-1; i++){
                if(!emptyLists.contains(i)){
                    break;
                }
            }
            currIndex = i;
        }
        return nx;
    }

}
