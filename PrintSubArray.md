1. What is a subarray?

A subarray is a continuous part of an array.

For:

int[] numbers = {2, 4, 6, 8, 10};

Some subarrays are:

2
2 4
2 4 6
4
4 6
4 6 8
6 8
8 10
10

The elements must be continuous.

For example:

2 6

is not a subarray because 4 is between them

3. Understand the array

Your array is:

Index:    0   1   2   3    4
          ↓   ↓   ↓   ↓    ↓
Value:    2   4   6   8   10
4. tsa variable
int tsa = 0;

tsa means:

Total SubArrays

It counts how many subarrays are generated.

Initially:

tsa = 0

Whenever one subarray is printed:

tsa++;

So it becomes:

1 → 2 → 3 → ...
5. First loop — choosing start
for(int i = 0; i < numbers.length; i++) {
    int start = i;

The outer loop determines where the subarray starts.

So:

i = 0 → start = 0
i = 1 → start = 1
i = 2 → start = 2
i = 3 → start = 3
i = 4 → start = 4

Think:

        START
          ↓
2   4   6   8   10
↑

Then:

        START
          ↓
2   4   6   8   10
    ↑

Then:

        START
          ↓
2   4   6   8   10
        ↑

So the first loop says:

Where should my subarray start?

6. Second loop — choosing end

Inside the first loop:

for(int j = i; j < numbers.length; j++) {

    int end = j;

This loop decides where the subarray ends.

Notice:

j = i

This is important.

The end starts from the same position as the start and then moves to the right.

For example, when:

start = 0

the end values will be:

end = 0
end = 1
end = 2
end = 3
end = 4

So we get:

start = 0, end = 0 → 2
start = 0, end = 1 → 2 4
start = 0, end = 2 → 2 4 6
start = 0, end = 3 → 2 4 6 8
start = 0, end = 4 → 2 4 6 8 10

This is the core idea.

7. Third loop — printing the subarray

Now we have:

int start = i;
int end = j;

The third loop is:

for(int k = start; k <= end; k++) {
    System.out.print(numbers[k] + " ");
}

This loop prints all elements between start and end.

So:

start = 1
end = 3

means:

2   [4   6   8]   10
    ↑           ↑
  start        end

The k loop prints:

4 6 8
8. Let's do the complete dry run ⭐

Array:

2  4  6  8  10
First: start = 0
i = 0
start = 0

The second loop starts with:

j = 0
end = 0

Third loop:

k = 0

Print:

2

So first subarray:

[2]

tsa:

tsa = 1
end = 1

Now:

start = 0
end = 1

Third loop:

k = 0 → 2
k = 1 → 4

Print:

2 4

Subarray:

[2 4]

tsa = 2

end = 2
start = 0
end = 2

Print:

2 4 6

tsa = 3

end = 3

Print:

2 4 6 8

tsa = 4

end = 4

Print:

2 4 6 8 10

tsa = 5

So when start = 0, we get:

2
2 4
2 4 6
2 4 6 8
2 4 6 8 10
9. Now start = 1

The outer loop increments:

i++;

So:

i = 1
start = 1

Now the array is conceptually:

2  [4   6   8   10]
    ↑
  start

The middle loop starts with:

end = 1
end = 1
4
end = 2
4 6
end = 3
4 6 8
end = 4
4 6 8 10

So:

4
4 6
4 6 8
4 6 8 10

tsa increases by 4.

10. start = 2

Now:

2  4  [6   8   10]
        ↑
      start

Possible subarrays:

6
6 8
6 8 10
11. start = 3

Now:

2  4  6  [8   10]
           ↑
         start

Subarrays:

8
8 10
12. start = 4

Finally:

2  4  6  8  [10]
               ↑
             start

Only:

10
13. Complete output

Your program produces:

2
2 4
2 4 6
2 4 6 8
2 4 6 8 10

4
4 6
4 6 8
4 6 8 10

6
6 8
6 8 10

8
8 10

10

And:

Total SubArrays are :15
14. Why are there 15 subarrays?

For an array with n elements, the number of possible subarrays is:

n × (n + 1)
----------------
       2

Your array has:

n = 5

Therefore:

5 × 6
-----
  2

= 15

So:

Total SubArrays = 15
15. Difference between pairs and subarrays

This is important because you just learned PrintPairs.

Pairs

For:

2 4 6 8 10

Pairs include:

(2,4)
(2,6)
(2,8)
(2,10)
...

The elements don't have to be adjacent.

Subarrays

Subarrays must be continuous:

2 4
2 4 6
4 6
6 8 10

But:

2 6

is not a subarray because 4 was skipped.

16. Why do we need three loops?

This is the most important concept in your program:

1st loop → START
     ↓
2nd loop → END
     ↓
3rd loop → PRINT everything from START to END

For example:

Array:
2  4  6  8  10

start = 1
end   = 3

        start       end
          ↓          ↓
2       [4   6   8]       10
             ↓
           k loop

Print → 4 6 8
17. Why j = i?

You have:

for(int j = i; j < numbers.length; j++)

Suppose:

i = 2

Then:

j = 2

So:

start = 2
end = 2

This allows the single-element subarray:

6

Then j increases:

6
6 8
6 8 10

If you started j from i + 1, you would miss the single-element subarrays.

18. Why k <= end?

You wrote:

for(int k = start; k <= end; k++)

The <= is important because we want to include the element at the end index.

For example:

start = 1
end = 3

We need:

numbers[1]
numbers[2]
numbers[3]

Therefore:

k = 1
k = 2
k = 3

That's why:

k <= end
19. Complexity

This program has three nested loops:

for (i)
    for (j)
        for (k)

The overall time complexity is:

O(n³)

Why?

The program doesn't just generate the subarrays; it also prints every element of every subarray.

The number of subarrays is:

O(n²)

but the total number of elements printed across all subarrays is:

O(n³)
Space complexity
O(1)
