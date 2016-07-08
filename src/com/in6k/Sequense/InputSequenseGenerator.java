package com.in6k.Sequense;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by employee on 7/8/16.
 */
public class InputSequenseGenerator {

    public static void generateNegativeSequense(int bound) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("GeneratedNegativeSequense.txt", "UTF-8");
        writer.print(-bound);
        for (int i = -bound; i < 0; i++) {
            writer.print("\n" + i);
        }
        writer.println("");
        writer.close();
    }

    public static void generateSequense(int bound) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("GeneratedSequense.txt", "UTF-8");
        writer.print(bound);
        for (int i = bound; i > 0; i--) {
            writer.print("\n" + i);
        }
        writer.println("");
        writer.close();
    }

    public static void generateLadderSequense(int bound) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("GeneratedLadderSequense.txt", "UTF-8");
        writer.print(-bound/2);
        for (int i = -bound/2; i < bound/2; i++) {
            writer.print("\n" + i);
        }
        writer.println("");
        writer.close();
    }




    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        generateNegativeSequense(10000);
        generateLadderSequense(10000);
        generateSequense(10000);

    }
}