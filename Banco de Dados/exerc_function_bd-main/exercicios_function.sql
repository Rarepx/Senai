-- 1) Crie uma função chamada StatusProfessor que aceita o código de um professor como parâmetro e retorna o status atual desse professor.
DELIMITER //
CREATE FUNCTION StatusProfessor(codigo_professor INT) 
RETURNS BOOL DETERMINISTIC
BEGIN
	DECLARE status_professor BOOL;
    SELECT professor.status_prof INTO status_professor FROM professor WHERE codigo_prof = codigo_professor;
    RETURN status_professor;
END //
DELIMITER ;

SELECT StatusProfessor(1) AS Status_Professor;


-- 2) Crie uma função chamada QtdAlunosTurma que aceita o código de uma turma como parâmetro e retorna a quantidade de alunos matriculados nessa turma
DELIMITER //
CREATE FUNCTION QtdAlunosTurma(cod_turma INT) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE qtd_alunos INT;
    
    SELECT COUNT(*) INTO qtd_alunos FROM matricula WHERE codigo_turma = cod_turma;
    RETURN qtd_alunos;
END //
DELIMITER ;

SELECT QtdAlunosTurma(2) AS QtdAlunosTurma;


-- 3) Crie uma função chamada ObterNomeAluno que aceita o número de matrícula de um aluno como parâmetro e retorna o nome desse aluno.
DELIMITER //
CREATE FUNCTION ObterNomeAluno(matricula INT) 
RETURNS VARCHAR(40) DETERMINISTIC
BEGIN
	DECLARE nome_aluno VARCHAR(40);
    SELECT nome INTO nome_aluno FROM info_pessoais_aluno WHERE cpf = (SELECT cpf_aluno FROM aluno WHERE num_matricula_aluno = matricula);
    RETURN nome_aluno;
END //
DELIMITER ;

SELECT ObterNomeAluno(2) AS NomeAluno;


-- 4) Crie uma função chamada DataAdmissaoRecente que retorna a concatenação do nome com a especialidade do professor mais recentemente admitido.
DELIMITER //
CREATE FUNCTION DataAdmissaoRecente() 
RETURNS VARCHAR(100) DETERMINISTIC
BEGIN
	DECLARE nome_especialidade VARCHAR(100);
    SELECT CONCAT(nome_prof, ' - ', especialidade_prof) INTO nome_especialidade FROM professor ORDER BY data_admissao_prof DESC LIMIT 1;
    RETURN nome_especialidade;
END //
DELIMITER ;

SELECT DataAdmissaoRecente();


-- 5) Crie uma função chamada AlunosPorCurso que aceita o código de um curso como parâmetro e retorna a quantidade de alunos matriculados nesse curso.
DELIMITER //
CREATE FUNCTION AlunosPorCurso(cod_curso INT) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE qtd_alunos_curso INT;
    SELECT COUNT(DISTINCT numero_matricula) INTO qtd_alunos_curso FROM matricula WHERE codigo_curso = cod_curso;
    RETURN qtd_alunos_curso;
END //
DELIMITER ;

select AlunosPorCurso(2) quantidade_Alunos_Curso;


-- 6) Crie uma função denominada ClassificarDuracaoDoCurso que aceite o código de um curso como parâmetro. A função deve retornar a classificação do curso 
-- com base na duração, seguindo as seguintes diretrizes:"Curto" para cursos com duração inferior a 12 meses."Médio" para cursos com duração entre 12 e 24 meses.
-- "Longo" para cursos com duração superior a 24 meses. Utilize estruturas de controle IF e ELSE para implementar essa lógica.  Certifique-se de ajustar 
-- a função para garantir que a consulta retorne apenas uma linha usando LIMIT 1 para evitar possíveis erros.
DELIMITER //
CREATE FUNCTION ClassificarDuracaoDoCurso(cod_curso INT) 
RETURNS VARCHAR(10) DETERMINISTIC
BEGIN
	DECLARE duracao INT;
    DECLARE classificacao_curso VARCHAR(30);

	-- Utilize o LIMIT 1 para garantir que a consulta retorne apenas uma linha
    SELECT curso.duracao_curso INTO duracao FROM curso WHERE codigo_curso = cod_curso LIMIT 1;
	IF duracao < 12 THEN
		SET classificacao_curso = 'Curta';
	ELSEIF duracao >= 12 AND duracao <= 24 THEN
		SET classificacao_curso = 'Média';
	ELSE
		SET classificacao_curso = 'Longa';
	END IF;
	RETURN classificacao_curso;
END //
DELIMITER ;

select ClassificarDuracaoDoCurso(1) classificacao_curso;


-- 7) Crie uma função chamada VerificarStatusAluno que aceite o número de matrícula de um aluno como parâmetro. 
-- A função deve retornar "Regular" para alunos com status ativo e "Inativo" para alunos com status inativo.
DELIMITER //
CREATE FUNCTION VerificarStatusDoAluno(num_matricula INT) 
RETURNS VARCHAR(10) DETERMINISTIC
BEGIN
	DECLARE status_do_aluno BOOL;
    DECLARE mensagem_status VARCHAR(10);

	SELECT aluno.status_aluno INTO status_do_aluno FROM aluno WHERE num_matricula_aluno = num_matricula;

	IF status_do_aluno = 1 THEN
		SET mensagem_status = 'Regular';
	ELSE
		SET mensagem_status = 'Inativo';
	END IF;
	
    RETURN mensagem_status;
END //

DELIMITER ;

select VerificarStatusDoAluno(1);