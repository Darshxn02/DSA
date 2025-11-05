import java.util.Stack;

public class StacksFunction {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack elements: " + stack);

        System.out.println("Is stack empty? " + stack.empty());
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Position of element 10 (from top): " + stack.search(10));
        System.out.println("Size of stack: " + stack.size());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
