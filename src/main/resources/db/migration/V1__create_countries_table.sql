create table countries
(
    id                 bigserial
        constraint countries_pk
            primary key,
    name               varchar(255) not null,
    minister           varchar(255) not null,
    ukrainians_opinion varchar(255) not null
);

create unique index countries_minister_uindex
    on countries (minister);

create unique index countries_name_uindex
    on countries (name);