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
