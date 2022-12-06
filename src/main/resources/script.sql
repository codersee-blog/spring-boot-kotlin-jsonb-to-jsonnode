create table some_table(
    id serial not null primary key,
    string_column text not null,
    integer_column smallint not null,
    jsonb_column jsonb not null
);

insert into some_table(string_column, integer_column, jsonb_column)
values
    ('value-1', 1, '{ "some_field": "some_value"}'),
    ('value-2', 2, '{ "another_field": "some_value_2"}');