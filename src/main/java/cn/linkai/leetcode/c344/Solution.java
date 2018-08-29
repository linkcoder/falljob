package cn.linkai.leetcode.c344;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public String reverseString(String s) {
        char[] chars=s.toCharArray();

        List<Character> characters=new ArrayList<>();
        for(char e:chars){
            characters.add(e);
        }

        Collections.reverse(characters);
        int i=0;
        for(char e:characters){
            chars[i++]=e;
        }
        return new String(chars);
    }
}
