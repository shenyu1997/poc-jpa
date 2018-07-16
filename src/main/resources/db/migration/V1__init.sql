create sequence hibernate_sequence start with 100000 increment by 1;

create table foo (
  id bigint not null,
  description varchar(255),
  name varchar(255),
  created_date bigint,
  modified_date bigint,
  version INT,
  primary key (id)
);

create table user_story (
  id bigint not null,
  description varchar(255),
  status integer,
  title varchar(255),
  primary key (id)
);