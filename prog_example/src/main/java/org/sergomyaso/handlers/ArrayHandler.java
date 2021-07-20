package org.sergomyaso.handlers;

import java.util.ArrayList;

public class ArrayHandler {
    public ArrayList<Integer> findCompareArray(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                if (arr1.get(i).equals(arr2.get(j))) {
                    result.add(arr2.get(j));
                }
            }
        }
        return result;
    }
}
