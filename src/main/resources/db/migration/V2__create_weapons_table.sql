create table weapons
(
    id   bigserial
        constraint weapons_pk
            primary key,
    name varchar(255) not null,
    type varchar(255) not null
);

create unique index weapons_name_uindex
    on weapons (name);