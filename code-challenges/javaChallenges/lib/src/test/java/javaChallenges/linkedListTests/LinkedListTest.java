package javaChallenges.linkedListTests;

import javaChallenges.linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest{

  @Test public void createLinkedList(){
    LinkedList emptyList = new LinkedList();
    String expected0 = "class javaChallenges.linkedList.LinkedList";
    String actual0 = emptyList.getClass().toString();
    assertEquals("Should create a Linked List: ",expected0,actual0);
  }
  @Test public void testInsert(){
    LinkedList test1 = new LinkedList();
    boolean expecteda = false;
    test1.insert(1);
    boolean actualb = test1.head == null;
    assertEquals("Should return false if head is not null: ", expecteda,actualb);
    test1.insert(3);
    test1.insert(8);
    test1.insert(9);
    test1.append(6);
    int expectedA2 = 6;
    int actualB2 = test1.tail.value;
    assertEquals("Should append a value to the end: ",expectedA2,actualB2);
    System.out.println(test1.toString());
    test1.insertBefore(8,7);
    System.out.println(test1.toString());
    test1.insertAfter(3,14);
    System.out.println(test1.toString());
    test1.delete(8);
    System.out.println(test1.toString());
    test1.delete(9);
    System.out.println(test1.toString());
    test1.delete(6);
    System.out.println(test1.toString());

  }

  @Test public void testIncludes(){
    LinkedList list = new LinkedList();
    int val = 3;
    list.insert(3);
    list.insert(5);
    list.insert(4);
    list.includes(3);
    boolean expected = true;
    boolean actual = list.includes(val);
    System.out.println("Value is included: " + actual);
    assertEquals("Should return true if value is in linked list",expected,actual);

    boolean expectedc = false;
    boolean actualc = list.includes(7);
    assertEquals("Should return false if value is not in the linked list ",expectedc,actualc);
  }
  @Test public void testToString(){
    LinkedList newList = new LinkedList();
    String expected2 = "{15} -> {43} -> {24} -> {57} -> {8} -> NULL";
    newList.insert(8);
    newList.insert(57);
    newList.insert(24);
    newList.insert(43);
    newList.insert(15);
    String actual2 = newList.toString();
    System.out.println(actual2);
    assertEquals("Should return a string representation of the linked list: ",expected2,actual2);
  }

}
