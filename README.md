# StudentScoresInFile

In Competency Exercises, you demonstrate your skill and ability to use the programming principles you've learned in the current and previous modules. You must complete this assignment by yourself, much like a module exam. You can ask instructors for clarification about the project -- you can not ask instructors or other students for help with logic or coding. If you are struggling with the project, you can look at previous assignments where you did similar work, and you can review the pertinent sections in the book.

 

Write unit tests to validate the calculated numbers in the project, low score, high score, and average score. Include at least 5 data sets in the unit tests. Take screenshots of the successful unit tests.

 

Module 3 Competency Project: Student Scores in a File

Using the java.io.* library for stream file processing, write an application that does 3 things: it asks the user for input of names and scores and writes that data to a file, with a name on one line and the score on the next; it reads that same data file and prints the data; and it finds the low, high, and average of the scores. After the file has been read, calculate and display the lowest score, highest score, and average score.

Here is the sample session:

![example](https://github.com/bell-kevin/StudentScoresInFile/blob/main/m3-2220-studentScores.PNG)

Note: You cannot determine the low and high scores and calculate the average in the first part of the project, when the user types the input and you write it to the file. This work must be done in the second part, when you are reading the file.

Hint: Since you know the first line contains a name, and the second line contains a score, you need to handle the even and odd lines differently. Only do the mathematical work when the line contains a score. Use a counter to count the lines read from the file to help you determine how to process that line.

Run the project once to match the sample session and take a screenshot. Run it again with different data and take a screenshot.

 # Output
 
 ![output](https://github.com/bell-kevin/StudentScoresInFile/blob/main/sendHelp.PNG)

Submission: the specified screenshots (of execution of the program and successful unit tests) and the root folder for the project

 

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](https://bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
email me at **bellKevin@pm.me** for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
