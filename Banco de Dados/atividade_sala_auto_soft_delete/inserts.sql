INSERT INTO info_pessoais_aluno (cpf, nome, tel_celular_resp, email_resp)
VALUES
('123.456.789-01', 'Fernando Pereira', '016995678901', 'fernando@email.com'),
('987.654.321-02', 'Juliana Santos Silva', '016995432102', 'juliana@email.com'),
('456.789.123-03', 'Mariana Silva Almeida', '016998912303', 'mariana@email.com'),
('789.123.456-04', 'Marcelo Mendes', '016997891234', 'marcelo@email.com'),
('234.567.890-05', 'Luana Oliveira', '016992345678', 'luana@email.com');

INSERT INTO aluno (data_inicio_aluno, cpf_aluno, email_aluno)
VALUES
('2022-01-10', '123.456.789-01', 'fernando1@emaileduc.com'),
('2022-06-01', '987.654.321-02', 'juliana22@emaileduc.com'),
('2021-01-15', '456.789.123-03', 'mariana32@emaileduc.com'),
('2023-01-10', '789.123.456-04', 'marcelo11@emaileduc.com'),
('2023-06-01', '234.567.890-05', 'luana123@emaileduc.com');

INSERT INTO disciplina (nome_disc, ementa_disc)
VALUES
('Programação Web para Back-End', 'Tal disciplina aborda conceitos e técnicas para desenvolvimento de aplicativos web no lado do servidor, com foco em back-end.'),
('Programação Web para Front-End', 'Esta disciplina explora as tecnologias e práticas para desenvolvimento de aplicações web e com foco em front-end.'),
('Interface para Dispositivos Móveis', 'A disciplina aborda projetar e desenvolver interfaces de usuário para aplicativos móveis, com foco nos princípios de design e usabilidade.'),
('Banco de Dados', 'Tal disciplina contempla conceitos fundamentais de bancos de dados, modelagem de dados e linguagens de consulta SQL.'),
('Redes de Computadores', 'Esta disciplina aborda conceitos introdutórios sobre redes de computadores, topologias e padrões.'),
('Sistemas Operacionais', 'A disciplina contempla conceitos fundamentais sobre sistemas operacionais, apresentando as funcionalidades dos sistemas operacionais baseados nas plataformas Windows e Linux');

INSERT INTO professor (nome_prof, especialidade_prof, data_admissao_prof)
VALUES
('Eduardo Nascimento', 'Tecnologia da Informação', '2023-01-15'),
('Matheus Michilino', 'Mecatrônica e Interfaces Robóticas', '2020-01-01'),
('Rafael Selvagio', 'Tecnologia da Informação', '2023-06-01'),
('Rafael Rizzi', 'Eng. Elétrica', '2022-01-01');

INSERT INTO curso (nome_curso, duracao_curso)
VALUES
('Técnico em Analise de Desenvolvimento de Sistemas', 18),
('Técnico em Mecatrônica', 24),
('Técnico em Eletrônica', 24),
('Técnico em Administração', 18),
('Técnico em Mecânica', 20);

INSERT INTO turma (qtd_alunos_tur, periodo_tur, semestre_tur)
VALUES
(35, 'Manhã', '2 Semestre'),
(35, 'Tarde', '2 Semestre'),
(18, 'Manhã', '2 Semestre'),
(20, 'Tarde', '4 Semestre'),
(20, 'Tarde', '1 Semestre'),
(36, 'Tarde', '2 Semestre');

INSERT INTO aula (codigo_professor, codigo_disciplina, codigo_turma, data_aula)
VALUES
(3, 1, 1, '2023-10-10'),
(1, 2, 2, '2023-10-11'),
(2, 3, 1, '2023-10-12'),
(1, 2, 1, '2023-10-13'),
(2, 3, 2, '2023-10-15'),
(3, 1, 2, '2023-10-16');

INSERT INTO matricula (codigo_curso, codigo_turma)
VALUES
(1, 1),	
(2, 2),
(1, 3),
(1, 4),
(2, 1);
