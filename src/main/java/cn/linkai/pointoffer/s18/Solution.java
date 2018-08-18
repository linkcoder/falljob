package cn.linkai.pointoffer.s18;

public class Solution {

    /**
     * 1、首先我们的思路应该是从二叉树A的根结点开始递归遍历整棵树，每访问到一个结点，都要检查当前结点是否已经是子树的开始结点，否则传入该结点的左右孩子继续检查
     * 2、在判断当前结点是否已经是子树的开始结点时，首先判断结点值是否相等，相等的话再判断各自的左右孩子是否也对应相等（此时要注意，子树可以先为空，但二叉树A不能先为空）
     *
     * 作者：_minimal
     * 链接：https://www.jianshu.com/p/78797dbd0e17
     * 來源：简书
     * 简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。
     * @param root1
     * @param root2
     * @return
     */
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null)
            return false;
        //要么当前结点已经是子树 要么当前结点的左孩子或右孩子存在子树
        return IsSubtree(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }

    public boolean IsSubtree(TreeNode root1,TreeNode root2){
        if(root2 == null)
            return true;
        if(root1 == null)
            return false;
        if(root1.val == root2.val)
            return IsSubtree(root1.left,root2.left) && IsSubtree(root1.right,root2.right);
        else
            return false;
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