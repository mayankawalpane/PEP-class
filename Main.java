class Stack {
    int max = 5;
    int[] stack = new int[max];
    int top = -1;

    void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + stack[top--]);
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top Element: " + stack[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}