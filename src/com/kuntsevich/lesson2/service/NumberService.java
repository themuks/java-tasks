package com.kuntsevich.lesson2.service;

import java.util.List;

public class NumberService {

    public long calcSum(List<Integer> nums) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public long calcProduct(List<Integer> nums) {
        long product = 1;
        for (int num : nums) {
            product *= num;
        }
        return product;
    }
}
