package com.yunsi.work;

public class StringWork {
    public static void main(String[] args) {
       /* StringBuilder str1=new StringBuilder("abcde");
        fanzhuan(str1);*/

        String str2="a,b,c,d,e,f";
        String[] s = str2.split(",");
        System.out.println(str2);
        for (String s1 : s) {
            System.out.print(s1);
        }
    }

    public static void fanzhuan(StringBuilder str1){
        System.out.println(str1.reverse());
    }
}
