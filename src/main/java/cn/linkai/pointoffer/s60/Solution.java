package cn.linkai.pointoffer.s60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(pRoot==null) return res;

        boolean reverse=false;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(pRoot);
        while(!queue.isEmpty()){

            ArrayList<Integer> re=new ArrayList<>();
            int cnt=queue.size();
            while(cnt-->0){
                TreeNode node = queue.poll();
                re.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }

            if(reverse)
                Collections.reverse(re);

            if(re.size()!=0)
                res.add(re);

            reverse=!reverse;
        }
        return res;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}