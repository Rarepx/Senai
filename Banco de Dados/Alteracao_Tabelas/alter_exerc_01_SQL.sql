ALTER TABLE departamento CHANGE COLUMN qtdfuncionariosdepto quant_func_depto INT NOT NULL;
ALTER TABLE funcionario CHANGE COLUMN codfuncionario codigo_funcionario INT;
ALTER TABLE projeto CHANGE COLUMN codfuncionario codigo_funcionario INT NOT NULL;


