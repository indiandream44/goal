yee' at line 1
mysql> drop table employee;
ERROR 1051 (42S02): Unknown table 'employee'
mysql> use employee
Database changed
mysql> use employee
Database changed
mysql> create table employee(employeeid varchar(5), employeename varchar(20), em
ployeeage int(2), employeesalary int(12));
Query OK, 0 rows affected (0.31 sec)

mysql> show tables;
+--------------------+
| Tables_in_employee |
+--------------------+
| employee           |
+--------------------+
1 row in set (0.03 sec)

mysql> select * from employee;
Empty set (0.05 sec)

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