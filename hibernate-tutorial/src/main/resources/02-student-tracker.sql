create database hb_student_tracker;

drop table if exists student;

create table student (
                         id serial not null,
                         first_name varchar(45) default null,
                         last_name varchar(45) default null,
                         email varchar(45) default null,
                         primary key (id)
);