# Lab 7

## Goals:

- Review what you have learned. 

Please, make sure that you have added the honor code statement at the top of your Java file:

```java
/*
  THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING       
  CODE WRITTEN BY OTHER STUDENTS. _Your_Name_Here_
*/
```

## Preparation: Create your ~/cs170/lab7/, and copy files

```sh
bash
mkdir ~/cs170/lab7
cp  ~cs170001/share/lab7/*  ~/cs170/lab7
cd ~/cs170/lab7
```

## Assignment:

Today, we want to make ASCII art. 

```
      A
     AAA
    AAAAA
   AAAAAAA
  AAAAAAAAA
 AAAAAAAAAAA
AAAAAAAAAAAAA
    XXXXX
    XXXXX
    XXXXX
    XXXXX
    XXXXX
    XXXXX
    XXXXX
    XXXXX
    XXXXX 
```

- `indentCharLine(int i, char c, int n)` 
  - This method will first print `i` spaces (i.e., indents `i` positions)
  - Then, it prints the character `c` (given as input of the method), `n` times (`n` is also an input parameter)
  - Finally, it prints a NEWLINE(`\n`) (to end the current line)

Example:

```java
indentCharLine(4, 'A', 6)
// will print:  ____AAAAAA
// (I use _ to represent a BLANK SPACE)
```

#### `Sample.java`

We have a `printSquare` function

```java
public static void printSquare(int i, char c, int col) {
  
  //  Print n rows of character c of width n
  for (int row = 0; row < col; row++) {
    indentCharLine(i, c, col);
  }
}
```

```
$ javac  Sample.java
$ java   Sample
    OO
    OO

    XXX
    XXX
    XXX

```

#### `AsciiArt.java`

You **ONLY** implement `printColumn` and `printTriangle`. 

#### Explanation:

- `printColumn(int i, int w, int h, char c)` prints a rectangle with:
  - `i` indention 
  - `w` width
  - `h` height
  - `c` char

- `printTriangle(int h, char c)` prints an isosceles triangle with:
  - `h` height
  - `2*h+1` base
  - `c` char

More examples: 

```
printTriangle(2, 'A');
 A
AAA
```

```
printTriangle(5, 'A');
    A
   AAA
  AAAAA
 AAAAAAA
AAAAAAAAA
```

```
printColumn(1, 1, 9, 'X');
 X
 X
 X
 X
 X
 X
 X
 X
 X
```

```
printColumn(2, 5, 6, 'X');
  XXXXX
  XXXXX
  XXXXX
  XXXXX
  XXXXX
  XXXXX
```

#### Submission 

Upload the `AsciiArt.java` with your honor code to Canvas, **NOT** `AsciiArt.class`!!