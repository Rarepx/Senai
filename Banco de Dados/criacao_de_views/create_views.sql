-- 1) Crie uma view que liste os nomes e e-mails de todos os alunos matriculados em um curso específico.
CREATE VIEW AlunosEmCurso AS SELECT ipa.nome AS nome, a.email_aluno AS email FROM aluno a
JOIN matricula m ON a.num_matricula_aluno = m.numero_matricula
JOIN info_pessoais_aluno ipa ON a.cpf_aluno = ipa.cpf
WHERE m.codigo_curso = 1;
-- numero deve ser o código do curso - se adicionarmos 1 será o curso de ADS

-- 2) Crie uma view que mostre o número de alunos matriculados em cada turma.
CREATE VIEW ViewAlunosPorTurma AS SELECT t.codigo_tur AS codigo_turma, COUNT(m.numero_matricula) AS qtd_alunos FROM turma t
JOIN matricula m ON t.codigo_tur = m.codigo_turma
GROUP BY t.codigo_tur;

-- 3) Crie uma view que forneça uma lista de cursos e a contagem de alunos matriculados em cada curso.
CREATE VIEW ViewCursosComAlunos AS SELECT c.nome_curso, COUNT(m.numero_matricula) AS qtd_alunos FROM curso c
JOIN matricula m ON c.codigo_curso = m.codigo_curso
GROUP BY c.codigo_curso;

-- 4) Crie uma view que liste as turmas com menos de 30 alunos matriculados.
CREATE VIEW ViewTurmasComMenosAlunos AS SELECT t.codigo_tur, COUNT(m.numero_matricula) AS qtd_alunos FROM turma t
JOIN matricula m ON t.codigo_tur = m.codigo_turma
GROUP BY t.codigo_tur HAVING COUNT(m.numero_matricula) < 30;

-- 5) Crie uma view que mostre o histórico de matrículas de um aluno específico, incluindo o nome do curso, a data de início e a data de conclusão (se aplicável).
CREATE VIEW ViewHistoricoAluno AS SELECT ipa.nome AS nome_aluno, c.nome_curso, a.data_inicio_aluno, c.duracao_curso, m.matricula_status FROM aluno a
JOIN matricula m ON a.num_matricula_aluno = m.numero_matricula
JOIN curso c ON m.codigo_curso = c.codigo_curso
JOIN info_pessoais_aluno ipa ON a.cpf_aluno = ipa.cpf;
