package cn.linkai.pointoffer.s25;

import java.util.ArrayList;

public class Solution {

    private ArrayList<ArrayList<Integer>> result=new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        findPath(root,target,new ArrayList<>());
        return result;
    }

    public void findPath(TreeNode node,int target,ArrayList<Integer> path){
        if(node==null) return;

        target-=node.val;
        path.add(node.val);
        if(target==0 && node.left==null && node.right==null){
            result.add(new ArrayList<>(path));
        }else{
            findPath(node.left,target,path);
            findPath(node.right,target,path);
        }

        path.remove(path.size()-1);
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
