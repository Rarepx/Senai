-- Solução 1: Listar Alunos por Turma
DELIMITER //
CREATE PROCEDURE listar_alunos_por_turma(
    IN p_codigo_turma BIGINT
)
BEGIN
    SELECT * FROM aluno
    WHERE num_matricula_aluno IN (SELECT numero_matricula FROM matricula WHERE codigo_turma = p_codigo_turma);
END //
DELIMITER ;


-- Solução 2: Atualizar Status do Aluno
DELIMITER //
CREATE PROCEDURE atualizar_status_aluno(
    IN p_num_matricula_aluno BIGINT,
    IN p_novo_status BOOL
)
BEGIN
    UPDATE aluno SET status_aluno = p_novo_status
    WHERE num_matricula_aluno = p_num_matricula_aluno;
END //
DELIMITER ;


-- Solução 3: Listar Professores por Disciplina
DELIMITER //
CREATE PROCEDURE listar_professores_por_disciplina(
    IN p_codigo_disciplina BIGINT
)
BEGIN
    SELECT professor.* FROM professor
    JOIN aula ON professor.codigo_prof = aula.codigo_professor
    WHERE aula.codigo_disciplina = p_codigo_disciplina;
END //
DELIMITER ;


-- Solução 4: Inserir Nova Turma
DELIMITER //
CREATE PROCEDURE inserir_nova_turma(
    IN p_qtd_alunos INT,
    IN p_periodo_turma VARCHAR(30),
    IN p_semestre_turma VARCHAR(30),
    IN p_status_turma BOOL
)
BEGIN
    INSERT INTO turma (qtd_alunos_tur, periodo_tur, semestre_tur, status_tur)
    VALUES (p_qtd_alunos, p_periodo_turma, p_semestre_turma, p_status_turma);
END //
DELIMITER ;


-- Solução 5: Atualizar Especialidade do Professor
DELIMITER //
CREATE PROCEDURE atualizar_especialidade_professor(
    IN p_codigo_professor BIGINT,
    IN p_nova_especialidade VARCHAR(50)
)
BEGIN
    UPDATE professor
    SET especialidade_prof = p_nova_especialidade
    WHERE codigo_prof = p_codigo_professor;
END //
DELIMITER ;


-- Solução 6: Listar Alunos Ativos por Curso
DELIMITER //
CREATE PROCEDURE listar_alunos_ativos_por_curso(
    IN p_codigo_curso BIGINT
)
BEGIN
    SELECT aluno.* FROM aluno
    JOIN matricula ON aluno.num_matricula_aluno = matricula.numero_matricula
    WHERE matricula.codigo_curso = p_codigo_curso AND aluno.status_aluno = 1;
END //
DELIMITER ;


-- 7) Criar uma stored procedure que aceita o código do professor como parâmetro de entrada e retorna a lista de alunos que tiveram aulas com esse professor.
DELIMITER //
CREATE PROCEDURE listar_alunos_por_professor(
    IN p_codigo_professor BIGINT
)
BEGIN
    SELECT DISTINCT aluno.* FROM aluno
    JOIN matricula ON aluno.num_matricula_aluno = matricula.numero_matricula
    JOIN aula ON matricula.codigo_turma = aula.codigo_turma
    WHERE aula.codigo_professor = p_codigo_professor;
END //
DELIMITER ;


-- 8) Criar uma stored procedure que aceita o código do curso como parâmetro de entrada e retorna o número de alunos matriculados nesse curso.
DELIMITER //
CREATE PROCEDURE contar_alunos_por_curso(
    IN p_codigo_curso BIGINT,
    OUT p_quantidade_alunos INT
)
BEGIN
    SELECT COUNT(*) INTO p_quantidade_alunos FROM matricula
    WHERE codigo_curso = p_codigo_curso;
END //
DELIMITER ;


-- 9) Criar uma stored procedure que aceita o código da disciplina e uma nova ementa como parâmetros de entrada. A stored procedure deve atualizar a ementa da disciplina.
DELIMITER //
CREATE PROCEDURE atualizar_ementa_disciplina(
    IN p_codigo_disciplina BIGINT,
    IN p_nova_ementa TEXT
)
BEGIN
    UPDATE disciplina SET ementa_disc = p_nova_ementa
    WHERE codigo_disc = p_codigo_disciplina;
END //
DELIMITER ;


-- 10) Criar uma stored procedure que aceita o nome, especialidade e data de admissão de um novo professor como parâmetros de entrada. A stored procedure deve inserir um novo professor.
DELIMITER //
CREATE PROCEDURE inserir_novo_professor(
    IN p_nome_prof VARCHAR(40),
    IN p_especialidade_prof VARCHAR(50),
    IN p_data_admissao_prof DATE
)
BEGIN
    INSERT INTO professor (nome_prof, especialidade_prof, data_admissao_prof)
    VALUES (p_nome_prof, p_especialidade_prof, p_data_admissao_prof);
END //
DELIMITER ;


-- 11) Criar uma stored procedure que retorna todas as turmas que não têm alunos matriculados.
DELIMITER //
CREATE PROCEDURE listar_turmas_vazias()
BEGIN
    SELECT * FROM turma
    WHERE codigo_tur NOT IN (SELECT DISTINCT codigo_turma FROM matricula);
END //
DELIMITER ;
