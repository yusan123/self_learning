package com.yu;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by Administrator on 2019/7/18.
 */
public class T1 {

    /**
     * 题目： 输入一串数据，删除重复的数据。注意：读取字符串的顺序为从右往左，如果结果是以0结束，则删除0；如果结果有负号'-' 需要保留。
     * <p>
     * 例如：输入 99876673 输出 37689 ， 输入： 0542564  output: 4652 输入： -235432 output:  -2345
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        //1.将原字符串反转
        StringBuilder sb = new StringBuilder(inputString).reverse();
        LinkedHashSet<Character> characterLinkedHashSet = new LinkedHashSet<Character>();
        char[] chars = sb.toString().toCharArray();
        //2.对反转后的字符串去重
        for (int i = 0; i < chars.length; i++) {
            characterLinkedHashSet.add(chars[i]);
        }
        final StringBuilder outputString = new StringBuilder();
        //3.对"-"进行处理
        characterLinkedHashSet.forEach(c -> {
            if(c=='-'){
                outputString.insert(0,'-');
            }else {
                outputString.append(c);
            }
        });
        //4.对末尾0进行处理
//        if(outputString.lastIndexOf("0")==outputString.length()-1){
//            outputString.deleteCharAt(outputString.length()-1);
//        }
        if(outputString.toString().endsWith("0")){
            outputString.deleteCharAt(outputString.length()-1);
        }
        System.out.println(outputString);
    }
}