class Stack {
    private static final int Max = 100;
    private int[] arr;
    private int top;

    public Stack() {
        arr = new int[Max];
        top = -1;
    }

    public void push(int value) {
        if (top >= Max - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    public boolean isEmpty() {
        return top < 0;
    }
}

public class Stackoperation {
    public static void main(String[] args) {
        Stack stack = new Stack();

        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Top element of stack: " + stack.peek());
        System.out.println("Popped element of stack: " + stack.pop());
    }
}
