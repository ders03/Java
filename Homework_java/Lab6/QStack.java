import java.util.LinkedList;
import java.util.Queue;

public class QStack {

  private Queue<Integer> que = new LinkedList<Integer>();

  public void push(int x) {
    Queue<Integer> temp = new LinkedList<Integer>();
    while (!que.isEmpty()) {
      temp.add(que.remove());
    }
    que.add(x);
    while (!temp.isEmpty()) {
      que.add(temp.remove());
      if (temp.isEmpty()) {
        break;
      }
    }
  }

  public int pop() {
    if (!que.isEmpty()) {
      return que.remove();
    }
    return -1;
  }

  public int top() {
    int temp = -1;
    if (!que.isEmpty()) {
      temp = que.peek();
    }
    return temp;
  }

  public int size() {
    return que.size();
  }

  public boolean isEmpty() {
    return que.isEmpty();
  }
}
