package leetcode.c8;

import java.math.BigDecimal;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int myAtoi(String str) {
        Pattern p=Pattern.compile("(\\s+)?(-|\\+)?\\d+.*");
        Matcher m=p.matcher(str);
        //整体满足上面的形式时就说明有可以转换的
        if(m.matches()) {
            int integer;
            //找出可以转换的
            p=Pattern.compile("(-|\\+)?\\d+");
            m=p.matcher(str);
            if(m.find()){
                try {
                    //Integer.parseInt只能转换正常样式的   -24g这种不能转换
                    integer=Integer.parseInt(m.group());
                }catch(Exception e){
                    if(m.group().charAt(0)=='-') {
                        return Integer.MIN_VALUE;
                    }else {
                        return Integer.MAX_VALUE;
                    }
                }
                //转换成功就返回结果
                return integer;
            }

        }
        //表示没有可以转换的
        return 0;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.myAtoi("20000000000000000000"));
    }
}
