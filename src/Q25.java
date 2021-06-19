import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* stack vs queue */
public class Q25 {
    public static void main(String[] args){
        Stack<Integer> stack  = new Stack<>();
        Queue<Integer> queue = new LinkedList<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack: "+stack);
        stack.push(5);
        System.out.println("Stack: "+stack);
        System.out.println("Stack Peek: "+stack.peek());
        System.out.println("Stack Pop: "+stack.pop());
        System.out.println("Stack Peek: "+stack.peek());
        System.out.println("Stack: "+stack);

        System.out.println("-------------------------------");

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("Queue: "+queue);
        queue.add(5);
        System.out.println("Queue: "+queue);
        System.out.println("Queue Peek:" +queue.peek());
        System.out.println("Queue Poll:" +queue.poll());
        System.out.println("Queue: "+queue);
    }
}
