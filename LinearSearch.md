# Linear Search

## What is Linear Search?

Linear Search is a simple searching algorithm used to find a particular element
in an array.

It checks each element one by one from the beginning of the array until the
required element is found.

## How Linear Search Works

Suppose we have:

[2, 3, 4, 6, 8, 10, 12, 14, 16]

Key = 12

The algorithm checks:

2 → Not found

3 → Not found

4 → Not found

6 → Not found

8 → Not found

10 → Not found

12 → Found

Therefore, the index of 12 is 6.

## Algorithm

1. Start from the first element of the array.
2. Compare the current element with the key.
3. If the element matches the key, return its index.
4. If it does not match, move to the next element.
5. Continue until the element is found or the array ends.
6. If the element is not found, return -1.

## Example

Array:

[2, 3, 4, 6, 8, 10, 12, 14, 16]

Key:

12

Output:

6

## Time Complexity

Best Case: O(1)

Average Case: O(n)

Worst Case: O(n)

## Space Complexity

O(1)

## Advantages

- Simple and easy to understand.
- Works on both sorted and unsorted arrays.
- Does not require extra space.

## Disadvantages

- Slow for large arrays.
- In the worst case, every element must be checked.

## Java Implementation

See `LinearSearch.java` in this folder.
