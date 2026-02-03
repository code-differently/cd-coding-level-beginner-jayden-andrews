# Problem Set 02

You will be solving the given problems below.

### Problem 11
An elementary school teacher needs your help to create new strings for a fun activity they have planned. You will be
provided a non-empty string and a number N. To create a new string, you will start with the character 0. Next you will
add every Nth character of the string to the new string.

Return the new string.

Tip: If N is 3, use char 0, 3, 6 ... and so on. N is 1 or more.

Example:
```java
everyOther("Miracle", 2) --> "Mrce"
everyOther("abcdefg", 2) --> "aceg"
everyOther("abcdefg", 3) --> "adg"
```
### Problem 12
It's a nice day, and you're at the park and see two dogs, bulldog and lab.
The parameters bulldogGrowl and labGrowl indicates if each dog is growling.
Surrounding people are in a bit of trouble if both dogs are growling or if neither are growling but are in a stare down.

Return true if those people are in trouble.

Example:
```java
 dogTrouble(true, true) --> true
 dogTrouble(false, false) --> true
 dogTrouble(true, false) --> false
```
### Problem 13
We have a loud crying puppy in an apartment building. The "hour" parameter is the current hour time
in the range 0...23. We will get in trouble if the puppy is crying and the time is before 7 or after 20.

Return true if we will get in trouble based on if the puppy is crying during a specfic time of day.

Example:
```java
puppyCry(true, 6) --> true
puppyCry(true, 7) --> false
puppyCry(false, 6) --> false
```
### Problem 14
Looking at your math worksheet, your given 2 number values of either positive or negative.
Evaluate a problem and find out if one of those numbers is positive and the other is negative.

Return true if one is negative and one is positive.

An exception to this is if the parameter "negative" is true, then only return true if both are negative.

Example:
```java
checkPosOrNeg(1, -1, false) --> true
checkPosOrNeg(-1, 1, false) --> true
checkPosOrNeg(-4, -5, true) --> true
```
### Problem 15
With the provided string, you need to exchange the first and last characters to create a new string.

Return the new string.

Example:
```java
exchange("code") --> "eodc
exchange("a") --> "a"
exchange("ab") --> "ba"
```
### Problem 16
We are looking to write down a list of all possible numbers that can be a
multiple of 3 or 5.
You will be given any number, but to be put on the list the number has to be a non-negative number.

Return true if the given number can be added to the list.

Tip: Think about using the % "mod" operator

Example:
```java
multipleOf(3) --> true
multipleOf(10) --> true
multipleOf(8) --> false
```
### Problem 17
You are given two random temperatures from different states.
Between these two temperatures, we need to check if one state is freezing while the other is having an extreme hot day.
Both of these statements need to be true to prove that some states have extreme cases of temperatures.

Return true, if one temp is less than 0 and the other is greater than 100.

Example:
```java
checkTemp(120, -1) --> true
checkTemp(-1, 120) --> true
checkTemp(2, 120) --> false
```
### Problem 18
An upcoming artist's concert is coming to town.
The concert manager is only allowing one person of a pair to be a "teen".
Your at the front gate checking tickets and verifying ages.
You allowed to let a pair in as long as only one person is a teen but both can't be a "teen".
A "teen" is considered someone within the range of 13...19 inclusive.

Return true if one or the other person in the pair is a teen, but not both.

Example:
```java
oneTeen(13, 99) --> true
oneTeen(21, 19) --> true
oneTeen(13, 13) --> false
```
### Problem 19
We're on the look-out for ounces "oz" within a string. You will be given a string,
and you need to determine if the first two characters yields "oz".
We need you to return a new string made of the first 2 chars (if present).

Only include first char if it is 'o' and only include second char if it is 'z'.

Example:
```java
beginWithOz("ozymandias") --> "oz"
beginWithOz("bzoo") --> "z"
beginWithOz("oxx") --> "o"
```
### Problem 20
We are looking for numbers within two different ranges. You will be provided two numbers
and need to see if they are both in the range of 30...40 inclusive or 40...50 inclusive.
The numbers were looking for have to be within either one of those ranges.

Return true if both numbers are in the range 30...40, or both numbers are in the range 40...50.

Example:
```java
range3050(30, 31) --> true
range3050(30, 41) --> false
range3050(40, 50) --> true
```