# Lab 5

## Goals:

- Learn how to use switch 
- Learn to write for-loops to make text based drawings.

Please, make sure that you have added the honor code statement at the top of your Java file:

```java
/*
  THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING       
  CODE WRITTEN BY OTHER STUDENTS. _Your_Name_Here_
*/
```

## Recap

Complete `Arithmetic2.java`.

### Check points
- `Arithmetic2.java` take three command-line arguments.
  - ex: `java Arithmetic2 number1 number2 operator`
  - two integers
  - followed by an arithmetic operator (+, -, * or /)
- Use switch statement in `Arithmetic2.java`. 

Sample correct result:

```sh
$ javac Arithmetic2.java
$ java Arithmetic2 1 2 +
1 + 2 = 3
$ java Arithmetic2 2 3 *
3 * 2 = 6
$ java Arithmetic2 3 2 ?
Error: invalid operator!
```

Upload both `.java` files to Canvas. (Lab5)

## Preparation: Create your ~/cs170/lab5/, and copy files

```
mkdir ~/cs170/lab5
cp  ~cs170001/share/lab5/*  ~/cs170/lab5
cd ~/cs170/lab5
```

## Sample

```
javac  Sample.java
java   Sample  3

Output:
XXX
XXX
XXX
```

## Code Explanation 

```
indentCharLine(i, c, n):
```

- This method will first print i spaces (i.e., indents i positions)
- Then, it prints the character c (given as input of the method), n times (n is also an input parameter)
- Finally, it prints NEWLINE (to end the current line)

Example:

```
indentCharLine(4, 'A', 6)   will print:  ____AAAAAA
indentCharLine(6, 'X', 3)   will print:  ______AAA
```

## Assignment:

Finish `Triangle1.java` and `Triangle2.java`

- Complete the `main()` method
- Make use of the method indentCharLine() inside the for-loop to make your loop simple !!!

`Triangle1.java`

Result:

```
$ javac  Triangle1.java
$ java   Triangle1  7
X
XX
XXX
XXXX
XXXXX
XXXXXX
XXXXXXX   
```

```
$ javac  Triangle2.java
$ java   Triangle2  7
      X
     XX
    XXX
   XXXX
  XXXXX
 XXXXXX
XXXXXXX  
```

Upload your code to Canvas