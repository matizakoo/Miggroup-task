package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Exercise1 {
    public int solution1(int n) {
        if(n==0)
            return 0;
        n = n < 0 ? n * -1 : n;
        HashSet<Integer> hashMap = new HashSet<>();
        while(n>0) {
            hashMap.add(n%10);
            n = n/10;
        }
        return hashMap.size();
    }
}
