package javaChallenges.linkedListTests;

import javaChallenges.doublyLinkedList.DoublyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DoublyLinkedListTest {
  @Test public void testCreateDoublyLinkedList(){
    DoublyLinkedList test1 = new DoublyLinkedList();
    String expected1 = "class javaChallenges.doublyLinkedList.DoublyLinkedList";
    String actual1 = test1.getClass().toString();
    assertEquals("Should create a doubly Linked List: ",expected1,actual1);
  }
  @Test public void testInsert(){
    DoublyLinkedList test2 = new DoublyLinkedList();
    test2.insert(5);
    int expected2 = 5;
    int actual2 = test2.head.value;
    assertEquals("Should be able to insert a value: ", expected2,actual2);
  }
  @Test public void testIncludes(){
    DoublyLinkedList test3 = new DoublyLinkedList();
    test3.insert(4);
    test3.insert(2);
    test3.insert(3);
    test3.insert(1);
    int check = 1;
    boolean actual3 = test3.includes(check);
    assertTrue(actual3);
  }

  @Test public void testToString(){
    DoublyLinkedList test4 = new DoublyLinkedList();
    test4.insert(9);
    test4.insert(7);
    test4.insert(4);
    test4.insert(8);
    test4.insert(2);
    System.out.println(test4.toString());
  }

  @Test public void testCount(){
    DoublyLinkedList test5 = new DoublyLinkedList();
    test5.insert(23);
    test5.insert(32);
    test5.insert(54);
    test5.insert(78);
    test5.insert(53);
    test5.insert(90);
    test5.insert(13);
    test5.insert(45);
    test5.insert(75);
    test5.insert(99);
    int expected = 10;
    int actual = test5.countNodes();
    assertEquals("Should contain 10 nodes: ",expected, actual);
  }

}
