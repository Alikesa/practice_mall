-- auto-generated definition
create table system_user
(
    id        bigint auto_increment
        primary key,
    user_name varchar(255) not null,
    pwd       varchar(255) not null,
    nick_name varchar(255) not null
);

