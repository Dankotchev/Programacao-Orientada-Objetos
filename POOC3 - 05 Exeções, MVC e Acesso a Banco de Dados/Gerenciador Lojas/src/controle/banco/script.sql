DROP DATABASE if exists geren_loja;
CREATE DATABASE geren_loja;
USE geren_loja;

CREATE TABLE produto (
    codigoProduto       int             not null,
    descricao           varchar(100)    not null,
    quantidade          int             not null default 0,
    valorVenda          double,
    valorCusto          double,
    status              boolean         not null default true,
    PRIMARY KEY (codigoProduto)
);

CREATE TABLE cliente (
    codigoCliente       int             not null,
    nome                varchar(100)    not null,
    contato             varchar(80)     not null,
    status              boolean         not null default true,
    PRIMARY KEY (codigoCliente)
);

CREATE TABLE venda (
    nrNF                int             not null,
    data                date            not null,
    formaPagto          varchar(30)     not null,
    codigoClienteVenda  int             not null,
    status              boolean         not null default true,
    PRIMARY KEY (nrNF),
    FOREIGN KEY (codigoClienteVenda) REFERENCES cliente (codigoCliente)
);

CREATE TABLE itemvendido (
    quantidadeVendida       int         not null,
    precoVenda              double      not null,
    nrNFVenda               int         not null,
    codigoProdutoIV         int         not null,
    PRIMARY KEY (nrNFVenda, codigoProdutoIV),
    FOREIGN KEY (nrNFVenda) REFERENCES venda (nrNF),
    FOREIGN KEY (codigoProdutoIV) REFERENCES produto (codigoProduto)
);

CREATE TABLE compra (
    nrCompra                int             not null,
    fornecedor              varchar(100)    not null,
    qtdComprada             int             not null,
    valorCompra             double          not null,
    codigoProdutoCompra     int             not null,
    data                    date            not null,
    status                  boolean         not null default true,
    PRIMARY KEY (nrCompra),
    FOREIGN KEY (codigoProdutoCompra) REFERENCES produto (codigoProduto)
);

INSERT INTO produto (codigoProduto, descricao, quantidade, valorVenda, valorCusto) VALUES 
    (1000, "Batedeira", 2300, 450, 235),
    (1500, "Lava-Lou??a", 15, 659.99, 349.90),
    (1700, "Sapateira", 300, 259.99, 100),
    (2000, "Geladeira Duplex", 25, 3699.99, 1420),
    (2300, "Conjunto de Pratos", 178, 36, 12);

INSERT INTO cliente (codigoCliente, nome, contato) VALUES
    (10, "Andrade Peixoto", "18 958-236-102"),
    (22, "Helena de Rond??sia", "16 125-365-758"),
    (26, "Gilberto Frio", "17 321-720-333"),
    (33, "Tales Jo??o Carlo", "18 654-100-112"),
    (36, "Fernanda Quesia", "19 335-184-854");

INSERT INTO venda (nrNF, data, formaPagto, codigoClienteVenda) VALUES
    (10, "2022-06-15", "Pix", 22),
    (11, "2022-06-17", "Dinheiro", 33),
    (12, "2022-06-22", "Cart??o de Cr??dito", 36);
    
INSERT INTO itemvendido (quantidadeVendida, precoVenda, nrNFVenda, codigoProdutoIV) VALUES
    (1, 400, 10, 1000),
    (1, 3300, 10, 2000),
    (3, 150, 11, 2300),
    (1, 300, 12, 1700),
    (1, 700, 12, 1500);

INSERT INTO compra (nrCompra, fornecedor, qtdComprada, valorCompra, codigoProdutoCompra, data) VALUES
    (1, "Alabama Eletrodom??stico", 2300, 235, 1000,"2022-06-01"),
    (2, "Bratenistemp", 15, 349.90, 1500, "2022-06-05"),
    (3, "Moveis Guarani", 300, 100, 1700, "2022-06-07"),
    (4, "ElectBrasil", 25, 1420, 2000, "2022-06-07"),
    (5, "Orlandeles", 178, 12, 2300, "2022-06-10");