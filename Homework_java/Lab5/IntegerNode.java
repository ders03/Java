public class IntegerNode {
  private int value;
  private IntegerNode next;
  public IntegerNode() {
  }

  public IntegerNode(int val) {
    this.value = val;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int val) {
    this.value = val;
  }

  public IntegerNode getNext() {
    return next;
  }

  public void setNext(IntegerNode n) {
    this.next = n;
  }

}
