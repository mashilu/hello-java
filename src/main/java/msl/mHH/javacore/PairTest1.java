package msl.mHH.javacore;


import msl.mHH.javacore.util.Pair;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Administrator on 2018/2/23 0023.
 */
public class PairTest1 {

    public static void main(String[] args) {
        // Pair<String>
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

//        // Pair<T>
//        GregorianCalendar[] birthdays = {
//                new GregorianCalendar(1906, Calendar.DECEMBER, 9),
//                new GregorianCalendar(1815, Calendar.DECEMBER, 10),
//                new GregorianCalendar(1903, Calendar.AUGUST, 3),
//                new GregorianCalendar(1910, Calendar.JUNE, 22)
//        };
//        Pair<GregorianCalendar> mm1 = ArrayAlg.minmaxT(birthdays);
//        System.out.println("min = " + mm1.getFirst().getTime());
//        System.out.println("max = " + mm1.getSecond().getTime());
    }
}

class ArrayAlg {

    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0)
            return null;
        String min = a[0];
        String max = a[0];

        for (String str : a) {
            if (min.compareTo(str) > 0)
                min = str;
            if (max.compareTo(str) < 0)
                max = str;
        }

        return new Pair<>(min, max);
    }

//    public static <T extends Comparable> Pair<T> minmaxT(T[] a) {
//        if (a == null || a.length == 0)
//            return null;
//        T min = a[0];
//        T max = a[1];
//
//        for (T t : a) {
//            if (min.compareTo(t) > 0)
//                min = t;
//            if (max.compareTo(t) < 0)
//                max = t;
//        }
//
//        return new Pair<>(min, max);
//    }
}