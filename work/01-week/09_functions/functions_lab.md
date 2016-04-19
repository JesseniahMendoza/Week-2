
# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Writing More Advanced Functions

## Introduction

> ***Note:*** _This can be a pair programming activity or done independently._

This lab provides an opportunity to practice creating functions!

## Exercise

#### Requirements

Please write code that implements various functions, following the requirements in the list below:

- Write a function `wordLength` that takes string and returns it's length.

- Define a function `maxOfTwoNumbers` that takes two numbers as arguments and prints out the largest of them. I would suggest using conditional statements. Do some Googling to figure this out if you forget how conditionals work.

- Define a function `maxOfThree` that takes three numbers as arguments and prints out the largest of them.

- Write a function `isCharacterAVowel` that takes a character (i.e. a string of length 1) and prints "true" if it is a vowel, "false" otherwise.

- Write a method called divide152By. This method should accept one argument, a number, and should divide 152 by the given number. For example, the divide152By result of 1 is 152/1 is 152. Your function should return the result.

Use your function to find the following:

```
divide152By(3);
divide152By(43);
divide152By(8);
```

- Write a method called thirdAndFirst. This method accepts two strings, and checks if the third letter of the first string is the same as the first letter of the second string. It should be case insensitive, meaning thirdAndFirst("Apple","Peon") should return true.

Check the following:

```
thirdAndFirst("billygoat","LION");
thirdAndFirst("drEAMcaTCher","statue");
thirdAndFirst("Times","thyme");
```




## Additional Resources:
- [Oracle Java Docs - Defining Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- [Oracle Java Docs - A Closer Look at the "Hello World!" Application](https://docs.oracle.com/javase/tutorial/getStarted/application/)
- [Princeton Java Cheat sheet](http://introcs.cs.princeton.edu/java/11cheatsheet/)
- [Java Modifier Types](http://www.tutorialspoint.com/java/java_modifier_types.htm)
- [Princeton Recursion](http://introcs.cs.princeton.edu/java/23recursion/)


----

###Solution Code


```
class Main {

  public static void main(String[] args) {
    
	int length = wordLength("hello or whatever! ");
	System.out.println("wordLength " + length);
	
	maxOfTwoNumbers(7, 16);
	isCharacterAVowel('z');
	isCharacterAVowel('u');
	
	float result = divide152By(888);
	System.out.println("divide152 :" + result);
	
	System.out.println("divide152 :" + divide152By(152));
	
	thirdAndFirst("hello ", "world");
	thirdAndFirst("billygoat","LION");
	thirdAndFirst("drEAMcaTCher","statue");
	thirdAndFirst("Times","me");
  }
  
  public static int wordLength(String str){
  	return str.length();
  }
	  
  public static void maxOfTwoNumbers (int a, int b){
  	System.out.println("maxOfTwoNumbers :");
  	if(a>b){
  		System.out.println(a + " is larger");
  	} else if (b>a) {
  		System.out.println(b + " is larger");
  	} else {
  		System.out.println("error");
  	}
  }
  
  public static void isCharacterAVowel (char character) {
  	switch(character){
  		case 'a':
  		case 'e':
  		case 'i':
  		case 'o':
  		case 'u':
  			System.out.println("isCharacterAVowel : " + true);
  			break;
  		default:
  			System.out.println("isCharacterAVowel : " + false);
  	}
  }
  	
  public static float divide152By(int num){
	float value = (float)num /152f;
	return value;
  }
  
  public static void thirdAndFirst(String str1, String str2){
  	System.out.println(str1 + " " + str2);
  	// System.out.println(str1.toLowerCase().charAt(0) + " and " + str2.toLowerCase().charAt(2));
  	
  	if (str1.toLowerCase().charAt(2) == str2.toLowerCase().charAt(0)) {
  		System.out.println("thirdAndFirst are the same");
  	} else {
  		System.out.println("thirdAndFirst are not the same");
  	}
  }
  
  
}
```
