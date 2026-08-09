1. What is a pair?

A pair means taking two elements at a time.

For your array:

int[] numbers = {2, 4, 6, 8, 10};

The pairs are:

(2,4)
(2,6)
(2,8)
(2,10)

(4,6)
(4,8)
(4,10)

(6,8)
(6,10)

(8,10)

So there are 10 total pairs.

3. First, the main() method
int[] numbers = {2, 4, 6, 8, 10};

You create an array:

Index:    0   1   2   3    4
Value:    2   4   6   8   10

Then:

printPairs(numbers);

calls the printPairs() method and sends the array to it.

4. tp variable

Inside the method:

int tp = 0;

tp means total pairs.

It is used to count how many pairs are created.

Initially:

tp = 0

Every time a pair is printed:

tp++;

So it increases by 1.

5. Outer for loop
for (int i = 0; i < numbers.length; i++)

This loop selects the first element of the pair.

For example:

i = 0 → 2
i = 1 → 4
i = 2 → 6
i = 3 → 8
i = 4 → 10
6. current

Inside the outer loop:

int current = numbers[i];

This stores the current element.

When i = 0
current = numbers[0]
current = 2
When i = 1
current = numbers[1]
current = 4

And so on.

So current is basically the first element of the pair.

7. Inner for loop ⭐

This is the most important part:

for (int j = i + 1; j < numbers.length; j++)

Why do we use:

j = i + 1

instead of:

j = 0

Because we don't want to:

Pair an element with itself.
Repeat the same pair in reverse order.

For example, if we already have:

(2,4)

we don't need:

(4,2)

And we don't want:

(2,2)

Therefore, we start j from the next element after i.

8. Let's do the complete dry run

This is the best way to understand the program.

First outer iteration
i = 0
current = numbers[0]
current = 2

So:

2   4   6   8   10
↑
i

Now inner loop:

j = i + 1
j = 1
j = 1
numbers[j] = numbers[1] = 4

Print:

(2,4)

tp becomes:

tp = 1
j = 2
(2,6)
tp = 2
j = 3
(2,8)
tp = 3
j = 4
(2,10)
tp = 4

Then inner loop ends.

So first element 2 creates:

(2,4)
(2,6)
(2,8)
(2,10)
9. Second outer iteration

Now:

i = 1
current = numbers[1]
current = 4

The array:

2   4   6   8   10
    ↑
    i

Inner loop starts:

j = i + 1
j = 2

So:

(4,6)
(4,8)
(4,10)

tp goes from:

4 → 5 → 6 → 7
10. Third outer iteration
i = 2
current = 6

Inner loop starts:

j = 3

Pairs:

(6,8)
(6,10)

tp:

7 → 8 → 9
11. Fourth outer iteration
i = 3
current = 8

Inner loop:

j = 4

Pair:

(8,10)

tp:

9 → 10
12. Fifth outer iteration
i = 4
current = 10

Now:

j = i + 1
j = 5

But:

j < numbers.length
5 < 5

is false.

So there are no pairs starting with 10.

The loops finish.

13. Final output

Your output will look approximately like:

(2,4)(2,6)(2,8)(2,10)
(4,6)(4,8)(4,10)
(6,8)(6,10)
(8,10)
(10)
Total pairs are:10

Actually, because your System.out.println() runs after every outer loop, you will get an empty line after the last element as well, but no (10) pair is printed.

14. Why are there 10 pairs?

For 5 elements:

2 → 4 pairs
4 → 3 pairs
6 → 2 pairs
8 → 1 pair
10 → 0 pairs

Therefore:

4 + 3 + 2 + 1 + 0 = 10

There is also a formula:

n × (n - 1) / 2

For 5 elements:

5 × 4 / 2 = 10
15. Why do we use two loops?

Because we need to compare/combine each element with all the elements after it.

Outer loop:

Select first element

Inner loop:

Pair it with every element after it

Think of it like:

i = 0 → 2 → pair with 4,6,8,10
i = 1 → 4 → pair with 6,8,10
i = 2 → 6 → pair with 8,10
i = 3 → 8 → pair with 10
i = 4 → 10 → nothing

That's the entire logic.

16. Why j = i + 1 is important

This line:

for (int j = i + 1; j < numbers.length; j++)

is the key to avoiding duplicates.

If you used:

j = 0

you would get things like:

(2,2)
(2,4)
...
(4,2)
(4,4)
...

But we only want unique pairs of different elements.

So:

j = i + 1

means:

Start from the element immediately after the current element.

17. Time Complexity

You have a nested loop:

for (...)
{
    for (...)
    {
    }
}

Therefore, the time complexity is:

O(n²)

More precisely, the number of pairs is:

n(n-1)/2

But in Big-O notation:

O(n²)
Space Complexity

You only use a few variables:

int tp;
int current;
int i;
int j;

No additional array is created.

Therefore:

Space Complexity = O(1)
