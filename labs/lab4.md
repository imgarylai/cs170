# lab 4 

## Goals:

- Command line arguments
- Convert command line arguments to integer
- if-else statement & switch statement

Please, make sure that you have added the honor code statement at the top of your Java file:

```java
/*
  THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING       
  CODE WRITTEN BY OTHER STUDENTS. _Your_Name_Here_
*/
```

## Preparation: Create your ~/cs170/lab4/, and copy files

```
mkdir ~/cs170/lab4
cp  ~cs170002/share/lab4/*  ~/cs170/lab4
cd ~/cs170/lab4
```

## Arguments

When you run a Java program using additional parameters, the additional parameters are called **command line arguments**.

```sh
java myProgram x y z
```

How a Java program can obtain the values of the command line arguments?
  - The values of the command line arguments are passed (i.e., given) to a Java program through the parameter in the `main(String[] args)` method.

Example: 

```java
public static void main( String[] args ) {
  ...
}
```

- The parameter of the `main()` method is the variable args.
- This variable args stores (contains) the values command line arguments as follows:
  - `args[0]` contains the value of the first command line argument
  - `args[1]` contains the value of the second command line argument
  - `args[2]` contains the value of the third command line argument
  - and so on...
- Remember that computer starts counting at `ZERO (0)`, humans usually start counting at `ONE (1)`....

The type of the command line arguments

- The type of the variables `arg[0]`, `arg[1]`, and so on, are `String`.
- So if you specify a number as a command line argument, the `main()` will store it as the type String
- So if you want to do calculation with that number, you need to convert it to an `int` or `double` first.
  ```java
  int x = Integer.parseInt("42");       //converts a String to an int value
  double y = Double.parseDouble("42");  //converts a String to an double value
  ```

## Assignment:

Complete `Arithmetic1.java` and `Arithmetic2.java`.

### Check points
- Both programs `Arithmetic1.java` and `Arithmetic2.java` take three command-line arguments.
  - ex: `java Arithmetic1 number1 number2 operator`
  - two integers
  - followed by an arithmetic operator (+, -, * or /)
- Both programs print the result of the arithmetic expression
- Use if-else statement in `Arithmetic1.java`. 
- Use switch statement in `Arithmetic2.java`. 

Sample correct result:

```sh
$ javac Arithmetic1.java
$ java Arithmetic1 1 2 +
1 + 2 = 3
$ java Arithmetic1 2 3 *
3 * 2 = 6
$ java Arithmetic1 3 2 ?
Error: invalid operator!
```

Upload both `.java` files to Canvas. 