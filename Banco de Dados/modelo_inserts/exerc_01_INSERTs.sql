INSERT INTO departamento (sigla_depto, nome_depto, qtd_funcionarios_depto)
VALUES
    ('RH', 'Recursos Humanos', 10),
    ('TI', 'Tecnologia da Informação', 20),
    ('VENDAS', 'Vendas', 15),
    ('ADM', 'Administrativo', 11),
    ('MKT', 'Marketing', 4);

INSERT INTO funcionario (codigo_funcionario, nome_funcionario, cargo, sigla_depto)
VALUES
    (100, 'Fernanda Lima', 'Vendas', 'VENDAS'),
    (101, 'Fabio Santos', 'Desenvolvedor', 'TI'),
    (102, 'Bianca Costa', 'Desenvolvedora', 'TI'),
    (103, 'Carlos Oliveira', 'Vendedor', 'VENDAS'),
    (104, 'Thiago Pereira', 'Contador', 'ADM'),
    (105, 'Luiza Costa', 'Secretaria', 'RH'),
    (106, 'João Nascimento', 'Promotor', 'MKT'),
    (107, 'Ana Alencar', 'Secretaria', 'RH'),
    (108, 'Vanessa Gomes', 'Contadora', 'ADM'),
    (109, 'Jonas da  Silva', 'Promotor', 'MKT'),
    (110, 'Romeu de Nobrega', 'Desenvolvedor', 'TI'),
    (111, 'Romeu de Nobrega', 'Desenvolvedor', 'MKT'),
    (112, 'Bianca Costa', 'Desenvolvedora', 'TI');

INSERT INTO projeto (sigla_projeto, nome_projeto, codigo_funcionario, sigla_depto)
VALUES
    ('VENDAS01', 'Vendas em Atacado', 100, 'VENDAS'),
    ('TI01', 'Desenvolvimento de Software', 101, 'TI'),
    ('TI02', 'Atualização do Banco de Dados', 102, 'TI'),
    ('VENDAS02', 'Expansão de Mercado', 103, 'VENDAS'),
    ('ADM01', 'Balanço Semestral', 104, 'ADM'),
    ('RH01', 'Melhoria de Processos', 105, 'RH'),
    ('MKT01', 'Propaganda de Varejo', 106, 'MKT'),
    ('RH02', 'Reunião da Gerência', 107, 'RH'),
    ('ADM02', 'Treinamento de Novos Funcionários', 108, 'ADM'),
    ('MKT02', 'Propaganda de Atacado', 109, 'MKT'),
    ('TI03', 'Atualização de Versão', 110, 'TI');
    
