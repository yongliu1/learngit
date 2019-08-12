/**
 * Description:
 *查找一颗二叉树的下一个子节点
 * @author:liuyong
 * @date:2019/8/13 0:02
 */
public class NextTreeNode {

    class TreeLinkNode{
        int val;
        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode parent;
        TreeLinkNode(int val){
            this.val=val;
        }
    }
    public TreeLinkNode solution(TreeLinkNode pNode){
        if(pNode.right!=null){
            while(pNode.left!=null){
                pNode=pNode.left;
            }
            return pNode;
        }
        else {
            while(pNode.parent!=null){
                TreeLinkNode parent=pNode.parent;
                if(parent.left==pNode)
                    return parent;
                pNode=pNode.parent;
            }
        }
        return null;
    }

}
