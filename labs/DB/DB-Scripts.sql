show databases;
use jdbctraining;

CREATE TABLE employee (id int NOT NULL auto_increment, name varchar(255), age int, department varchar(255), designation varchar(255), country varchar(100), primary key(id));

INSERT INTO employee(name, age, department, designation, country) values("kumar",30, "IT", "Manager", "India");
INSERT INTO employee values("kumar",30, "IT", "Manager", "India");
SELECT * FROM employee;