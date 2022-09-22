package org.example;

public class Excercise2 {
    public int solution2(int a, int b, int k){
        if (a % k == 0)
            return (b/k) - (a/k) + 1;
        return (b/k) - (a/k);
    }
}
