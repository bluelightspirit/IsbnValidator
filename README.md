# IsbnValidator

## A Java tool that uses the terminal and helps anyone find out if any ISBN they want to check is valid or not

## How does anyone use the tool?

Anyone should be aiming to see the tool that looks like this:
![image](https://user-images.githubusercontent.com/22280271/213872502-7175d1a3-f9b9-469e-a361-7572a7289475.png)

First, [IsbnValidator.java](https://github.com/bluelightspirit/IsbnValidator/blob/main/IsbnValidator.java) must be downloaded. To do that, it is suggested to download the ZIP file from [Releases](https://github.com/bluelightspirit/IsbnValidator/releases/tag/v1.0.0) or copy the repo from a console like Git. Then, [IsbnValidator.java](https://github.com/bluelightspirit/IsbnValidator/blob/main/IsbnValidator.java) should be compiled. After that, [IsbnValidator.java](https://github.com/bluelightspirit/IsbnValidator/blob/main/IsbnValidator.java)'s main method should be ran suing any IDE that supports Java such as [IntelliJ](https://www.jetbrains.com/idea/download/) or [BlueJ](https://www.bluej.org/).

Then, the user should enter in a number to see if the number is a valid ISBN number or not. The purpose of doing this is to determine if a book has a real ISBN. ISBN stands for International Standard Book Number.

After that, they should see something like this:\
![image](https://user-images.githubusercontent.com/22280271/213872750-f608703a-6477-4754-9eac-8d803a9396ff.png)

In this example, 1231231231 is not a valid ISBN number, because it does not match the formula where a real ISBN is made from.

## How does it work?

The tool works by:
1) Scanning for user input for an ISBN number.
2) Checks if the user input contains only numbers.
3) Checks if the user input is equal to 10 or 13.
4) Performing a checksum algorithm by using certain modulos depending on the length of the user ISBN input (10 or 13).
5) Outputting to the user if the number inputted by the user is a valid ISBN or not.

## What did I learn?

1) How to use a scanner to check for user input.
2) How to use Integer.parseInt().

## Compiling

This program uses solely Java to compile.
