package com.in6k.Sequense;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by employee on 7/8/16.
 */
public class SequenseFinderTests {
    @Test
    public void nullArray() throws Exception {
        Assert.assertArrayEquals(SequenseFinder.getMaxSequense(null), new int[0]);

    }
}
