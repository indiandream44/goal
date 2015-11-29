
insert into employeetranning values('0002','2007','A++','civilengg');
insert into result values('0002',2008,'A+',true);
insert into result values('0002',2009,'B',true);


insert into employeetranning values('12365','2007','A++','civilengg');

insert into employeetranning values('12366','2003','B++','ECengg');
 

insert into employeetranning values('12367','2007','A++','itengg');



Select*from employee;
mysql> describe employee;
+----------------+-------------+------+-----+---------+-------+
| Field          | Type        | Null | Key | Default | Extra |
+----------------+-------------+------+-----+---------+-------+
| employeeid     | varchar(5)  | YES  |     | NULL    |       |
| employeename   | varchar(20) | YES  |     | NULL    |       |
| employeeage    | int(2)      | YES  |     | NULL    |       |
| employeesalary | int(12)     | YES  |     | NULL    |       |
+----------------+-------------+------+-----+---------+-------+
4 rows in set (0.23 sec)

mysql> insert into employee values('12365', 'Mohan', 28, 20000);
Query OK, 1 row affected (0.14 sec)

mysql> insert into employee values('12366', 'Ashok', 30, 15000);
Query OK, 1 row affected (0.16 sec)

mysql> insert into employee values('12367', 'Aman', 22, 18000);
Query OK, 1 row affected (0.11 sec)

mysql> insert into employee values('12368', 'Ankit', 25, 15000);
Query OK, 1 row affected (0.17 sec)

mysql> insert into employee values('12369', 'Mayank', 26, 20000);
Query OK, 1 row affected (0.06 sec)

mysql> insert into employee values('12370', 'Rahul', 26, 17000);
Query OK, 1 row affected (0.05 sec)

mysql> select * from employee;
+------------+--------------+-------------+----------------+
| employeeid | employeename | employeeage | employeesalary |
+------------+--------------+-------------+----------------+
| 12365      | Mohan        |          28 |          20000 |
| 12366      | Ashok        |          30 |          15000 |
| 12367      | Aman         |          22 |          18000 |
| 12368      | Ankit        |          25 |          15000 |
| 12369      | Mayank       |          26 |          20000 |
| 12370      | Rahul        |          26 |          17000 |
+------------+--------------+-------------+----------------+
6 rows in set (0.00 sec)

mysql> select * from employee order by name;
ERROR 1054 (42S22): Unknown column 'name' in 'order clause'
mysql> select * from employee order by age;
ERROR 1054 (42S22): Unknown column 'age' in 'order clause'
mysql> select * from employee order by employeeage;
+------------+--------------+-------------+----------------+
| employeeid | employeename | employeeage | employeesalary |
+------------+--------------+-------------+----------------+
| 12367      | Aman         |          22 |          18000 |
| 12368      | Ankit        |          25 |          15000 |
| 12369      | Mayank       |          26 |          20000 |
| 12370      | Rahul        |          26 |          17000 |
| 12365      | Mohan        |          28 |          20000 |
| 12366      | Ashok        |          30 |          15000 |
+------------+--------------+-------------+----------------+
6 rows in set (0.11 sec)

mysql> select * from employee order by employeeage, name;
ERROR 1054 (42S22): Unknown column 'name' in 'order clause'
mysql> select * from employee order by employeeage, employee name;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near 'name'
 at line 1
mysql> select * from employee order by employeeage, employeename;
+------------+--------------+-------------+----------------+
| employeeid | employeename | employeeage | employeesalary |
+------------+--------------+-------------+----------------+
| 12367      | Aman         |          22 |          18000 |
| 12368      | Ankit        |          25 |          15000 |
| 12369      | Mayank       |          26 |          20000 |
| 12370      | Rahul        |          26 |          17000 |
| 12365      | Mohan        |          28 |          20000 |
| 12366      | Ashok        |          30 |          15000 |
+------------+--------------+-------------+----------------+
6 rows in set (0.00 sec)

mysql> select * from employee order by employeesalary, employeename;
+------------+--------------+-------------+----------------+
| employeeid | employeename | employeeage | employeesalary |
+------------+--------------+-------------+----------------+
| 12368      | Ankit        |          25 |          15000 |
| 12366      | Ashok        |          30 |          15000 |
| 12370      | Rahul        |          26 |          17000 |
| 12367      | Aman         |          22 |          18000 |
| 12369      | Mayank       |          26 |          20000 |
| 12365      | Mohan        |          28 |          20000 |
+------------+--------------+-------------+----------------+
6 rows in set (0.00 sec)

mysql> select avg(employeesalary);
ERROR 1054 (42S22): Unknown column 'employeesalary' in 'field list'
mysql> select avg(employeesalary) from employee;
+---------------------+
| avg(employeesalary) |
+---------------------+
|          17500.0000 |
+---------------------+
1 row in set (0.08 sec)

mysql> select sum(employeesalary) from employee;
+---------------------+
| sum(employeesalary) |
+---------------------+
|              105000 |
+---------------------+
1 row in set (0.00 sec)

mysql> alter table employee add column (employeework varchar(20) default 'constr
uction' );
Query OK, 6 rows affected (0.42 sec)
Records: 6  Duplicates: 0  Warnings: 0

mysql> select * from employee
    -> select * from employee
    -> select * from student LIMIT 5;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near 'selec
t * from employee
select * from student LIMIT 5' at line 2
mysql> alter table employee add column (employeework varchar(20)  default 'const
ruction');
ERROR 1060 (42S21): Duplicate column name 'employeework'
mysql> select * from employee;
+------------+--------------+-------------+----------------+--------------+
| employeeid | employeename | employeeage | employeesalary | employeework |
+------------+--------------+-------------+----------------+--------------+
| 12365      | Mohan        |          28 |          20000 | construction |
| 12366      | Ashok        |          30 |          15000 | construction |
| 12367      | Aman         |          22 |          18000 | construction |
| 12368      | Ankit        |          25 |          15000 | construction |
| 12369      | Mayank       |          26 |          20000 | construction |
| 12370      | Rahul        |          26 |          17000 | construction |
+------------+--------------+-------------+----------------+--------------+
6 rows in set (0.00 sec)
mysql>
mysql> use employee
Database changed
mysql> describe employee
    -> ;
+----------------+-------------+------+-----+--------------+-------+
| Field          | Type        | Null | Key | Default      | Extra |
+----------------+-------------+------+-----+--------------+-------+
| employeeid     | varchar(5)  | YES  |     | NULL         |       |
| employeename   | varchar(20) | YES  |     | NULL         |       |
| employeeage    | int(2)      | YES  |     | NULL         |       |
| employeesalary | int(12)     | YES  |     | NULL         |       |
| employeework   | varchar(20) | YES  |     | construction |       |
+----------------+-------------+------+-----+--------------+-------+
5 rows in set (0.27 sec)

mysql> select*from employee
    -> ;
+------------+--------------+-------------+----------------+--------------+
| employeeid | employeename | employeeage | employeesalary | employeework |
+------------+--------------+-------------+----------------+--------------+
| 12365      | Mohan        |          28 |          20000 | construction |
| 12366      | Ashok        |          30 |          15000 | construction |
| 12367      | Aman         |          22 |          18000 | construction |
| 12368      | Ankit        |          25 |          15000 | construction |
| 12369      | Mayank       |          26 |          20000 | construction |
| 12370      | Rahul        |          26 |          17000 | construction |
+------------+--------------+-------------+----------------+--------------+
6 rows in set (0.13 sec)

mysql> select*from employee where age=22;
ERROR 1054 (42S22): Unknown column 'age' in 'where clause'
mysql> select*from employee where employeeage=22;
+------------+--------------+-------------+----------------+--------------+
| employeeid | employeename | employeeage | employeesalary | employeework |
+------------+--------------+-------------+----------------+--------------+
| 12367      | Aman         |          22 |          18000 | construction |
+------------+--------------+-------------+----------------+--------------+
1 row in set (0.07 sec)

mysql> select*from employee where employeeage=27;
Empty set (0.00 sec)

mysql> use employee;
Database changed
mysql> create table employee tranning;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual t
corresponds to your MySQL server version for the right syntax to use near 't
ing' at line 1
mysql> create table employeetranning(employeeid varchar(5), year varchar(4),
oyeegrade varchar(3),trainningfeild varchar(10) );
Query OK, 0 rows affected (1.28 sec)

mysql>
mysql> insert into employeetranning values('0002','2007','A++','civilengg');
Query OK, 1 row affected (0.20 sec)

mysql> insert into employeetranning values('12365','2007','A++','civilengg')
Query OK, 1 row affected (0.09 sec)

mysql> insert into employeetranning values('12366','2003','B++','mechanicale
);
ERROR 1406 (22001): Data too long for column 'trainningfeild' at row 1
mysql>  insert into employeetranning values('12367','2007','A++','softwarele
);
ERROR 1406 (22001): Data too long for column 'trainningfeild' at row 1
mysql> insert into employeetranning values('12367','2007','A++','itengg');
Query OK, 1 row affected (0.09 sec)

mysql> insert into employeetranning values('12366','2003','B++','Electricale
);
ERROR 1406 (22001): Data too long for column 'trainningfeild' at row 1
mysql> insert into employeetranning values('12366','2003','B++','ECengg');
Query OK, 1 row affected (0.09 sec)

mysql> select * from employee limit 2;
+------------+--------------+-------------+----------------+--------------+
| employeeid | employeename | employeeage | employeesalary | employeework |
+------------+--------------+-------------+----------------+--------------+
| 12365      | Mohan        |          28 |          20000 | construction |
| 12366      | Ashok        |          30 |          15000 | construction |
+------------+--------------+-------------+----------------+--------------+
2 rows in set (0.28 sec)

mysql> select * from employee limit 2,7;
+------------+--------------+-------------+----------------+--------------+
| employeeid | employeename | employeeage | employeesalary | employeework |
+------------+--------------+-------------+----------------+--------------+
| 12367      | Aman         |          22 |          18000 | construction |
| 12368      | Ankit        |          25 |          15000 | construction |
| 12369      | Mayank       |          26 |          20000 | construction |
| 12370      | Rahul        |          26 |          17000 | construction |
+------------+--------------+-------------+----------------+--------------+
4 rows in set (0.07 sec)

mysql> select employeename as EmployeeName from employee;
+--------------+
| EmployeeName |
+--------------+
| Mohan        |
| Ashok        |
| Aman         |
| Ankit        |
| Mayank       |
| Rahul        |
+--------------+
6 rows in set (0.10 sec)

mysql> select employeename as Name,employeeage as Age from employee;
+--------+------+
| Name   | Age  |
+--------+------+
| Mohan  |   28 |
| Ashok  |   30 |
| Aman   |   22 |
| Ankit  |   25 |
| Mayank |   26 |
| Rahul  |   26 |
+--------+------+
6 rows in set (0.07 sec)

mysql>



