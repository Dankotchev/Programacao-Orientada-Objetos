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

INSERT INTO produto (codigo, descricao, quantidade, valorVenda, valorCusto) VALUES 
    (1000, "Batedeira", 23, 450, 235),
    (1500, "Lava-Louça", 15, 659.99, 349.90),
    (1700, "Sapateira", 300, 259.99, 100),
    (2000, "Geladeira Duplex", 25, 3699.99, 1420),
    (2300, "Conjunto de Pratos", 178, 36, 12);

INSERT INTO cliente (codigo, nome, contato) VALUES
    (10, "Andrade Peixoto", "18 958-236-102"),
    (22, "Helena de Rondésia", "16 125-365-758"),
    (26, "Gilberto Frio", "17 321-720-333"),
    (33, "Tales João Carlo", "18 654-100-112"),
    (36, "Fernanda Quesia", "19 335-184-854");