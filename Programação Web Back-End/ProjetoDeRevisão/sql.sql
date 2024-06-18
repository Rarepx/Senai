CREATE SCHEMA projeto_revisao;

USE projeto_revisao;

CREATE TABLE tarefa(
	id_tarefa INT PRIMARY KEY NOT NULL,
    titulo VARCHAR(45) NOT NULL,
    descricao VARCHAR(200) NOT NULL,
    status ENUM('A', 'P' , 'C') NOT NULL
);

SELECT * FROM tarefa;


INSERT INTO tarefa  VALUES
(1, 'Estudar', 'Tenho que estudar', 'A'),
(2, 'Correr', 'Vamos correr', 'C');