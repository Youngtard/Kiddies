package com.youngtard.cla;

import android.util.SparseArray;

import java.util.HashMap;
import java.util.Map;

public class Numbers {



    //    public static final SparseArray<String> NUMBERS;
//    public static final HashMap<String, Integer> NUMBERS;

//    private static final int one = R.raw.one;
//    private static final int two = R.raw.one;
//    private static final int three = R.raw.one;
//    private static final int four = R.raw.one;
//    private static final int five = R.raw.one;
//    private static final int six = R.raw.one;
//    private static final int seven = R.raw.one;
//    private static final int eight = R.raw.one;
//    private static final int nine = R.raw.one;
//    private static final int ten = R.raw.one;
//    private static final int eleven = R.raw.one;
//    private static final int twelve = R.raw.one;
//    private static final int thirteen = R.raw.one;
//    private static final int fourteen = R.raw.one;
//    private static final int fifteen = R.raw.one;
//    private static final int sixteen = R.raw.one;
//    private static final int seventeen = R.raw.one;
//    private static final int eighteen = R.raw.one;
//    private static final int nineteen = R.raw.one;
//    private static final int twenty = R.raw.one;

    private String word;
    private int res;

    Numbers(String word, int res) {
        this.word = word;
        this.res = res;
    }


//    static {
//        NUMBERS = new SparseArray<>(20);
//        NUMBERS.append(1, "one");
//        NUMBERS.append(2, "two");
//        NUMBERS.append(3, "three");
//        NUMBERS.append(4, "four");
//        NUMBERS.append(5, "five");
//        NUMBERS.append(6, "six");
//        NUMBERS.append(7, "seven");
//        NUMBERS.append(8, "eight");
//        NUMBERS.append(9, "nine");
//        NUMBERS.append(10, "ten");
//        NUMBERS.append(11, "eleven");
//        NUMBERS.append(12, "twelve");
//        NUMBERS.append(13, "thirteen");
//        NUMBERS.append(14, "fourteen");
//        NUMBERS.append(15, "fifteen");
//        NUMBERS.append(16, "sixteen");
//        NUMBERS.append(17, "seventeen");
//        NUMBERS.append(18, "eighteen");
//        NUMBERS.append(19, "nineteen");
//        NUMBERS.append(20, "twenty");
//
//    }

//    static {
//        NUMBERS = new HashMap<>(20);
//        NUMBERS.put("one",one);
//        NUMBERS.put("two", two);
//        NUMBERS.put("three", three);
//        NUMBERS.put("four", four);
//        NUMBERS.put("five", five);
//        NUMBERS.put("six", six);
//        NUMBERS.put("seven", seven);
//        NUMBERS.put("eight", eight);
//        NUMBERS.put("nine", nine);
//        NUMBERS.put("ten", ten);
//        NUMBERS.put("eleven", eleven);
//        NUMBERS.put("twelve", twelve);
//        NUMBERS.put("thirteen", thirteen);
//        NUMBERS.put("fourteen", fourteen);
//        NUMBERS.put("fifteen", fifteen);
//        NUMBERS.put("sixteen", sixteen);
//        NUMBERS.put("seventeen", seventeen);
//        NUMBERS.put("eighteen", eighteen);
//        NUMBERS.put("nineteen", nineteen);
//        NUMBERS.put("twenty", twenty);
//
//    }

    public String getWord() {
        return word;
    }

    public int getRes() {
        return res;
    }



}
