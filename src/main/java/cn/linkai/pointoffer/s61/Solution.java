package cn.linkai.pointoffer.s61;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();

        if(pRoot==null) return res;

        Queue<TreeNode> queue=new LinkedList<>();

        queue.offer(pRoot);
        while(!queue.isEmpty()){

            int cnt=queue.size();
            ArrayList<Integer> re=new ArrayList<>();
            while(cnt-->0){
                TreeNode node=queue.poll();
                re.add(node.val);

                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            if(!re.isEmpty()) res.add(re);
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