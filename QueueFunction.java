import java.util.LinkedList;
import java.util.Queue;

public class QueueFunction {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // --- Using add() ---
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue elements after add(): " + queue);

        // Peek (front element)
        System.out.println("Front element (peek): " + queue.peek());

        // Remove (dequeue)
        System.out.println("Removed element (remove): " + queue.remove());
        System.out.println("Queue after remove(): " + queue);

        // Size and empty check
        System.out.println("Current size: " + queue.size());
        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("----------------------------------");

        // --- Using offer() and poll() ---
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);

        System.out.println("Queue after offer(): " + queue);

        System.out.println("Front element (peek): " + queue.peek());
        System.out.println("Removed element (poll): " + queue.poll());
        System.out.println("Queue after poll(): " + queue);

        // Remove all using poll()
        queue.poll();
        queue.poll();
        queue.poll(); // tries to remove from empty queue
        System.out.println("Queue after removing all (poll): " + queue);

        // Safe poll on empty queue
        System.out.println("Trying to poll empty queue: " + queue.poll());

        // Safe offer again
        queue.offer(70);
        System.out.println("Queue after offering again: " + queue);
    }
}