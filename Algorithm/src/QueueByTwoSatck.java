/**
 * Description:
 *用两个栈实现一个队列的入队和出队
 * @author:liuyong
 * @date:2019/8/13 0:11
 */
import java.util.Stack;
public class QueueByTwoSatck {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty())
            return -1;
        return stack2.pop();
    }

}
