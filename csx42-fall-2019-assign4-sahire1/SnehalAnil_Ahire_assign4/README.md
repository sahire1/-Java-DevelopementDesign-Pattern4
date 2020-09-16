# CSX42: Assignment 4
## Name: Snehal Anil Ahire
-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in studentCoursePlanner/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile SnehalAnil_Ahire_assign4/troubleShootSearch/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile SnehalAnil_Ahire_assign4/troubleShootSearch/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile SnehalAnil_Ahire_assign4/troubleShootSearch/src/build.xml run -Darg0="technicalInfo.txt" -Darg1="userInfo.txt" -Darg2="synonyms.txt" -Darg3="output.txt"  


Note: Arguments accept the absolute path of the files.


-----------------------------------------------------------------------
## Description:
As mentioned by the professor in class, I have check naive stemming only on the basis of first three characters that should give a match.
I have implemented tree data structure as an element using "next" node and the data structure for line no of naice stemming is kept as arraylist as was in assignment4 page.
Order of input files is: 
technicalInfo.txt
userInfo.txt
synonyms.txt
output.txt

I have implemented 2 visitors that visit arraylist and tree respectively.
I am calling both using another class where I have declared their objects to work on.
I have implemented array of tree for encorporating different lines of input.


By using logger I couldnt print line numbers so I have put a System.out.println statement 

Cited Code:
Line number 21,70 in FileProcessor.java:
taken from link :https://www.journaldev.com/709/java-read-file-line-by-line

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating an official form will be
submitted to the Academic Honesty Committee of the Watson School to
determine the action that needs to be taken. "

Date: 11/17/2019

