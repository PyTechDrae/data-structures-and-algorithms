# ArrayShift
# Challenge Summary
Insert and shift an array in middle at index

## Challenge Description
Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of
the built-in methods available to your language, return an array with the new value added at the middle index.

## Approach & Efficiency
Begin by cloning the input array and increasing its size by 1. Then proceed to find the middle index by dividing the
length of the input array by 2.Since the type of variable for the middle index is `int` there is not need to round.
At this point iterate through the cloned array setting each value to the corresponding value from the input array until
reaching the middle index. Once the middle index is reached,set that value as the input number. To avoid receiving an
out of bounds error, subtract 1 from the remaining indexes by 1 and continue to set the corresponding values.

## Solution
![WhiteBoard](assets/ArrayShift.jpg)

# Linked List Implementation

Perform a Linked List implementation.

## Challenge Description
Create a `Node` class that has properties for the value stored in the `Node`, and a pointer to the next Node.
Within your `LinkedList` class, `include` a `head` property. Upon instantiation, an empty Linked List should be created.
Define a method called insert which takes any value as an argument and adds a new node with that value to the head
of the list with an `O(1)` Time performance. Define a method called includes which takes any value as an argument and
returns a `boolean` result depending on whether that value exists as a Node’s value somewhere within the list.
Define a method called toString  which takes in no arguments and returns a string representing
all the values in the Linked List, formatted as:

## Approach & Efficiency

- **Insert** : takes any value as an argument and adds a new node with the value to the head of the list wih an O
  (1) Time performance
- **Includes** : takes any value as an argument and returns a boolean result depending on whether that value exists
  as a Node's value somewhere within the list
- **ToString** : takes in no arguments and returns a string representing all the values in the Linked List



=======
# Binary Search

# Challenge Description
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing
any of the built-in methods available to your language, return the index of the array’s element that is equal to the
search key, or -1 if the element does not exist.

## Approach & Efficiency
Begin by declaring 3 variables of type int: left, right, and middle. Left represents the first index of the input array
(set to 0). Right represents the last index of the array (length - 1) and middle represents the middle index of
the array (right divided by 2). Iterate while the left index is smaller than the right. On each iteration compare the
value at the middle index with the target value. If the target is smaller than the middle, set the right index to the middle.
If the target is bigger set the left index to middle. If the target is the same as middle simply return middle index.

## Solution
![WhiteBoard](assets/array-binary-search.jpg)

# Linked List Insertions

## Challenge Description
Write the following methods for the Linked List class:

`.append(value)` which adds a new node with the given value to the end of the list
`.insertBefore(value, newVal)` which add a new node with the given newValue immediately before the first value node
`.insertAfter(value, newVal)` which add a new node with the given newValue immediately after the first value node
`.delete(value)` which removes a node with the given value.

## Approach & Efficiency
*Append:* Begin by declaring a new Node value and set the tail.next to the newNode. Then set the
newNode as the current tail.

*InsertBefore*: Declare a newNode and set its next node to the current heads next node.Then set
the current head's next node to the newNode. Consider edge case in case the node is the current
head or tail. If it is the head, set the newNode to be the current head (using insert) and it's
next to the
previous head.

*Insert After*: Compare the targetValue to the values of the current head and tail. If it is the
head
set the head's pointer to the newNode and the heads previous pointer to the pointer of the new
node. If the targetValue matches with the tail, set the current tail to be the newValue.

*Delete*: If target value is either the head or tail, set the current heads pointer to null or set
the tail's previous to null. If any other value matches the target set the pointer of the
previous Node to be the original next of the target. Set the targets pointer to null;

![WhiteBoard](assets/linkedListp2.png)

## Challenge Description
Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s
value that is k from the end of the linked list. You have access to the Node class and all the
properties on the Linked List class as well as the methods created in previous challenges.

## Challenge Description
Write a function called `zipLists` which takes two linked lists as arguments. Zip the two linked
lists
together into one so that the nodes alternate between the two lists and return a reference to
the head of the zipped list.
## Approach & Efficiency
I decided to use the recursive method manipulating two temporary variables representing the next
Node within each list to be zipped together. At each iteration we set the current node A and
node B to temporaty variables and reassign their pointers as necessary.

## Solution
![WhiteBoard](assets/zipList.png)
