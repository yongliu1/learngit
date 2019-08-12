import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author:liuyong
 * @date:2019/8/10 22:37
 */
public class ReConstructBinaryTree {
    private static Map<Integer,Integer> indexForInOrders=new HashMap<>();
    public static void main(String[] args) {
        int[] preOrder={1,2,4,7,3,5,6,8};
        int[] inOrder={4,7,2,1,5,3,8,6};
        for(int i=0;i<inOrder.length;i++){
            indexForInOrders.put(inOrder[i],i);
        }
        TreeNode root=reConstruct(preOrder,inOrder);
    }

    private static   TreeNode reConstruct(int[] pre,int[] in){
        return reConstruct(pre,0,pre.length-1,0,in.length-1);
    }

    private static TreeNode reConstruct(int[] pres,int preStart,int preEnd,int inStart,int inEnd){
        if(preStart>preEnd||inStart>inEnd)
            return null;
        TreeNode root=new TreeNode(pres[preStart]);
        int index=indexForInOrders.get(root.val);
        int LeftTreeSize=index-inStart;
        root.left=reConstruct(pres,preStart+1,preStart+LeftTreeSize,inStart,index-1);
        root.right=reConstruct(pres,preStart+LeftTreeSize+1,preEnd,index+1,inEnd);
        return root;
    }
}
