// Last updated: 2/13/2026, 9:45:53 AM
import java.util.Scanner;

class node {
    char data;
    node link;
}
class stack {
    node head = null;

    void push(char value) {
        node newnode = new node();
        newnode.data = value;
        newnode.link = head;
        head = newnode;
    }
    char pop() {
        if (head == null) {
            System.out.println("underflow");
            return '#';
        } else {
            char value = head.data;
            head = head.link;
            return value;
        }
    }
    char peek() {
        if (head == null) {
            System.out.println("underflow");
            return '#';
        } else {
            return head.data;
        }
    }

    boolean isEmpty() {
        return head == null;
    }
}
public class Solution {
    public static boolean isValid(String s) {
        stack st = new stack();

        for (char a : s.toCharArray()) {
            if ((a == '(') || (a == '{') || (a == '[')) {
                st.push(a);
            } else if (a == ')') {
                if (!st.isEmpty()) {
                    if (st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (a == '}') {
                if (!st.isEmpty()) {
                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (a == ']') {
                if (!st.isEmpty()) {
                    if (st.peek() == '[') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                System.out.println("invalid");
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String str = sc.nextLine();

        if (isValid(str)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}