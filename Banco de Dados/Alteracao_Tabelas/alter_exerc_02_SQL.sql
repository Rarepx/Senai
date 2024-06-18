-- Alteração da tabela tel_cliente
ALTER TABLE tel_cliente RENAME TO telefone_cliente;
ALTER TABLE telefone_cliente CHANGE COLUMN tel_celular telefone_celular VARCHAR(15);
ALTER TABLE telefone_cliente CHANGE COLUMN tel_residencial telefone_residencial VARCHAR(15);
ALTER TABLE telefone_cliente CHANGE COLUMN tel_comercial telefone_comercial VARCHAR(15);

-- Alteração da tabela fabricante
ALTER TABLE fabricante CHANGE COLUMN razaosocial razao_social VARCHAR(100);
ALTER TABLE fabricante CHANGE COLUMN nomefantasia nome_fantasia VARCHAR(100);

-- Alteração da tabela medicamento
ALTER TABLE medicamento CHANGE COLUMN codmedicamento codigo_medicamento VARCHAR(15);
ALTER TABLE medicamento CHANGE COLUMN codfabricante codigo_fabricante VARCHAR(15);
ALTER TABLE medicamento CHANGE COLUMN data_val data_validade DATE;

-- Alteração da tabela venda
ALTER TABLE venda CHANGE COLUMN codvenda codigo_venda VARCHAR(15);
ALTER TABLE venda CHANGE COLUMN codmedicamento codigo_medicamento VARCHAR(15);

-- Alteração da tabela itens_venda
ALTER TABLE itens_venda CHANGE COLUMN codvenda codigo_venda VARCHAR(15);
ALTER TABLE itens_venda CHANGE COLUMN codmedicamento codigo_medicamento VARCHAR(15);