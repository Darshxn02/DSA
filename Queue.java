public class Queue {
    int[] queue = new int[100];
    int front = -1;
    int rear = -1;

    void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        if (rear == -1) {
            front = 0;
        }
        queue[++rear] = value;
    }

    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int value = queue[front++];
        if (front > rear) {
            front = rear = -1; // reset when empty
        }
        return value;
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.display();
    }
}
