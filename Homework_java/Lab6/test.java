import java.util.Queue;
import java.util.LinkedList;

public class Test {

  private Queue<Integer> que = new LinkedList<Integer>();

  public static void main(String[] args) {
    Test t = new Test();
    t.push(1);
    System.out.println(t.pop());
    //System.out.println(t.top());
  }

  public void push(int x) {
    que.add(x);
  }

  public int pop() {
    if (!que.isEmpty()) {
      return que.remove();
    }
    return -1;
  }

  public int top() {
    if (!que.isEmpty()) {
      return que.peek();
    }
    return -1;
  }

  public int size() {
    return que.size();
  }

  public boolean isEmpty() {
    return que.isEmpty();
  }
}
