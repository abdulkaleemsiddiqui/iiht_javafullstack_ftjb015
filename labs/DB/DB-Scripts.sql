show databases;
use jdbctraining;

CREATE TABLE employee (
 id int NOT NULL auto_increment,
 name varchar(255),
 age int,
 department varchar(255),
 designation varchar(255),
 country varchar(100),
 primary key(id)
);

describe employee;

INSERT INTO employee(name, age, department, designation, country) values("kumar",30, "IT", "Manager", "India");
#INSERT INTO employee values("kumar",30, "IT", "Manager", "India");
INSERT INTO employee(name, age, department, designation, country) values("anand",35, "Admin", "Lead", "India");
INSERT INTO employee(name, age, department, designation, country) values("anil",40, "Operations", "Manager", "India");
INSERT INTO employee(name, age, department, designation, country) values("zahoor",35, "Admin", "Executive", "India");

SELECT * FROM employee;
SELECT id, name, age FROM employee;
SELECT id, name, age, designation FROM employee WHERE age >= 35 AND department='Admin' ORDER BY name;

UPDATE employee SET designation='Manager' WHERE id=4;

DELETE FROM employee where id=4;

#TRUNCATE employee;