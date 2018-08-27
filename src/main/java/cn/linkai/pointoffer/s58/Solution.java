package cn.linkai.pointoffer.s58;

public class Solution {

    public TreeLinkNode GetNext(TreeLinkNode pNode) {

        if(pNode.right!=null){
            TreeLinkNode start=pNode.right;
            while(start.left!=null){
                start=start.left;
            }

            return start;
        }else{
            while (pNode.next!=null){
                TreeLinkNode parent=pNode.next;
                if(parent.left==pNode){
                    return parent;
                }
                pNode=pNode.next;
            }
        }

        return null;
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}