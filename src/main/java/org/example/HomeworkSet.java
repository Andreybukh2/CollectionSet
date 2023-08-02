package org.example;

import java.util.HashSet;
import java.util.Set;

public class HomeworkSet {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(15);
        integerSet.add(2);
        integerSet.add(11);
        integerSet.add(1);
        integerSet.add(5);
        integerSet.add(20);
        integerSet.add(18);
        integerSet.add(14);
        integerSet.add(14);
        integerSet.add(5);

        Set<Integer> integerSet1 = new HashSet<>();
        int e = 0;
        for (Integer intSet : integerSet) {
            if (intSet < 10) {
                e = intSet;
                integerSet1.add(e);
            }
        }
        System.out.println(integerSet1);
    }
}
