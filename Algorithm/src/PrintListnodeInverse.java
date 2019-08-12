import java.util.ArrayList;
import java.util.Stack;

/**
 * Description:
 *
 * @author:liuyong
 * @date:2019/8/10 21:52
 */

public class PrintListnodeInverse {
    static ListNode listNode;
    public static void main(String[] args) {
        initlistNode();
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList=printFromTailToHeadByStack(listNode);
        System.out.println(arrayList);
    }

    private static void initlistNode(){
        listNode=new ListNode(1);
        ListNode head=listNode;
        for(int i=2;i<10;i++){
            ListNode listNode1=new ListNode(i);
            head.next=listNode1;
            head=listNode1;
        }
    }

    //用栈实现从尾到头打印链表

    private static ArrayList<Integer> printFromTailToHeadByStack(ListNode listNode){
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> result=new ArrayList<>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        while (!stack.empty()){
            result.add(stack.pop());
        }
        return result;
    }

    //递归从尾到头打印链表
    private static ArrayList<Integer> printListNodeFromHeadToTail(ListNode listNode){
        ArrayList<Integer> result=new ArrayList<>();
        if(listNode!=null){
            result.addAll(printListNodeFromHeadToTail(listNode.next));
            result.add(listNode.val);
        }
        return result;
    }
}
