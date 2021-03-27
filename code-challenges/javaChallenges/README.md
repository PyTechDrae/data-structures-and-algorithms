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
>>>>>>> 1267f791eff668bf961f03e4568204caf003dc26
