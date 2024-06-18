CREATE SCHEMA banco_aluno;

USE banco_aluno;

CREATE TABLE aluno (
  id_aluno int NOT NULL,
  nome varchar(255) DEFAULT NULL,
  idade int DEFAULT NULL,
  PRIMARY KEY (id_aluno)
);


CREATE TABLE aluno_telefone (
  id_telefone int NOT NULL PRIMARY KEY ,
  id_aluno int DEFAULT NULL,
  telefone varchar(15) DEFAULT NULL,
 CONSTRAINT fk_aluno_telefone FOREIGN KEY (id_aluno) REFERENCES aluno (id_aluno) ON DELETE CASCADE ON UPDATE CASCADE
);

