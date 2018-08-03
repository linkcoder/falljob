package cn.linkai.leetcode.c71;

import java.util.Stack;

public class Solution {

    public static String[] flag={"..","."};

    public String simplifyPath(String path) {
        Stack<String> paths=new Stack<>();
        String[] split_path=path.split("/");
        String tmp;
        for(String e:split_path){
            tmp=e.trim();
            if(!tmp.equals("")){
                if(tmp.equals("..")){
                    if(!paths.isEmpty()) paths.pop();
                }else if (tmp.equals(".")){
                    continue;
                }else{
                    paths.push(tmp);
                }
            }
        }

        StringBuilder builder=new StringBuilder();
        for(String e:paths){
            builder.append("/"+e);
        }

        return builder.toString().equals("")?"/":builder.toString();
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.simplifyPath("/.."));
    }
}
