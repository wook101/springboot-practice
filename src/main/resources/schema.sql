drop table if exists cartoons;

create table cartoons(
     id bigint not null auto_increment,
     title varchar(30) not null,
     artistName varchar (10) not null,
     weekday bigint not null,
     genre enum ('OMNIBUS','STORY','FANTASY','SPORTS','ETC'),
     finished varchar(10) not null,
     createAt varchar(20) not null,
     primary key(id)
);