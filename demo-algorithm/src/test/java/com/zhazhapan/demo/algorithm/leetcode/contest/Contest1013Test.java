package com.zhazhapan.demo.algorithm.leetcode.contest;

import org.junit.Test;

public class Contest1013Test {

    @Test
    public void numPairsDivisibleBy60() {
        Contest1013 contest1013 = new Contest1013();
        assert 3 == contest1013.numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40});
        assert 3 == contest1013.numPairsDivisibleBy60(new int[]{60, 60, 60});
    }
}