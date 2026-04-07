# Week 11 Notes

## Extra Assignment Operators

The += operator and friends:

```java
// this
x = x + 5;

// is the same as this
x += 5;
```

full list:

- `x += y` is the same as `x = x + y`
- `x -= y` is the same as `x = x - y`
- `x *= y` is the same as `x = x * y`
- `x /= y` is the same as `x = x / y`
- `x %= y` is the same as `x = x % y`

The increment and decrement operators: `++` and `--`

```java
// this
x = x + 1;

// is the same as this
++x;

// and also this
x++;
```

- `++` before or after variable increments (increases by 1)
- `--` before or after variable decrements (decreases by 1)

### Preorder vs Postorder

You can use assignments, including increment/decrement, as expressions:

```java
int x = 0;
// x = 10 as an expression is equivalent to 10
int y = (x = 10);

int a = 0;
// a++ as an expression is equivalent to a, but increases a by 1 AFTER
int b = a++;
// a is 1, b is 0

int c = 0;
// ++c as an expression is equivalent to c + 1, and increases c by 1
int d = ++c;
// c is 1, d is 1

// note: -- works the same way when placed before vs after variable name
```

Preorder/postorder increment and decrement refer to this difference.

My advice: don't use ++, --, or assignment statements in expressions. Makes code
much less readable.
