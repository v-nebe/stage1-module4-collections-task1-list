package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        String buf;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < sourceList.size() - 1; i++) {
                if (comparator.compare(sourceList.get(i), sourceList.get(i + 1)) == 1) {
                    isSorted = false;

                    buf = sourceList.get(i);
                    sourceList.set(i, sourceList.get(i + 1));
                    sourceList.set(i + 1, buf);
                }
            }
        }
    }
}
class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int first = Integer.parseInt(a);
        int last = Integer.parseInt(b);
        if(Math.abs(first)>Math.abs(last)){
            return 1;
        }else if(Math.abs(first)<Math.abs(last)){
            return -1;
        } else{
           if(first==last){
               return 0;
           }else if(first>last)
               return 1;
           else{
               return -1;
           }
        }
    }
}
