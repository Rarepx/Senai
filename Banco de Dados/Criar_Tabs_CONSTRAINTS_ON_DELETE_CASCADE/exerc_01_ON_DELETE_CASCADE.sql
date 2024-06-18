CREATE DATABASE banco_modelo01;

USE banco_modelo01;

CREATE TABLE departamento (
    sigla_depto VARCHAR(15),
    nome_depto VARCHAR(50),
    qtd_funcionarios_depto INT NOT NULL CHECK(qtd_funcionarios_depto >= 0),
    CONSTRAINT pk_departamento PRIMARY KEY (sigla_depto, nome_depto)
);

CREATE TABLE funcionario (
    codigo_funcionario INT CHECK(codigo_funcionario >= 0),
    nome_funcionario VARCHAR(50) NOT NULL,
    cargo VARCHAR(100) NOT NULL,
    sigla_depto VARCHAR(15) NOT NULL,
    CONSTRAINT pk_funcionario PRIMARY KEY (codigo_funcionario, nome_funcionario),
    CONSTRAINT fk_departamento_funcionario FOREIGN KEY (sigla_depto) REFERENCES departamento(sigla_depto) ON DELETE CASCADE
);

CREATE TABLE projeto (
    sigla_projeto VARCHAR(15),
    nome_projeto VARCHAR(50),
    codigo_funcionario INT NOT NULL CHECK(codigo_funcionario >= 0),
    sigla_depto VARCHAR(15) NOT NULL,
    CONSTRAINT pk_projeto PRIMARY KEY (sigla_projeto, nome_projeto),
    CONSTRAINT fk_departamento_projeto FOREIGN KEY (sigla_depto) REFERENCES departamento(sigla_depto) ON DELETE CASCADE,
    CONSTRAINT fk_funcionario_projeto FOREIGN KEY (codigo_funcionario) REFERENCES funcionario(codigo_funcionario) ON DELETE CASCADE
);
