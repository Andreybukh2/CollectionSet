package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 1; i <= 20; i++)
            integerSet.add(i);
        for (Integer integerTest : integerSet) {
            System.out.println(integerTest);
        }
        return integerSet;
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        Integer a;
        while (iterator.hasNext()) {
            a = iterator.next();
            if (a.compareTo(10) > 0) iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }
}
