package leetcode.c22;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    static Stack<Character> kuoStack=new Stack<>();
    static StringBuilder builder=new StringBuilder();
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        if(n!=0){
            huishuo(0,n,n,n,result);
        }
        return result;
    }

    private void huishuo(int index, int n, int l, int r, List<String> list){
        if(index==2*n){
            if(isGood(builder)){
                list.add(builder.toString());
            }
            kuoStack.clear();
            return;
        }

        if(l>0){
            builder.append('(');
            huishuo(index+1,n,l-1,r,list);
            builder.deleteCharAt(builder.length()-1);
        }
        if(r>0){
            builder.append(')');
            huishuo(index+1,n,l,r-1,list);
            builder.deleteCharAt(builder.length()-1);
        }

    }

    private boolean isGood(StringBuilder builder){
        char f=builder.charAt(0);
        if(f==')') return false;
        f=')';
        kuoStack.push(builder.charAt(0));
        for(int i=1;i<builder.length();i++){
            if(kuoStack.size()>0){
                if(builder.charAt(i)==f){
                    kuoStack.pop();
                }else{
                    kuoStack.push(builder.charAt(i));
                }
            }else{
                if(builder.charAt(i)==f)
                    return false;
                else kuoStack.push(builder.charAt(i));
            }
        }
        if(kuoStack.size()==0) return true;
        else return false;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.generateParenthesis(3));
    }
}
