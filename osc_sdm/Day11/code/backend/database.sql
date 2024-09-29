create database mydb;
use mydb;

create table user(
    id integer primary key auto_increment,
    firstName varchar(100),
    lastName varchar(100),
    email varchar(100),
    password varchar(100)
);