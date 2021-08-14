import java.util.Stack;

public class SQueue {

  private Stack<Integer> stack = new Stack<Integer>();

  public void add(int x) {
    Stack<Integer> temp = new Stack<Integer>();
    while (!stack.isEmpty()) {
      temp.push(stack.pop());
    }
    stack.push(x);
    while (!temp.isEmpty()) {
      stack.push(temp.pop());
    }
  }

  public int remove() {
    if (!stack.isEmpty()) {
      return stack.pop();
    }
    return -1;
  }

  public int peek() {
    if (!stack.isEmpty()) {
      return stack.pop();
    }
    return -1;
  }

  public int size() {
    return stack.size();
  }

  public boolean isEmpty() {
    if (stack.size() == 0) {
      return true;
    }
    return false;
  }

}
