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