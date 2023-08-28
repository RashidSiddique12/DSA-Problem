import java.util.*;

public class ImplementStackUsingQueues {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static void push(int x) {

        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        q1.offer(x);
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }

    }

    public static int pop() {
        if (q1.isEmpty())
            return -1;
        return q1.poll();
    }

    public static int top() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    public static boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        int res1 = top();
        System.out.println(res1);
        pop();
        pop();
        int res2 = top();
        System.out.println(res2);
        pop();
        boolean res3 = empty();
        System.out.println(res3);
        pop();
        pop();
        boolean res4 = empty();
        System.out.println(res4);

    }
}
