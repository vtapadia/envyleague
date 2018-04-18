create table nvl_team (
  code varchar2(2) primary key,
  name varchar2(50)
);

create table nvl_player (
  email varchar2(100) primary key,
  name varchar2(100)
);

create table nvl_league (
  id Number(5,0) primary key ,
  name varchar2(100),
  owner varchar2(100),
  buy_in Number(5,0)
);

create table nvl_league_player (
  league Number(5,0),
  player varchar2(100),
  status varchar2(50),
  PRIMARY KEY (league, player)
);

create table nvl_match (
  id NUMBER(5,0) primary key ,
  team_a varchar2(2),
  team_b varchar2(2),
  match_date_time timestamp,
  match_stage varchar2(50),
  team_a_score int ,
  team_b_score int ,
  team_a_penalty_score int ,
  team_b_penalty_score int
);

create table nvl_prediction (
  league NUMBER(5,0),
  player varchar2(100),
  match NUMBER(5,0),
  team_a_score int ,
  team_b_score int ,
  created timestamp,
  updated timestamp,
  score int,
  PRIMARY KEY (league, player, match)
);

