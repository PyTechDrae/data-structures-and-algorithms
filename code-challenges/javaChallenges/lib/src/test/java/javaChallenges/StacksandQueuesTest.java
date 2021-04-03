package javaChallenges;

import javaChallenges.stacksandqueues.Node;
import javaChallenges.stacksandqueues.Stack;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StacksandQueuesTest {

  @Test public void testCreateStack() {

    Stack<Object> newStack = new Stack<>();
    newStack.push(false);
    newStack.push("dog");
    newStack.push(25);
    int expected = 25;
    Node<Object> actualNode = newStack.top;
    assertEquals("Top of stack should be 25", expected, actualNode.value);
  }
  @Test public void testPop() {
    Stack<Object> newStack = new Stack<>();
    newStack.push(false);
    newStack.push("dog");
    newStack.push(25);
    newStack.pop();
    newStack.pop();
    boolean expectedBool = false;
    Node<Object> actualBool = newStack.top;
    assertEquals("After popping twice, top should be false", expectedBool, actualBool.value);
  }
  @Test public void testPeek() {
    Stack<Object> newStack = new Stack<>();
    newStack.push(false);
    newStack.push(false);
    newStack.push(true);
    boolean expectedPeek = true;
    Object actualPeek = newStack.peek();
    assertEquals("Peeking should return the top value: true", expectedPeek, actualPeek);
  }
  @Test public void testIsEmpty(){
    Stack<Object> newStack = new Stack<>();
    newStack.push(false);
    newStack.push("dog");
    newStack.push(25);
    newStack.pop();
    newStack.pop();
    newStack.pop();
    boolean expectedEmpty = true;
    Object actualEmpty = newStack.isEmpty();
    assertEquals("Should return true if empty",expectedEmpty,actualEmpty);

  }

  @Test public void testExceptionOnEmpty(){
    Stack<Object> newStack = new Stack<>();
    newStack.push(false);
    newStack.push("dog");
    newStack.push(25);
    newStack.pop();
    newStack.pop();
    newStack.pop();
    assertThrows(EmptyStackException.class, newStack::pop);
  }
}
