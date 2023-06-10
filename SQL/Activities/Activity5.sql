CREATE TABLE salesman( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
    commission int 
);

DESCRIBE salesman


CREATE TABLE salesman( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
    commission int 
);

DESCRIBE salesman


INSERT ALL INTO salesman VALUES (5001, 'James Hoog', 'New York', 15) 
	INTO salesman VALUES(5002, 'Nail Knite','Paris',13) 
	INTO salesman VALUES(5005, 'Pit Alex', 'London',11) 
    INTO salesman VALUES(5006, 'McLyon','Paris',14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT * from DUAL;

DROP table salesman


CREATE TABLE salesman( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
    commission int 
);

DESCRIBE salesman


INSERT ALL INTO salesman VALUES (5001, 'James Hoog', 'New York', 15) 
	INTO salesman VALUES(5002, 'Nail Knite','Paris',13) 
	INTO salesman VALUES(5005, 'Pit Alex', 'London',11) 
    INTO salesman VALUES(5006, 'McLyon','Paris',14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT * from DUAL;

DROP table salesman


CREATE TABLE salesman( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
    commission int 
);

DESCRIBE salesman


INSERT ALL INTO salesman VALUES (5001, 'James Hoog', 'New York', 15) 
	INTO salesman VALUES(5002, 'Nail Knite','Paris',13) 
	INTO salesman VALUES(5005, 'Pit Alex', 'London',11) 
    INTO salesman VALUES(5006, 'McLyon','Paris',14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT * from DUAL;

SELECT salesman_id, salesman_city 
FROM salesman;

SELECT * 
FROM salesman_city = 'Paris';

SELECT salesman_id, commission 
FROM salesman_name = 'Paul Adam';

DROP table salesman


CREATE TABLE salesman( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
    commission int 
);

DESCRIBE salesman


INSERT ALL INTO salesman VALUES (5001, 'James Hoog', 'New York', 15) 
	INTO salesman VALUES(5002, 'Nail Knite','Paris',13) 
	INTO salesman VALUES(5005, 'Pit Alex', 'London',11) 
    INTO salesman VALUES(5006, 'McLyon','Paris',14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT * from DUAL;

SELECT salesman_id, salesman_city 
FROM salesman;

SELECT * 
FROM salesman 
WHERE salesman_city = 'Paris';

SELECT salesman_id, commission 
FROM salesman 
WHERE salesman_name = 'Paul Adam';

DROP table salesman


CREATE TABLE salesman( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
    commission int 
);

DESCRIBE salesman


INSERT ALL INTO salesman VALUES (5001, 'James Hoog', 'New York', 15) 
	INTO salesman VALUES(5002, 'Nail Knite','Paris',13) 
	INTO salesman VALUES(5005, 'Pit Alex', 'London',11) 
    INTO salesman VALUES(5006, 'McLyon','Paris',14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT * from DUAL;

ALTER TABLE salesman ADD(grade int);

UPDATE salesman SET grade = 100;

DROP table salesman


CREATE TABLE salesman( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
    commission int 
);

DESCRIBE salesman


INSERT ALL INTO salesman VALUES (5001, 'James Hoog', 'New York', 15) 
	INTO salesman VALUES(5002, 'Nail Knite','Paris',13) 
	INTO salesman VALUES(5005, 'Pit Alex', 'London',11) 
    INTO salesman VALUES(5006, 'McLyon','Paris',14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT * from DUAL;

UPDATE salesman SET grade=200 
WHERE salesman_name = 'Rome';

UPDATE salesman SET grade=300 
WHERE salesman_name = 'James';

UPDATE salesman SET salesman_name = 'Pierre' 
WHERE salesman_name = 'McLyon';

DROP table salesman


CREATE TABLE salesman( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
    commission int 
);

DESCRIBE salesman


INSERT ALL INTO salesman VALUES (5001, 'James Hoog', 'New York', 15) 
	INTO salesman VALUES(5002, 'Nail Knite','Paris',13) 
	INTO salesman VALUES(5005, 'Pit Alex', 'London',11) 
    INTO salesman VALUES(5006, 'McLyon','Paris',14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT * from DUAL;

ALTER TABLE salesman ADD(grade int);

UPDATE salesman SET grade = 100;

UPDATE salesman SET grade=200 
WHERE salesman_name = 'Rome';

UPDATE salesman SET grade=300 
WHERE salesman_name = 'James';

UPDATE salesman SET salesman_name = 'Pierre' 
WHERE salesman_name = 'McLyon';

