package cn.linkai.pointoffer.s62;

public class Solution {
    private String deserializeStr;

    String Serialize(TreeNode root) {
        if(root==null)
            return "#";
        return root.val+" "+Serialize(root.left)+" "+Serialize(root.right);
    }
    TreeNode Deserialize(String str) {
        deserializeStr=str;
        return Deserialize();
    }

    private TreeNode Deserialize() {
        if(deserializeStr.length()==0) return null;

        int index=deserializeStr.indexOf(" ");
        String node = index == -1 ? deserializeStr : deserializeStr.substring(0, index);
        deserializeStr = index == -1 ? "" : deserializeStr.substring(index + 1);
        if(node.equals("#")){
            return null;
        }
        TreeNode tree=new TreeNode(Integer.valueOf(node));
        tree.left=Deserialize();
        tree.right=Deserialize();

        return tree;
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