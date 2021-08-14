public class QStackTest {

  public static void main(String[] args) {
    // case 1
    QStack stack = new QStack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.pop();
    stack.pop();
    stack.pop();
    System.out.println(stack.top());
    // case 2
    QStack stack2 = new QStack();
    stack2.push(2);
    stack2.push(4);
    stack2.push(8);
    stack2.pop();
    stack2.pop();
    System.out.println(stack.isEmpty());
    // case 3
    QStack stack3 = new QStack();
    stack3.push(3);
    stack3.push(6);
    stack3.push(9);
    stack3.pop();
    System.out.println(stack3.top());
    System.out.println(stack3.isEmpty());
  }
}
