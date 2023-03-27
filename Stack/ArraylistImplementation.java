
// package Stack;
import java.util.*;

//ArrayList Implementation
// class MyStack {
//     ArrayList<Integer> al = new ArrayList<>();

//     void push(int x) {
//         al.add(x);
//     }

//     int pop() {
//         int res = al.get(al.size() - 1);
//         al.remove(al.size() - 1);
//         return res;
//     }

//     int size() {
//         return al.size();
//     }

//     int peek() {
//         return al.get(al.size() - 1);
//     }

//     boolean isEmpty() {
//         return al.isEmpty();
//     }

// }

// Linked Implemantaion

class Node { // Linked list
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class MyStack { // for Stack class
    Node head;
    int sz;

    MyStack() {
        head = null;
        sz = 0;
    }

    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        sz++;
    }

    int pop() {
        if (head == null)
            return Integer.MAX_VALUE;
        int res = head.data;
        // Node temp = head;
        head = head.next;
        sz--;
        return res;
    }

    int size() {
        return sz;
    }

    int peek() {
        if (head == null)
            return Integer.MAX_VALUE;
        return head.data;
    }

    boolean isEmpty() {
        return head == null;
    }

}

public class ArraylistImplementation {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
