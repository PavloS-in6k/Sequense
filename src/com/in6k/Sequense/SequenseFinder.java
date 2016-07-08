package com.in6k.Sequense;

import java.util.ArrayList;

/**
 * Created by employee on 7/8/16.
 */
public class SequenseFinder {
    public static int getSum(ArrayList<Integer> subsequense)
    {
        int summ = 0;
        for (int i = 0; i < subsequense.size(); i++) {
            summ+=subsequense.get(i);
        }
        return summ;
    }

    public static ArrayList<Integer> getMaxSequense(ArrayList<Integer> fullSequense) {
        if (fullSequense==null)
            return new ArrayList<Integer>();
        if (fullSequense.size()==1)
            return fullSequense;
        ArrayList<Integer> sequense = new ArrayList<Integer>();

        int temporarySumm = Integer.MIN_VALUE;

        for (int i = 0; i < fullSequense.size(); i++) {
            for (int k = fullSequense.size(); k > i; k--)
            {
                if (getSum(new ArrayList<Integer>(fullSequense.subList(i,k)))>temporarySumm) {
                    temporarySumm = getSum(new ArrayList<Integer>(fullSequense.subList(i, k)));
                    sequense = new ArrayList<Integer>(fullSequense.subList(i, k));
                }

            }
        }

        return sequense;
    }
}
