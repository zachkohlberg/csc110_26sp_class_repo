# Week 12 Notes

## Mutability

two reference types, arrays and strings

- strings are immutable, unchangeable
- arrays are mutable, changeable

important points:

- reference types store references to the objects in variables, not
  the objects themselves
- two or more variables can have a reference to the same object
- if two variables reference a mutable object, then changes to one variable can affect the other

with arrays, the only mutation you can perform is to reassign the element at an index:

```java
// creates a new array
int[] a1 = { 1, 2, 3 };
// mutates the array
a1[1] = 5;
// reassigns a1; doesn't mutate the array
a1 = new int[] { 3, 4, 3 };
```
