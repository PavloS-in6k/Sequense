package com.in6k.Sequense;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by employee on 7/8/16.
 */
public class SequenseFinderTests {

    @Test
    public void nullArray() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(null).toArray(), new ArrayList<Integer>().toArray());
    }

    @Test
    public void emptyArray() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(new ArrayList<Integer>()).toArray(),
                new ArrayList<Integer>().toArray());
    }

    @Test
    public void oneElementArray() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense
                (new ArrayList<Integer>(Arrays.asList(1))).toArray(), new ArrayList<Integer>(Arrays.asList(1)).toArray());
    }

    @Test
    public void oneNegativeElementArray() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(new ArrayList<Integer>(Arrays.asList(-1))).toArray(),
                new ArrayList<Integer>(Arrays.asList(-1)).toArray());
    }

    @Test
    public void twoElementsArray() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(new ArrayList<Integer>(Arrays.asList(1, 2))).toArray(),
                new ArrayList<Integer>(Arrays.asList(1, 2)).toArray());
    }

    @Test
    public void firstPositiveSecondNegativeArray() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(new ArrayList<Integer>(Arrays.asList(2, -5))).toArray(),
                new ArrayList<Integer>(Arrays.asList(2)).toArray());
    }

    @Test
    public void firstNegativeSecondPositiveArray() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(new ArrayList<Integer>(Arrays.asList(-5, 2))).toArray(),
                new ArrayList<Integer>(Arrays.asList(2)).toArray());
    }

    @Test
    public void bothNegativeAndEqualArray() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(new ArrayList<Integer>(Arrays.asList(-5, -5))).toArray(),
                new ArrayList<Integer>(Arrays.asList(-5)).toArray());
    }

    @Test
    public void bothNegativeAndNonEqualArray() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(new ArrayList<Integer>(Arrays.asList(-4, -7))).toArray(),
                new ArrayList<Integer>(Arrays.asList(-4)).toArray());
    }

    @Test
    public void sequenseAtTheBeggining() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(new ArrayList<Integer>(Arrays.asList(15, 3, -18, 9, -50, 17))).toArray(),
                new ArrayList<Integer>(Arrays.asList(15, 3)).toArray());
    }

    @Test
    public void sequenseAtTheEnd() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(new ArrayList<Integer>(Arrays.asList(17, -18, 90, -50, 90))).toArray(),
                new ArrayList<Integer>(Arrays.asList(90, -50, 90)).toArray());
    }

    @Test
    public void sequenseAtTheMiddle() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(new ArrayList<Integer>(Arrays.asList(13, -15, 17, -100, 3))).toArray(),
                new ArrayList<Integer>(Arrays.asList(17)).toArray());
    }

    @Test
    public void inversionLadderSequense() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(new ArrayList<Integer>(Arrays.asList(4, -5, 7, -8, 10, -11, 13))).toArray(),
                new ArrayList<Integer>(Arrays.asList(13)).toArray());

    }

    @Test
    public void theSmallestNegative() throws Exception {
        assertArrayEquals(SequenseFinder.getMaxSequense(new ArrayList<Integer>(Arrays.asList(-14, -13, -6, -5, -1, -3))).toArray(),
                new ArrayList<Integer>(Arrays.asList(-1)).toArray());
    }

    @Test
    public void bigTestForNegativeSequense() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("GeneratedNegativeSequense.txt"));
        ArrayList<Integer> temporaryList = new ArrayList<Integer>();

        String buferValue = "";
        while ((buferValue = reader.readLine()) != null)
        {
            temporaryList.add(Integer.parseInt(buferValue));
        }

        reader.close();
        assertArrayEquals(SequenseFinder.getMaxSequense(temporaryList).toArray(),
                new ArrayList<Integer>(Arrays.asList(-1)).toArray());
    }
}
