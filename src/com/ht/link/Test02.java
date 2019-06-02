package com.ht.link;



class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Test02 {
    private TreeNode head=null;
    private TreeNode realHead=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)return null;
        convertLink(pRootOfTree);
        return realHead;
    }
    private void convertLink(TreeNode pRootOfTree){
        if(pRootOfTree==null)return;
        convertLink(pRootOfTree.left);

        if(head==null){
            head = pRootOfTree;
            realHead = pRootOfTree;
        }else{
            head.right = pRootOfTree;
            pRootOfTree.left = head;
            head = pRootOfTree;
        }

        convertLink(pRootOfTree.right);
    }

}
