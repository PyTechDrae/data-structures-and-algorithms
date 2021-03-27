package javaChallenges.linkedList;

public class LinkedList{
    public Node head;
    public Node tail;

  public LinkedList(){
    this.head = null;
    this.tail = null;
  }
  public void insert(int value){
    //takes any value as an argument and adds
    // a new node with the value to the head of the list wih an O(1) Time performance
    Node newNode = new Node(value);
    newNode.next = this.head;
    this.head = newNode;
    if(this.tail == null) this.tail = newNode;
  }
  public boolean includes(int value){
    //takes any value as an argument and returns a boolean result depending
    //on whether that value exists as a Node's value somewhere within the list
    Node current = this.head;
    while(current != null){
      if(current.value == value)
      {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public String toString(){
    //takes in no arguments and returns a string representing all the values
    // in the Linked List
    return this._toString(this.head);
  }

  public String _toString(Node currentNode){
    if(currentNode == null)return "NULL";
    return "{" + currentNode.value + "} -> " + this._toString(currentNode.next);
  }

  public int countNodes(){
    //count all the nodes of a linked list
    Node currentNode = this.head;
    int count = 0;
    while(currentNode != null){
      currentNode = currentNode.next;
      count++;
    }
    return count;
  }
}
