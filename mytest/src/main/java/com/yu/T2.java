package com.yu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2019/7/18.
 */
public class T2 {

    public static void main(String[] args) {
        String[] arr = {"112","bbbaa","dcddd"};
        for (String s : arr) {
            System.out.println(s);
        }
        List<String> strings = Arrays.asList(arr);
        System.out.println(strings);

        String str = "aaaaaaaabbbbb";
        char[] chars = str.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();
        for (char aChar : chars) {
            characters.add(aChar);
        }

    }
}
