DROP DATABASE if exists ljHorto;
CREATE DATABASE ljHorto;
USE ljHorto;

CREATE TABLE produto (
    codigo      int             not null,
    descricao   varchar(100)    not null,
    quantidade  int             not null default 0,
    valorVenda  double,
    valorCusto  double,
    PRIMARY KEY (codigo)
);

CREATE TABLE cliente (
    codigo      int             not null,
    nome        varchar(100)    not null,
    contato     varchar(80)     not null,
    PRIMARY KEY (codigo)
);

