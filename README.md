## Unit 2 In-Class Exercise Part I - Testing
In this exercise students will learn about testing and Test-Driven Development. They will 
learn how to create a test suite, and gain experience creating tests through implementation of JUnit tests.

### Exercise Description
This project involves test-driving a class called "FizzBuzz" which will contain a method to perform
the calculation for the FizzBuzz code exercise. FizzBuzz is a common coding problem which involves taking a 
number and returning a value based on the following rules:

#### FizzBuzz Rules
Given a number:
* If the number is divisible by 3 then return the String "fizz".
* If the number is divisible by 5 then return the String "buzz".
* If the number is divisible by 3 and 5 then return the String "fizzbuzz".
* If none of these rules apply then return the String value of the number.

Examples:
* 3, 6, and 9 would all return "fizz"
* 5, 10, and 20 would all return "buzz"
* 15, 30, and 45 would all return "fizzbuzz"
* 1, 2, 4, and 7 would all return "1", "2", "4", and "7"

### Task
The task for this exercise will be to write tests that "drive" in the functionality of the FizzBuzz Rules described above.
1. Locate the "FizzBuzzTest" test class under the "test" folder. 
2. Note the TODO comments in the test class. 
3. There is already a test in place that currently fails. Once you implement the functionality for the TODO comment in the "setUp" method
that test should pass. You are now ready to begin writing other tests.
4. For each rule above, write one or more tests. Be sure to follow the rules of Test-Driven Development, which are as follows:
    1. Write a small test FIRST that will force you to implement some production code. Make sure the test fails.
    2. Write JUST ENOUGH production code (in the FizzBuzz class in this case) to make that test pass.
    3. Run all of the tests to make sure they continue to pass.
    4. Clean your code up and improve it (this is called "refactoring").
    5. Repeat the above steps until all of the functionality has been implemented. 
    
Once you have written enough tests to implement the functionality you will be done.