package test2;




import java.util.ArrayList;
import java.util.Stack;
 
import java.util.ArrayList;

public class test02 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode!=null){
            stack.push(listNode.val);
             listNode=listNode.next;
    }
        
        ArrayList<Integer> list=new ArrayList<Integer>();
    while(!stack.isEmpty())
    {
        list.add(stack.pop());
        
    }
        return list;
    }
    public class ListNode {  
        int val;  
        ListNode next = null;  

        ListNode(int val) {  
            this.val = val;  
        }
    }
}