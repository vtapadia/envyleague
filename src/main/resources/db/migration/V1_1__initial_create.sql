create table nvl_team (
  id Number(5,0) primary key ,
  name varchar2(50)
);

create table nvl_user (
  email varchar2(100) primary key,
  name varchar2(100)
);

create table nvl_league (
  id Number(5,0) primary key ,
  owner varchar2(100),
  buy_in Number(5,0)
);

create table nvl_match (
  id NUMBER(5,0) primary key ,
  team_a NUMBER(5,0),
  team_b NUMBER(5,0),
  match_date_time timestamp,
  match_stage varchar2(50),
  team_a_score int ,
  team_b_score int ,
  team_a_penalty_score int ,
  team_b_penalty_score int
);

create table nvl_prediction (
  id NUMBER(10,0) primary key ,
  league NUMBER(5,0),
  user varchar2(100),
  match NUMBER(5,0),
  team_a_score int ,
  team_b_score int ,
  created timestamp,
  updated timestamp,
  score int
);

