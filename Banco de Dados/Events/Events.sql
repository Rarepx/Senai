-- 1) Crie um evento que atualize automaticamente o status de projetos para "Concluído" quando a data de término do projeto for atingida.
DELIMITER //
CREATE EVENT atualizar_status_concluido
ON SCHEDULE EVERY 1 DAY
STARTS CURRENT_TIMESTAMP
DO
BEGIN
  UPDATE projeto
  SET status_projeto = 0
  WHERE CURRENT_DATE >= DATE_ADD(data_termino, INTERVAL 1 DAY);
END;
//
DELIMITER ;

-- 2) Crie um evento que desative automaticamente os funcionários que foram demitidos há mais de um ano.
DELIMITER //
CREATE EVENT desativar_funcionarios_antigos
ON SCHEDULE EVERY 1 MONTH
STARTS CURRENT_TIMESTAMP
DO
BEGIN
  UPDATE funcionario
  SET status_funcionario = 0
  WHERE data_demissao IS NOT NULL AND data_demissao <= DATE_SUB(CURRENT_DATE, INTERVAL 1 YEAR);
END;
//
DELIMITER ;

-- 3) Crie um evento que incremente em 10% o salário de todos os funcionários no final de cada trimestre.
DELIMITER //
CREATE EVENT incrementar_salarios
ON SCHEDULE EVERY 3 MONTH
STARTS CURRENT_TIMESTAMP
DO
BEGIN
  UPDATE funcionario
  SET salario = salario * 1.1;
END;
//
DELIMITER ;

-- 4) Crie um evento que desative automaticamente projetos com mais de 6 meses de duração.
DELIMITER //
CREATE EVENT desativar_projetos_longos
ON SCHEDULE EVERY 1 DAY
STARTS CURRENT_TIMESTAMP
DO
BEGIN
  UPDATE projeto
  SET status_projeto = 0
  WHERE (duracao_horas_projeto > (6 * 30 * 24)); -- 6 meses em horas
END;
//
DELIMITER ;

-- 5) Crie um evento que atualize automaticamente a quantidade de funcionários em cada departamento com base nos registros da tabela funcionario.
DELIMITER //
CREATE EVENT atualizar_quantidade_funcionarios
ON SCHEDULE EVERY 1 DAY
STARTS CURRENT_TIMESTAMP
DO
BEGIN
  UPDATE departamento d
  SET quantidade_funcionarios_depto = (
    SELECT COUNT(*)
    FROM funcionario
    WHERE codigo_depto_funcionario = d.codigo_depto
  );
END;
//
DELIMITER ;

-- 6) Crie um evento que atualize automaticamente o status de funcionários para "Inativo" quando a data de demissão for preenchida.
DELIMITER //
CREATE EVENT atualizar_status_inativo
ON SCHEDULE EVERY 1 DAY
STARTS CURRENT_TIMESTAMP
DO
BEGIN
  UPDATE funcionario
  SET status_funcionario = 0
  WHERE data_demissao IS NOT NULL;
END;
//
DELIMITER ;

-- 7) Crie um evento que desative automaticamente funcionários que não estão alocados em nenhum projeto.
DELIMITER //
CREATE EVENT desativar_funcionarios_sem_alocacao
ON SCHEDULE EVERY 1 DAY
STARTS CURRENT_TIMESTAMP
DO
BEGIN
  UPDATE funcionario
  SET status_funcionario = 0
  WHERE codigo_funcionario NOT IN (SELECT codigo_funcionario FROM func_alocado_em_proj);
END;
//
DELIMITER ;

-- 8) Crie um evento que a cada mês atualiza automaticamente o status dos projetos para "Em Andamento" se estiverem agendados para começar no mês atual.
DELIMITER //
CREATE EVENT atualizar_status_projetos_em_andamento
ON SCHEDULE EVERY 1 MONTH
STARTS CURRENT_TIMESTAMP
DO
BEGIN
  UPDATE projeto
  SET status_projeto = 1
  WHERE MONTH(data_inicio) = MONTH(CURRENT_DATE);
END;
//
DELIMITER ;

-- 9) Crie um evento que a cada trimestre atribua um bônus de 2% a todos os funcionários do departamento de Vendas.
DELIMITER //
CREATE EVENT atribuir_bonus_trimestral_vendas
ON SCHEDULE EVERY 3 MONTH
STARTS CURRENT_TIMESTAMP
DO
BEGIN
  UPDATE funcionario f
  SET salario = salario * 1.02
  WHERE EXISTS (
    SELECT 1
    FROM departamento d
    WHERE d.codigo_depto = f.codigo_depto_funcionario
      AND d.sigla_depto = 'VEND'
  );
END;
//
DELIMITER ;
