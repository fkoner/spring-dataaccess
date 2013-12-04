insert into user(id,username,fullName,firstName,lastName) values (1,'user1','EDDU MELENDEZ','EDDU','MELENDEZ');
insert into user(id,username,fullName,firstName,lastName) values (2,'user2','JESUS ASCAMA','JESUS','ASCAMA');

insert into role(id,name) values (1,'role1');
insert into role(id,name) values (2,'role2');

insert into user_role(userId,roleId) values (1,1);
insert into user_role(userId,roleId) values (1,2);