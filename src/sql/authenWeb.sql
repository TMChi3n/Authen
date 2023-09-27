create database authen_web;
use authen_web;

create table account (
	id int primary key not null,
    userName nvarchar(255) not null,
    email nvarchar(255) not null,
    password varchar(16) not null
);


