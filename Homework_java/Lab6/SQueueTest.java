public class SQueueTest {
  public static void main(String[] args) {
    // case 1
    SQueue queue = new SQueue();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    queue.remove();
    queue.remove();
    queue.remove();
    System.out.println(queue.peek());
    // case 2
    SQueue queue2 = new SQueue();
    queue2.add(2);
    queue2.add(4);
    queue2.add(8);
    queue2.remove();
    queue2.remove();
    System.out.println(queue2.isEmpty());
    // case 3
    SQueue queue3 = new SQueue();
    queue3.add(3);
    queue3.add(6);
    queue3.add(9);
    queue3.remove();
    System.out.println(queue3.peek());
    System.out.println(queue3.isEmpty());
  }
}
