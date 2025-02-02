REM   Script: Activity7
REM   SQL Activity7

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT DISTINCT salesman_id 
from orders;

SELECT * 
FROM orders 
ORDER BY ASC date;

SELECT * 
FROM orders 
ORDER BY ASC date;

SELECT * 
FROM orders 
ORDER BY ASC date;

SELECT * 
FROM orders 
ORDER BY ASC date;

SELECT * 
FROM orders 
ORDER BY date;

SELECT * 
FROM orders;

SELECT * 
FROM orders 
ORDER BY order_date;

SELECT * 
FROM orders 
ORDER BY DSC order_no;

SELECT * 
FROM orders 
ORDER BY DSC order_no;

SELECT * 
FROM orders 
ORDER BY order_no;

SELECT * 
FROM orders 
ORDER BY DESC order_no;

SELECT * 
FROM orders 
ORDER BY order_no DESC;

SELECT * 
FROM orders 
WHERE purchase_amount<500;

SELECT * 
FROM orders 
WHERE purchase_amount BETWEEN(1000, 2000);

SELECT * 
FROM orders 
WHERE purchase_amount>1000 and purchase_amount<2000;

SELECT * 
FROM orders 
WHERE purchase_amount BETWEEN 1000 and 2000;

SELECT sum(purchase_amount) 
FROM orders;

SELECT avg(purchase_amount) 
FROM orders;

SELECT max(purchase_amount) 
FROM orders;

SELECT min(purchase_amount) 
FROM orders;

SELECT count(salesmen_id) 
FROM orders;

SELECT count(salesman_id) 
FROM orders;

SELECT count(DISTINCT salesman_id) 
FROM orders;

