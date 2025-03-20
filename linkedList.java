
public class linkedList {
  // Creating Node
  public static class Node {
    int info;
    Node Next;

    // Node Constructor.
    public Node(int ele) {
      this.info = ele;
      this.Next = null;
    }
  }

  // implementing the linked list
  public static class MyLinkedList {

    // Aligning the properties of the linked list
    Node head;
    int length;

    // Creating the constructor for my linked list
    // Non prameterized constructor
    public MyLinkedList() {
      this.head = null;
      this.length = 0;
    }

    // Writing the desired methods for my linked list.

    // 1. get() method
    public int get(int index) {

      // checking the base cases:
      if (index < 0 || index > this.length) {
        System.out.println("Invalid Index!");
        return -1;
      }

      // Assigning the current as curr i.e. first element of the Linked List
      Node curr = this.head;

      // Looping Through the Linked List till we got the desired index
      for (int i = 0; i < index; i++) {
        curr = curr.Next;
      }

      // return the info/data part of the linked which is our desired element of the
      // linked list at the given index.
      return curr.info;
    }

    // 2. addAtHead() method
    public void addAtHead(int ele) {

      Node newHead = new Node(ele);

      newHead.Next = this.head;
      this.head = newHead;

      this.length += 1;
    }

    // 3. addAttail() method
    public void addAttail(int ele) {
      Node newNode = new Node(ele);

      // Base case Dealing with the situatin when the head is null (i.e. curr =
      // this.head is null).
      if (this.length == 0) {
        // this.head = newNode;
        // this.length += 1;
        // OR
        addAtHead(ele);
        return;
      }

      // The code written below will work for the linked list having at least one
      // element .
      // iterate to end of LL
      Node curr = this.head;
      while (curr.Next != null) {
        curr = curr.Next;
      }

      // adding newNode to the current's(curr) next.
      curr.Next = newNode;

      // updating the length of LL
      this.length += 1;
      return;
    }

    // 4. addAtIndex() method
    public void addAtIndex(int index, int ele) {

      // [ NOTE :- To add a node at an index we will have to reach at one place before
      // that index. ]

      // Base case : 1 for invalid index.
      if (index < 0 || index >= this.length) {
        System.out.println("Invalid Index!");
        return;
      }

      // Base case : 2 if index is 0.
      if (index == 0) {
        addAtHead(ele);
        return;
      }

      Node newNode = new Node(ele);

      Node curr = this.head;

      for (int i = 0; i < index - 1; i++) {
        curr = curr.Next;
      }

      newNode.Next = curr.Next;
      curr.Next = newNode;

      this.length += 1;
      return;
    }

    // 5. deleteAtHead() method .
    public void deleteAtHead() {

      // To store the linked list except the head part.
      Node headNextNode = this.head.Next;

      // Making the head's next node as the new head of the remaining linked list.
      this.head = headNextNode;

      // decrementing the length of the linked list by 1 .
      this.length -= 1;

      return;
    }

    // 6. deleteAtIndex() .
    public void deleteAtIndex(int index) {

      // Case of invalid index
      if (index < 0 || index >= this.length) {
        System.out.println("Invalid Index!");
        return;
      }

      // Case when index is 0.

      if (index == 0) {
        deleteAtHead();
        return;
      }

      Node curr = this.head;
      for (int i = 0; i < index - 1; i++) {
        curr = curr.Next;
      }

      // linking and delinking
      curr.Next = curr.Next.Next;
      this.length -= 1;

      return;
    }

    // 7. Linked list display() method

    public void display() {
      Node curr = this.head;

      for (int i = 0; i < this.length; i++) {
        System.out.print(curr.info + " -> ");
        curr = curr.Next;
      }

      System.err.print("null");
    }
  }

  public static void main(String[] args) {

    MyLinkedList l = new MyLinkedList();
    l.addAtHead(34);
    l.addAttail(56);
    l.addAtIndex(2, 74);
    l.display();
  }
}
