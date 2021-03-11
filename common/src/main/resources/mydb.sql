create database mydb character set UTF8;

create table user(id int primary key auto_increment,name varchar(10),gender int,job varchar(10),city varchar(8),salary int,bonus int) auto_increment=1000;

insert into user values (null,'mack',1,'parogammer','wuhan',20000,90000);
insert into user values (null,'yack',1,'clerk','beijing',7000,50000);
insert into user values (null,'candy',0,'sales','beijing',10000,50000);
insert into user values (null,'tom',1,'sales','shenzhen',10000,50000);
insert into user values (null,'jimmy',1,'parogammer','hangzhou',30000,90000);
insert into user values (null,'sherry',0,'hr','beijing',10000,50000);
insert into user values (null,'sara',0,'hr','beijing',10000,50000);
insert into user values (null,'fisher',1,'parogammer','shenzhen',30000,80000);
insert into user values (null,'mika',0,'sales','hangzhou',20000,50000);
insert into user values (null,'mila',0,'clerk','shenzhen',8000,50000);
insert into user values (null,'sussie',0,'parogammer','hangzhou',10000,60000);
insert into user values (null,'sue',0,'sales','shenzhen',30000,50000);
insert into user values (null,'mary',0,'clerk','beijing',10000,30000);


create table usernotebook
(
  cid      varchar(32),
  uid      int,
  cname    varchar(32),
  content   text
)


