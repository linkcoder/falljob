package leetcode.c17;

import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    static String[] keys={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    static StringBuilder builder=new StringBuilder();

    public List<String> letterCombinations(String digits) {
        List<String> ans= new ArrayList<>();

        if(digits!=null && digits.length()>0){
            huishuo(0,ans,digits);
        }

        return ans;
    }

    private void huishuo(int index,List<String> list,String digits){
        if (index == digits.length()) {
            list.add(builder.toString());
            return;
        }
        for (int i = 0; i < keys[digits.charAt(index)-'0'].length(); i++) {
            builder.append(keys[digits.charAt(index)-'0'].charAt(i));
            huishuo(index + 1, list,digits);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.letterCombinations("23"));
    }
}
