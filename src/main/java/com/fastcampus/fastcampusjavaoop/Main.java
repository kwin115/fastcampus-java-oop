package com.fastcampus.fastcampusjavaoop;
import com.fastcampus.fastcampusjavaoop.logic.Bublesort;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Bublesort<String> sort = new Bublesort<>();

        System.out.println("result :" + sort.sort(Arrays.asList(args)));
    }
}
