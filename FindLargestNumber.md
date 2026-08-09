What is Integer.MIN_VALUE?

Integer.MIN_VALUE is the smallest value that an int can store in Java:

Integer.MIN_VALUE = -2,147,483,648

So initially:

int largest = Integer.MIN_VALUE;

means:

"For now, assume the largest number is the smallest possible integer."

Then we compare every array element with it.

Step-by-step

Array:

10, 25, 5, 40, 15

Initially:

largest = -2,147,483,648
First iteration
10 > -2,147,483,648

Yes → update:

largest = 10
Second iteration
25 > 10

Yes:

largest = 25
Third iteration
5 > 25

No:

largest = 25
Fourth iteration
40 > 25

Yes:

largest = 40
Fifth iteration
15 > 40

No.

Final result:

Largest number = 40
Why is this approach useful?

Suppose your array contains only negative numbers:

int[] numbers = {-50, -20, -100, -10};

With:

int largest = Integer.MIN_VALUE;

the program still works:

-50 > -2147483648 → largest = -50
-20 > -50        → largest = -20
-100 > -20       → no
-10 > -20        → largest = -10

Result:

Largest = -10

That's why Integer.MIN_VALUE is a safe initial value when you're finding the maximum of an int array.

Complexity
Time Complexity  : O(n)
Space Complexity : O(1)
