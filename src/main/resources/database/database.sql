CREATE DATABASE vendas;
CREATE TABLE produto (
	id bigserial NOT NULL,
	nome varchar(100) NULL,
	descricao varchar(255) NULL,
	preco numeric(16, 2) NULL,
	sku varchar(25) NULL,
	CONSTRAINT produto_pk PRIMARY KEY (id)
);
