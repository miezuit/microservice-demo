drop database if exists demo;
create database demo;
use demo;
create table hero (
    id int not null auto_increment primary key,
    name varchar(30) not null,
    power int not null,
    life int not null
);