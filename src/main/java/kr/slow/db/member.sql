-- mysql user
mysql -u slow -p 1234

-- show database
show databases;

-- create database;
create database mvc1;

-- use database;
use mvc1;

-- member table
create table member(
                       num int primary key auto_increment,
                       id varchar(20) not null,
                       pass varchar(20) not null,
                       name varchar(30) not null,
                       age int not null,
                       email varchar(30) not null,
                       phone varchar(30) not null
);

-- show tables;
show tables;

-- select
select * from member;

-- insert
insert into member(id, pass, name, age, email, phone)
values ('admin','admin','관리자',40,'slow@gmail.com','010-9670-2460');

-- update
update member set age=20, phone='010-0000-0000' where id='admin';

-- delete
delete from member where id='admin';
