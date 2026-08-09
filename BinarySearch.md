1. What is Binary Search?

Binary Search is a searching algorithm used to find a particular element in a sorted array.

Instead of checking every element one by one, Binary Search:

Checks the middle element and eliminates half of the search space after every comparison.

For example:

Array:
6   11   12   17   34   47   51

Suppose we want to find:

Target = 47

Binary Search first checks the middle:

6   11   12   [17]   34   47   51
                ↑
              middle

47 is greater than 17, so we know it must be on the right side.

We can completely ignore:

6   11   12   17

Now search only:

34   47   51

Then check the middle again:

34   [47]   51
       ↑

Found!


EXPLANATION OF THE CODE :

6. start
int start = 0;

start represents the first index of the current search area.

Initially:

6   11   12   17   34   47   51
↑
start
0
7. end
int end = numbers.length - 1;

end represents the last index of the current search area.

There are 7 elements, so:

numbers.length = 7

Therefore:

end = 7 - 1
end = 6

So:

6   11   12   17   34   47   51
↑                       ↑
start                   end
0                        6
8. Finding the middle
int mid = (start + end) / 2;

Initially:

start = 0
end = 6

Therefore:

mid = (0 + 6) / 2
mid = 3

So:

6   11   12   [17]   34   47   51
                ↑
              mid = 3
9. Check whether target is found
if (target == numbers[mid]) {
    return mid;
}

Suppose:

target = 17;

Then:

target = 17
numbers[mid] = 17

They are equal.

Therefore:

return 3;

The answer is index 3.

10. What if target is greater than middle?

This is your next condition:

if (numbers[mid] < target) {
    start = mid + 1;
}

Suppose:

Target = 47
Middle = 17

We know:

17 < 47

Because the array is sorted, 47 must be somewhere to the right.

So:

start = mid + 1;

Since:

mid = 3

we get:

start = 4

Now we ignore indexes 0–3.

Search only:

34   47   51
↑         ↑
start     end
4         6
11. What if target is smaller than middle?

Your else handles this:

else {
    end = mid - 1;
}

Suppose:

Target = 11
Middle = 17

We know:

17 > 11

Therefore, 11 must be on the left side.

So:

end = mid - 1;

If:

mid = 3

then:

end = 2

Now we search:

6   11   12
↑         ↑
start     end
12. Why do we use while (start <= end)?
while (start <= end)

This means:

Continue searching while there is still a valid portion of the array to search.

Eventually, if the element doesn't exist:

start > end

Then the loop stops.

And:

return -1;

means:

The target was not found.

Why is Binary Search faster than Linear Search?

You can say:

Linear Search checks elements sequentially, so in the worst case it may examine all n elements, giving O(n) time complexity. Binary Search checks the middle element and eliminates half of the remaining search space after every comparison, giving O(log n) time complexity. However, Binary Search requires the data to be sorted.

That's the core concept you should remember.
