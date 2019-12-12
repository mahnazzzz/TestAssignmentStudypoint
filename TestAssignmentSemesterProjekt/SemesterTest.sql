drop schema if exists SemesterTest;
create schema SemesterTest;
use SemesterTest;

create table User(
id int NOT NULL AUTO_INCREMENT,
userName varchar(50),
password varchar(100),
who varchar(45),
primary key (id)
);

create table Semester(
id int NOT NULL AUTO_INCREMENT,
name varchar(45),
startDate varchar(45),
primary key (id)
);


create table Teacher(
id int NOT NULL AUTO_INCREMENT,
userId int,
semesterId int,
education varchar(100),
lastActive varchar(100),
currentDate varchar(100),
primary key (id),
FOREIGN KEY (userId) REFERENCES User(id),
FOREIGN KEY (semesterId) REFERENCES Semester(id)
);


create table Course(
id int NOT NULL AUTO_INCREMENT,
teacherId int,
semesterId int,
primary key (id),
FOREIGN KEY (teacherId) REFERENCES Teacher(id),
FOREIGN KEY (semesterId) REFERENCES Semester(id),
subject varchar(45)
);

create table Student(
id int NOT NULL AUTO_INCREMENT,
userId int,
courseId int,
age int,
primary key (id),
FOREIGN KEY (userId) REFERENCES User(id),
FOREIGN KEY (courseID) REFERENCES Course(id)
);


insert into User(userName,password,who)values('Alis','111','Student');
insert into User(userName,password,who)values('Olic','111','Student');
insert into User(userName,password,who)values('simon','111','Student');
insert into User(userName,password,who)values('David','111','Student');
insert into User(userName,password,who)values('HAsan','111','Student');
insert into User(userName,password,who)values('Ole','111','Student');
insert into User(userName,password,who)values('Hayat','111','Student');
insert into User(userName,password,who)values('Halom','111','Student');
insert into User(userName,password,who)values('dai','111','Student');
insert into User(userName,password,who)values('Peter','111','Student');
insert into User(userName,password,who)values('Sajod','111','Teacher');
insert into User(userName,password,who)values('Sim','111','Teacher');

insert into Semester(id,name, startDate)values(1,'Spring Semester', '2018-01-01');
insert into Semester(id,name, startDate)values(2,'Winter Semester', '2019-02-01');
insert into Semester(id,name, startDate)values(3,'Winter Semester', '2018-03-01');


insert into Teacher(userId,semesterId,education,lastActive,currentDate)values(6, 1, 'Computer Science degree','2019-01-01' ,'2018-11-15');
insert into Teacher(userId,semesterId,education,lastActive,currentDate)values(7, 2, 'football course','2016-01-01' ,'2019-06-15');


insert into Course(teacherId, semesterId, subject)values(1, 2, 'football course');
insert into Course(teacherId, semesterId, subject)values(2, 2, 'football course');


insert into Student(userId,courseId,age)values(6,1, 18);
insert into Student(userId,courseId,age)values(7,1, 44);
insert into Student(userId,courseId,age)values(8,1, 28);
insert into Student(userId,courseId,age)values(9,1, 90);
insert into Student(userId,courseId,age)values(10,2, 80);
insert into Student(userId,courseId,age)values(11,2, 88);
insert into Student(userId,courseId,age)values(12,2, 99);
