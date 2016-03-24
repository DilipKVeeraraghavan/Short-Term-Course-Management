S.V.Dilip Kumar
14CS30030	
Assignment - 2

(Assignment Done Using NetBeans IDE )
(Custom Theme JTattoo has been applied please remove if problematic)




Swing STCM 

1. At the start there are two options available 
	i. You could either overwrite everything present in the saved file (output.txt) by creating a new course OR
	ii. You could continue your work by clicking the button (Read From File) or from the menu bar and continue adding courses.

2. Please read from the file ONLY ONCE , multiple read from file calls by clicking the button again and again could lead to duplication.

3. The menu bar has all the functions such as read,add course/participant/instructor/alter details /delete details.

4. THere are three frames 
	i . Create Course Frame(Main).
	ii. Alter Course Details , Add /Delete participants/Ins/Course.
	iii. Display Frame to display according to user's wish.

5. Click on X could close the program, so always use File->Exit for closing that particular Frame.

6. While Creating a course create the Course CoOrd before creating the instructors,Participants since CourseCoOrd creation intializes the course 
   so creating instructor before could lead to null point exception.

7. Tool Bar provides quickacccess to read from file, create Course, create Participant, create Instructor.

8. Course Date cannot be changed once set because it could cause problems to the 5 year criteria.

9. Modifying all the details can be done by entering the course Name but to modify the participant or instructor , you have to provide the participant
   or instructor name.

10.Adding a new Participant or instructor is advisable to do through menu bar instead of switching Tabs.

11.A Frame has multiple tabs, you could switch between tabs for ease of access.

12.While deleting a course /participant/instructor check only one checkbox in the table provided for a deletion. Please avoid multipe deleetions at the same time.

13. Cancel Buttons have been included in all the frames but coding seemed to make it messier so you could just choose File->Exit to close that particular frame 
    which does the same thing.

14.Auto Save has been implemented.

15.Look out for Red Text Border incase of incorrect input.


FORMAT

Numbers - 0 to 9

Email - example@gmail.com
  