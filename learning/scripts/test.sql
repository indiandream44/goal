drop table student;
create table student (
     id varchar(10),
     name varchar(40) not null,
     age int(2),
     dob date,
     primary key (id)
);

insert into student values('0001', 'Nitin Upadhyay', 30, '1984-06-12');


select * from student;

drop table result;

create table result(
    id varchar(10) not null references student(id),
    year int(4),
    grade varchar(3),
    status boolean
);

insert into result values('0001',2004,'B',true);
insert into result values('0001',2005,'B+',true);
insert into result values('0001',2006,'C',false);

insert into result values('0002',2007,'A',true);
insert into result values('0002',2008,'A+',true);
insert into result values('0002',2009,'B',true);

// TOD: Employee, Training , Relational tables