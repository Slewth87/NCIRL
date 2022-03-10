-- 1.	Change all students in year one of any course to year two.
UPDATE students SET year = 2 WHERE courseCode = "LAW204" AND year = 1;
-- 2.	Modify the status of any student in year 4 of all courses to indicate that they have now completed the course.
UPDATE students SET year = "Complete" WHERE year = 4;
-- 3.	Delete all students who have outstanding fees which have not been paid for more than 6 months.
DELETE FROM students WHERE outstandingFees > 0 AND lastPayment < NOW() - INTERVAL 6 MONTH;
-- 4.	Display the first name surname and grade of all students sorting the results so the highest grades are first.
SELECT fName, lName, yr1Grade, yr2Grade, yr3Grade, yr4Grade,
            ((( CASE WHEN (yr1Grade IS NOT NULL) THEN yr1Grade ELSE 0 END ) +
            ( CASE WHEN (yr2Grade IS NOT NULL) THEN yr2Grade ELSE 0 END ) +
            ( CASE WHEN (yr3Grade IS NOT NULL) THEN yr3Grade ELSE 0 END ) +
            ( CASE WHEN (yr4Grade IS NOT NULL) THEN yr4Grade ELSE 0 END ))
            /
            (( CASE WHEN (yr1Grade IS NOT NULL) THEN 1 ELSE 1 END ) +
            ( CASE WHEN (yr2Grade IS NOT NULL) THEN 1 ELSE 0 END ) +
            ( CASE WHEN (yr3Grade IS NOT NULL) THEN 1 ELSE 0 END ) +
            ( CASE WHEN (yr4Grade IS NOT NULL) THEN 1 ELSE 0 END )))
        AS avGrade
    FROM students
    ORDER BY avGrade DESC;
-- 5.	Add one new record to each table.
INSERT INTO staff(staffID,fName,lName,streetAddress,area,county,email,phone,deptID,years,ptoTaken,position)
    VALUES
        ("NC0193","Aloysius","DeHaan","68 The Rise","Coolock","Dublin","adehaan@cbc.ca","+353 87 549 6758",NULL,0,0,"Department Head");
INSERT INTO department(deptID,deptName,phone,opening,head,active)
    VALUES
        ("THE","Theatre","+353 1 675 5647","9-5","NC0193","Yes");
UPDATE staff SET deptID = "THE" WHERE staffID = "NC0193";
INSERT INTO courses(courseCode,courseName,qqi,award,cost,semesters,deptID,years,delivery,coordinator)
    VALUES
        ("THE002","Theatre Studies",6,"Higher Certificate",200,1,"THE",1,"Online","NC0193");
INSERT INTO students(studentID,fName,lName,streetAddress,area,county,email,phone,courseCode,yr1Grade,yr2Grade,yr3Grade,yr4Grade,year,lastPayment,outstandingFees)
    VALUES
        ("S0001045","Consuela","DeVries","78 The Dip","Ballymun","Dublin","cdevries@zimbio.com","+353 1 234 5461","THE002",NULL,NULL,NULL,NULL,"1","2021-02-28",150.3);
-- 6.	Delete one record from all tables.
DELETE FROM students WHERE studentID = "S0001045";
DELETE FROM courses WHERE courseCode = "THE002";
DELETE FROM department WHERE deptID = "THE";
DELETE FROM staff WHERE staffID = "NC0193";
-- 7.	Find the total number of days off for all staff, order this by least days off.
SELECT SUM(ptoTaken) AS ptoTotal FROM staff;
SELECT staffID, ptoTaken FROM staff ORDER BY ptoTaken ASC;
-- 8.	Count how many students are doing a business course.
SELECT COUNT(*) AS busStudents FROM students WHERE courseCode IN (SELECT courseCode FROM courses WHERE deptID = "BUS");
-- 9.	Change the roll of all staff who have a job title Office worker to Administrator.
UPDATE staff SET position = "Administrator" WHERE position = "Office Worker";
-- 10.	Change all courses entitled PHD to Doctorial.
UPDATE courses SET award = "Doctorial" WHERE award = "Ph.D";
-- 11.	Set the delivery method of all courses to online.
UPDATE courses SET delivery = "Online";
-- 12.	Update the opening times of the college to say closed to visitors.
ALTER TABLE department MODIFY opening varchar(20);
UPDATE department SET opening = "Closed to Visitors";
-- 13.	Drop all information contained in the courses relation.
    -- First need to identify and remove Foreign Key constraints.
SELECT TABLE_NAME, CONSTRAINT_NAME FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE WHERE REFERENCED_TABLE_NAME = "courses";
    -- Based on the result of this query:
ALTER TABLE students DROP FOREIGN KEY students_ibfk_1;
DELETE FROM courses;
-- 14.	Delete all courses from the database with an academic level of 6 or less.
DELETE FROM courses WHERE qqi <= 6;
-- 15.	Set the college phone number to be 01-7654321.
UPDATE department SET phone = "01-7654321" WHERE deptID = "ADM";
-- 16.	Set the dean of the college to be called Michael Dean.
UPDATE staff SET fName = "Michael", lName = "Dean" WHERE position = "Dean";
-- 17.	Show all staff members who have been working there for longer than 4 years.
SELECT staffID, fName, lName, years FROM staff WHERE years > 4;
-- 18.	Show all courses that the college offers which run over 3 semesters and have a minimum of 20 participants per class.
CREATE VIEW classSize AS SELECT courseCode, COUNT(*) AS size FROM students GROUP BY courseCode;
SELECT c.*, s.size
    FROM courses c
    JOIN classSize s
        ON c.courseCode = s.courseCode
        AND c.semesters = 3
        AND s.size >= 20;
-- 19.	Identify how many  students have the word road in their address.
SELECT COUNT(*) AS roadAddresses FROM students WHERE streetAddress LIKE "%Road%" OR area LIKE "%Road%";
-- 20.	Create a view that will show the result of a query drawing information from three tables at once.
CREATE VIEW classScore
    AS SELECT c.courseName, stu.studentID, stu.yr1Grade, sta.lName AS coordinator
        FROM courses c
            LEFT JOIN students stu
            ON c.courseCode = stu.courseCode
            LEFT JOIN staff sta
            ON c.coordinator = sta.staffID
        WHERE stu.yr1Grade IS NOT NULL
        AND stu.year = 2;
SELECT * FROM classScore;