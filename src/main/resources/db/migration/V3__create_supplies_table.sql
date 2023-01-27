create table supplies
(
    country_id bigint not null
        constraint supplies_countries_id_fk
            references countries
            on delete cascade,
    weapon_id  bigint not null
        constraint supplies_weapons_id_fk
            references weapons
            on delete cascade,
    amount     int    not null,
    constraint supplies_pk
        primary key (weapon_id, country_id)
);