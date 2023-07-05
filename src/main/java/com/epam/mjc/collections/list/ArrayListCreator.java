package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> newList = new ArrayList<>();
        for(int i=0, j=1; i<sourceList.size(); i++, j++){
            if(j % 3 == 0){
                newList.add(sourceList.get(i));
                newList.add(sourceList.get(i));
            }
        }
        return newList;
    }
}
