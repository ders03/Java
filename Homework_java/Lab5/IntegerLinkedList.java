public class IntegerLinkedList {

  private IntegerNode head;

  public boolean isEmpty() {
    return head == null;
  }

  public static void main(String[] args) {
    IntegerLinkedList list = new IntegerLinkedList();
    //list.insertFront(3);
    //list.insertFront(2);
    //list.insertFront(1);
    //list.insertFront(0);
    //list.insertFront(3);
    list.insertFront(2);
    //list.insertBack(3);
    list.print();
    //System.out.println(list.get(1));
    //list.removeBack();
    //list.removeFront();
    list.removeAt(0);
    list.print();
  }

  public void insertFront(int val) {
    IntegerNode node = new IntegerNode(val);
    node.setNext(head);
    head = node;
  }

  public void insertBack(int val) {
    IntegerNode node = new IntegerNode(val);
    if (isEmpty()) {
      head = node;
    }
    else {
      IntegerNode cur = head;
      while (cur.getNext() != null) {
        cur = cur.getNext();
      }
      cur.setNext(node);
    }
  }

  public void print() {
    IntegerNode cur = head;
    while (cur != null) {
      System.out.printf("%d", cur.getValue());
      cur = cur.getNext();
    }
    System.out.println();
  }

  public int get(int index) {
    IntegerNode cur = head;
    if (isEmpty()) {
      System.out.println("IndexOutOfBounds");
      return -1;
    }
    else {
      for (int i = 0; i < index; i++) {
        if (cur == null) {
          System.out.println("IndexOutOfBounds");
          return -1;
        }
        cur = cur.getNext();
      }
    }
    return cur.getValue();
  }

  public void removeFront() {
    if (!isEmpty()) {
      head = head.getNext();
    }
  }

  public void removeBack() {
    IntegerNode cur = new IntegerNode();
    IntegerNode next = new IntegerNode();
    if (!isEmpty()) {
      if (head.getNext() == null) {
        head = null;
      }
      else {
        next = head;
        while (next.getNext() != null) {
          cur = next;
          next = next.getNext();
          }
          cur.setNext(null);
        }
      }
    }

    /*
    base case is 1 element in list, already have a function for this, just call it
    need to keep track of 3 nodes in list
      initiate current pos
      initiate next pos
      for loop as counter for node position
        initiate previous pos
        iterate current pos
        iterate next pos
      at end of pos counter loop, variables have been set to want or exception thrown
      setNext() to proper nodes(previous to next, current null)
    */
    public void removeAt(int index) {
      IntegerNode previous = new IntegerNode();
      IntegerNode replace = new IntegerNode();
      IntegerNode next = new IntegerNode();
      if (index == 0 && !isEmpty()) {
        removeFront();
      }
      else {
        try {
          replace = head;
          next = head.getNext();
          for (int i = 0; i < index; i ++) {
            previous = replace;
            replace = next;
            next = next.getNext();
          }
          previous.setNext(next);
          replace.setNext(null);
        }
        catch (Exception e) {
          System.out.println("IndexOutOfBounds");
        }
      }
    }

}
