create table proprietario(
	id BIGINT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(60) NOT NULL,
	email VARCHAR(255) NOT NULL,
	telefone VARCHAR(20),

	PRIMARY KEY(id)
	
);

ALTER TABLE proprietario
ADD CONSTRAINT uk_proprietario UNIQUE (email);