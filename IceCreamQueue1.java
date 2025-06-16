package pallavi;
import java.util.LinkedList;
import java.util.Queue;

public class IceCreamQueue1  {
    public static void main(String[] args) {
        // Create a queue to hold the kids
        Queue<String> iceCreamQueue = new LinkedList<>();

        // Add 5 kids to the queue
        String[] kids = {"Kid1", "Kid2", "Kid3", "Kid4", "Kid5"};
        for (String kid : kids) {
            iceCreamQueue.add(kid);
        }

        // Show which kid is first
        System.out.println("First kid in the queue: " + iceCreamQueue.peek());

        // Remove the first kid after serving
        System.out.println("Serving: " + iceCreamQueue.poll());
        System.out.println("Queue after serving: " + iceCreamQueue);

        // Add a new kid at the end
        iceCreamQueue.add("Kid6");
        System.out.println("Queue after adding new kid: " + iceCreamQueue);
    }
}