package cn.linkai.pointoffer.s47;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public String ReverseSentence(String str) {
        if(str==null || str.length()==0 ||str.trim().equals("")) return str;

        String[] words=str.split(" ");
        List<String> wordsList= Arrays.asList(words);
        Collections.reverse(wordsList);

        StringBuilder re=new StringBuilder(str.length());
        for(String e:wordsList){
            re.append(e);
            re.append(" ");
        }
        re.deleteCharAt(re.length()-1);
        return re.toString();
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String re = solution.ReverseSentence("student. a am I");
        System.out.println(re);
    }
}
