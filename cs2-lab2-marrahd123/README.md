# Lab 2 Stack
## Purpose
The purpose of this lab is to build and test a simple stack.  To this end students will focus on essential stack operations.  Improper use of the stack will be protected via the precondition and postconditions written for each method, therefore we will do no significant error checking.

The stack in today’s lab is an essential, minimal implementation.  The student is asked to focus on mechanics as opposed to design.

## Evaluation
Students will be awarded up to 10 points for successfully completing this lab as outlined below.

## Instructions
### Step 1 Getting Started
Clone this repository into your cloud9 workspace. The UML for today’s lab is shown below and matches class presentation.
![UML](/images/UML.png)

### Step 2 Completing the CharStack
You've been given a partially documented, partially implemented stack to work with. Study the [CharStack.java starter code](CharStack.java) you’ve been given and:
* Implement the pop method.  Currently it is stubbed in.  Be careful to decrement your top before returning the item.
* Implement the isEmpty method. Currently it is stubbed in. Look at the constructor for a clue as to what an empty stack looks like.
*	Implement the peek method.  It is missing.
*	Add a method called toString which creates and returns all the characters on the stack left to right, starting at the top.
*	Test all the methods in the CharStack class in the StackTester class. You should "guard" your pushes by checking to make sure the stack is not full, and you should guard your pops by checking to make sure the stack is not empty. Some unfinished sample code to test your stack is [CharStackTester.java starter code](CharStackTester.java).
*	Fill in all the pre/postcondition statements using the conventions presented in class.

### Step 3 Working With The Character Stack
Your next task, once you have demonstrated a tested and working stack, is to make your stack evaluate a parenthesized expression for correctness.  In other words,
* (A+B) is a properly parenthesized expression
* ((A+B)-(C*D)) is a properly parenthesized expression
* ((A+B) is not correct and A+B) is not correct.
* You may assume single letter variable names.

#### Algorithm
The basic algorithm you should try using is as follows:
1.	Read in a String from the keyboard.
2.	Using a for loop, parse the String left to right character by character.
3.	Whenever an opening symbol (a left paren) is encountered in the input, push it on the stack. Each time a closing symbol (right paren) appears, pop the stack. At the end of the input, the opening and closing symbols are balanced if and only if the stack is empty.

NOTE: It is YOUR responsibility to make sure you do not pop or peek an empty stack.

When you finish, show your code to your lab instructor.

### Step 4 If You Have Time
Stacks are useful in many ways.  One way a stack can be useful is in evaluating a word to see if it is a palindrome. You will recall that a palindrome is a word that reads the same forwards as backwards.  "MOM", "WOW", and RACECAR are all palindromes.

Adapt the algorithm in your main method to read in a word.  Using one or more stacks, see if you can create an algorithm which decides if the word is a palindrome. If you still have time, you may work on program 1.

Use the following two commands to test your code using Junit. You can learn about unit testing with Junit by reading [this tutorial](https://www.tutorialspoint.com/junit/index.htm).
```shell
$ javac -cp junit-4.10.jar:. CharStackTest.java TestRunner.java
$ java -cp junit-4.10.jar:. TestRunner
```