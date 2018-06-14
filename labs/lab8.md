# Lab 8

## Goals:

- Homeworks
- Scoping
- Do more practice
- Homework 6 (Optional)

Please, make sure that you have added the honor code statement at the top of your Java file:

```java
/*
  THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING       
  CODE WRITTEN BY OTHER STUDENTS. _Your_Name_Here_
*/
```

## Preparation: Create your ~/cs170/lab8/, and copy files

```sh
bash
mkdir ~/cs170/lab8
cp  ~cs170001/share/lab8/*  ~/cs170/lab8
cd ~/cs170/lab8
```

## Homeworks

- 🏅  Add honor code with your name to all your files. (No exceptions)
- 📖  Save your score and my time. Make sure your code is readable for human beings. Use the proper variable name, indention, brackets, and so on. If I don't understand your code, no matter your result is correct or not, I won't give you scores. However, if you code is reader-friendly, even though your result is partially correct, I will still try my best to help you get scores or help you fix some minor bugs. Ref: (Google Java Style Guide)[https://google.github.io/styleguide/javaguide.html]
- 📝  Write comments to explain your idea, even though your code is self-explanatory. 
- 💭  You can create your class, function, and variable, but do not change function name and file name which is already in there. Otherwise, your program might not pass test cases. 


## Assignment # 1 Scoping

- variable `a` on line (1) is a `class` variable
- variable `a` on line (2) is a `parameter` variable
- variable `a` on line (3) is a `parameter` variable
- variable `x` on line (4) is a `local` variable
- variable `a` on line (5) is a `local` variable
- variable `a` on line (6) is a `local` variable

#### Part 1

```
$ javac  Scoping.java
$ java   Scoping
------ inside F( double a )
a at (2) = -4.44444444E8
a at (1) = 123.0 
```

#### Part 2, 3, 4, 5

You can check your program by

```sh
$ javac  Scoping.java
$ java   Scoping
...
```

If it is not possible to write the requested method call, then write the following statement in its place:

```java
System.out.println("Impossible: Write a method call F() that passes X on line (N) ");
```

You should replace `X` with which variable and `N` with which line. For example:

```java
System.out.println("Impossible: Write a method call F() that passes a on line (1) ");
```

#### Assignment # 2 Fold and unfold a string

Let `s` be a string consisting of the characters "c0c1c2...cn-3cn-2cn-1"

We define the `fold` operation on a string as follows:


```
Original string:   "c0c1c2.....cn-3cn-2cn-1"      

Folded string:     "c0cn-1c1cn-2c2cn-3....."
```

In other words:

- We first put the first character in the folded string
- Then we put the last character in the folded string
- Then we put the second character in the folded string
- Then we put the one before last character in the folded string
- And so on.

Examples:

Original string | Folded string             
---|---
"ab"|"ba"
"abc" | "acb"
"abcd" | "adbc"
"abcde" | "aebdc"
"abcdef" | "afbecd"

#### Algorithm:

Use 2 pointer (indices): `i` points at the start and `j` points at the end

Use a variable named `output` to collect the folded string

Initial state:
```
output = "";

"abcd.....xyz"
 ^          ^
 |          |
 i          j
```

After 1 iteration:

```
output = "az";

"abcd.....xyz"
  ^        ^
  |        |
  i        j
```

After 1 iteration:

```
output = "azby";

"abcd.....xyz"
   ^      ^
   |      |
   i      j
```

After n iteration ...

Repeat until i catches up to j (i.e.: i >= j)

2 cases:

- If input string has an **odd** number of characters: then `i == j`

```
"abcd ..  ?  .. xyz"
          ^
          |
         i==j
```

Action: add the middle character to the output

Example: input = `abcde` output = `aebdc`

After 2 iterations, `i` and `j` will point to the character `c` We must add `c` to the output.

- If input string has an even number of characters: then `i > j`

```
"abcd ..  ??  .. xyz"
          ^^
          ||
          ji
```

Action: Don't do anything (the output is correct)


Example:   input = `abcd` output = `adbc`

After 2 iterations, `i` points to `c` and `j` points to `b` Don't need to add any characters to the output !

#### Extra

Write an `unfoldString()` method in the file `Fold.java` that undo the fold operation

#### Algorithm:

Use 1 pointer `i`

Use 2 variables to collect to unfolded string:

`out1` contains the prefix of the unfolded string
`out2` contains the postfix of the unfolded string



How to unfold a string:

input = `abcdefghijk....`

Start here:
```
"abcdefghijk...."
 ^
 |
 i
```
the character at position `i` goes in the prefix (`out1="a"`) 

the character at position `i+1` goes in the postfix (`out2="b"`)

(Make sure they go in the right order; use the concatenation operation WISELY !)

Advance `i` by `2` !!!:

```
"abcdefghijk...."
   ^
   |
   i
```

the character at position `i` goes in the prefix (`out1="ac"`)

the character at position `i+1` goes in the postfix (`out2="db"`)

(Make sure they go in the right order; use the concatenation operation WISELY !)

Advance `i` by `2` !!!:

```
"abcdefghijk...."
     ^
     |
     i
```

the character at position `i` goes in the prefix (`out1="ace"`) 

the character at position `i+1` goes in the postfix (`out2="fdb"`)

(Make sure they go in the right order; use the concatenation operation WISELY !)

... And so on.


You need to handle 2 different cases:

1. input has an odd number of characters
2. input has an even number of characters

#### Submission

Upload the `Scoping.java` and '`Fold.java` to Canvas.

#### Homework 6

Checkpoints

- Everything I mentioned in the beginning of the class. 

- `Perfect.java`
  - Use `sumFactors` to get sum of all its divisors (Do not check if it is a perfect number)
  - User `isPerfect` to check if `n` is a perfect number (Do not get sum of all its divisors)

- `MaxSubseq.java`
  - Get correct result by given any string
  - Correct result format:
    ```
    The first (longest possible) "increasing" subsequence = abdhkt
    The next (longest possible) "increasing" subsequence = cegkx
    The next (longest possible) "increasing" subsequence = klmw
    The next (longest possible) "increasing" subsequence = aabhx
    The final (longest possible) "increasing" subsequence = bbbc
    ```
  - Full credits: if use only two loops (`for` or `while`).
  - Partial credits: if use more than two loops (`for` or `while`)
  - Extra: if use only ONE loop (`for` or `while`). 

