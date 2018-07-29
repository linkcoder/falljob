package cn.linkai.leetcode.c20;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> kuohaos=new Stack<>();

        if(s!=null && s.length()%2==0){

            for (int i=0;i<s.length();i++){
                char c=s.charAt(i);
                switch (c){
                    case '(':{
                        kuohaos.push(c);
                        break;
                    }
                    case ')':{
                        if(kuohaos.contains('(') && kuohaos.peek()=='('){
                            kuohaos.pop();
                        }else{
                            return false;
                        }
                        break;
                    }
                    case '[':{
                        kuohaos.push(c);
                        break;
                    }
                    case ']':{
                        if(kuohaos.contains('[') && kuohaos.peek()=='['){
                            kuohaos.pop();
                        }else{
                            return false;
                        }
                        break;
                    }
                    case '{':{
                        kuohaos.push(c);
                        break;
                    }
                    case '}':{
                        if(kuohaos.contains('{') && kuohaos.peek()=='{'){
                            kuohaos.pop();
                        }else{
                            return false;
                        }
                        break;
                    }
                }

            }
            return kuohaos.size()==0?true:false;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.isValid("({][])]]]){)[)}]]]}])]{}("));
    }
}
