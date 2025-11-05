class stack {
    int[] stack = new int[100];
    int top = -1;

    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1; // return a sentinel value
        }
        return stack[top--];
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.display();
    }
}