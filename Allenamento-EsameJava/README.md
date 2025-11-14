# imprecazioni su DB

CREATE TABLE film (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titolo VARCHAR(30) NOT NULL,
    regista VARCHAR(30) NOT NULL,
    durata_minuti INT NOT NULL,
    genere VARCHAR(25) NOT NULL,
    anno_uscita INT NOT NULL
    );
    
CREATE TABLE sala (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30) NOT NULL,
    capienza INT NOT NULL,
    tipo_sala VARCHAR(25) NOT NULL
	);
    
CREATE TABLE cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30) NOT NULL,
    cognome VARCHAR(30) NOT NULL,
   	email VARCHAR(25) NOT NULL,
    telefono INT NOT NULL
    );
    
CREATE TABLE proiezione (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    film_id BIGINT NOT NULL,
    sala_id BIGINT NOT NULL,
   	data_ora TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    prezzo_biglietto DOUBLE NOT NULL,
    posti_disponibili INT NOT NULL,
    FOREIGN KEY (film_id) REFERENCES film(id),
    FOREIGN KEY (sala_id) REFERENCES sala(id)
    );
    
CREATE TABLE prenotazione (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cliente_id BIGINT NOT NULL,
    proiezione_id BIGINT NOT NULL,
   	numero_posti INT NOT NULL,
    data_prenotazione DOUBLE NOT NULL,
    totale DOUBLE NOT NULL,
    stato VARCHAR(10) NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES cliente(id),
    FOREIGN KEY (proiezione_id) REFERENCES proiezione(id)
    );
