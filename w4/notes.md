# Week 4 Notes

## Types

- variables all have types
- types tell us what kind of information a variable can store
- types we care about this week:
  - String: stores text, sequences of characters
  - int: stores an integer (whole number, can be negative)
  - double: stores an approximation of a real number (these are called
    "floating-point numbers")
  - boolean: true/false values
- in math, we have categories like whole number, integer, rational number,
  irrational number, real number
- in programming, we usually just deal with integers and real numbers

## Literal Values

- a literal value is "hard-coded"; the actual value is written directly in the
  code rather than the result of a calculation or user input
- string literals are enclosed in double-quotes: "
  - "abc"
  - "hello world"
- integer literals are just whole numbers, don't include a decimal point
  - 100
  - -11
  - 10_000_000
- double literals are numbers with a decimal point (even if the number itself is
  an integer/whole number) or written in scientific (e) notation
  - 100.0
  - -3.14
  - 1.75E12 (this is 1.75 times 10 to the 12th power, or 1,750,000,000,000)
  - 0.25E-7 (this is 0.000000025, or 0.25 times 10 to the -7th power)

## Operators

- order of operations: PEMDAS, same as in math
  - parenthesis
  - exponents (no exponent operator, so ignore this part)
  - multiplication and division (and modulo)
  - addition and subtraction (and concatenation)

## Integers and Doubles

- doubles (and floating-point numbers in general) represent approximations of real numbers, not perfectly precise
  - financial software: bad idea, can't accept this amount of imprecision
  - physics simulations, game engines: it's fine, we don't need perfect accuracy
  - you can use integers in some situations, just representing the smallest possible unit
  - other data types can be used if integers aren't good enough, but these have other drawbacks
- integers can overflow if they get too large or too small: they will wrap around to the other end of the range of values they can represent (from very large positive number to very large negative number or the other way around)
- dividing integers will yield integers; result is truncated (everything after decimal is dropped)

## Expressions

- an expression can be evaluated to a single value with a type (such as int, String, etc.)
- an expression can be something as simple as a single literal or the name of a variable
- an expression can be much more complex: function calls joined with operators inside other function calls can all form an expression that evaluates to just one number
- operators and function calls that require operands or arguments of a certain type can take any expression of that type
- function calls that return a value are expressions

