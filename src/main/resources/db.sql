created database challengeweb;
create table message
(
    id           int primary key auto_increment comment '本表的主键',
    ip           varchar(200)  not null comment '所留言的人的ip地址',
    created_time timestamp     not null comment '留言创建时间',
    name         varchar(300)   not null comment '留言者的昵称',
    contract     varchar(1000)  not null comment '留言者的联系方式',
    message      varchar(10000) not null comment '留言者的留言内容'
);

insert into message(ip,created_time,name,contract,message) value ('127.0.0.1',now(),'路人1','example@qq.com','这是第一条留言,测试用');

# 创建用户来连接该数据库
CREATE USER 'webadmin'@'%' IDENTIFIED BY '@qDiw5B9';
# 赋予该用户相应数据库的权限
GRANT INSERT ON challengeweb.message TO 'webadmin'@'%';