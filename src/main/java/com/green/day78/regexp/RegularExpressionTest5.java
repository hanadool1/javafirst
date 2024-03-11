package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest4 {
    public static void main(String[] args) {
        String str1 = "abc@naver.com";
        String str2 = "abc@naver.co.kr";
        String str3 = "히힝1";
        String str4 = "2ㅣㅐ21";
        String str5 = "1하           ㄱ하1";

//        String regexp = "^[a-z|A-Z|0-9]+@[a-z|A-Z|0-9]{3,}\\.[a-z]+$";
//        String regexp = "^[0-9a-zA-Z]([-_￦.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_￦.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";
        String regexp = "t^[a-zA-Z0-9]+@([a-zA-Z0-9]{3,}\\.[a-z]{2,}|[a-zA-Z0-9]{3,}\\.[a-z]{2,}\\.[a-z]{2,})$";

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp,str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp,str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp,str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp,str4));
        System.out.printf("%s > %b\n", str5, Pattern.matches(regexp,str5));


    }
}
