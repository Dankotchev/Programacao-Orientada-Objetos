USE academico;

CREATE TABLE curso (
   sigla CHAR(3) primary key,
   nome VARCHAR(60),
   coordenador VARCHAR(45)
);

INSERT INTO curso VALUES ("BCC", 
        "Bacharelado em Ciência da Computação",
        "Kleber" );

SELECT * FROM curso;

INSERT INTO curso VALUES ("ADS", 
        "Análise e Desenvolvimento de Sistemas",
        "Andrea" );

UPDATE curso SET coordenador="Vilson",
                 nome="dfsdfsfsdfsfs" 
             WHERE sigla="ADS";
