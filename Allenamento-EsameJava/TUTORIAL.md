Tutorial Backend JAVA - Esame Engim 2025

Punto 1, MySQL:
- Adesso bisogna setuppare il database su phpmyadmin
    - Entra con user root e password root, e dopo aver creato il database, compilalo in base all'esercizio, usando le query
    - ESEMPIO di creazione tabelle tramite query:

        CREATE TABLE NOMETABELLA ( 
            NOMERIGA TIPODATO PRIMARY KEY, (se è una primary key)
            NOMERIGA VARCHAR(30) NOT NULL,
            (quando è una stringa si mette il numero dei caratteri che possono entrare nella riga) 
            (not null vuol dire che non si può omettere = campo obbligatorio)
            NOMERIGA INT NOT NULL, (in caso di int e bigint non si mette il numero dei caratteri)
            FOREIGN KEY (NOMERIGA) REFERENCES NOMETABELLA(NOMERIGA) (per collegarle)
        );

Punto 2, Spring Boot:
- Creare il file zip su Spring Initializr sul suo sito https://start.spring.io:
    - Usa queste specifiche:
        Project: Maven
        Language: Java
        Spring Boot: 3.5.x (no snapshot)
    - Poi scrivi:
        Group: com (cancella com.example e lascia solo com)
        Artifact: nomedelDB (cancella demo)
        Name: (si aggiornerà da solo mentre scrivi il nome su Artifact)
        Description: (non toccare)
        Package name: (non toccare)
    - Successivamente, seleziona:
        Packaging: Jar
        Configuration: YAML
        Java: 17
    - Add Dependencies:
        Lombok
        Spring Web
        MySQL Driver
        Spring Boot Dev Tools (opzionale)

    Infine GENERATE per scaricare la cartella, estrai il file e aprilo su IntelliJ Community Edition

Punto 3, application.yml e DBConfig:
- Dopo aver unzippato e aperto la cartella su IntelliJ, modifica i seguenti file:
    - Cerca il file: application e rinominalo in application.yml (si può saltare se in configuration su Spring      Initializr selezioni YAML)
        - Cancella tutto il suo contenuto e sostituiscilo con: 

            server:
                port: 8081
                application:
                    name: nome applicazione

    - Crea la cartella: constants, dentro src - main - java/com/nomedb
        - Dentro la cartella crea il file: DBConfig.java, e scrivi:

            package.nomepackage.constants; (il nome del package lo prende da quello scritto su Spring Initializr)
            public class DBConfig {
                public static final String URL = "jdbc:mysql://localhost:3306/nomepackage";
                public static final String USER = "root";
                public static final String PWD = "root";
                }

        Questo file servirà per la parte della repository

Punto 4, models:
- Crea il package models (m minuscola) dentro src - main - java/com/nomedb
    - Dentro, crea una Java Class (con la prima lettera maiuscola) per ogni tabella del DB
    - Come fare un model package (package, NON class!):

        import lombok.*; (* = vuol dire "tutto", raggruppa tutte le dipendenze di Lombok in un solo punto)
        
        (gli altri import li mette in automatico man mano che scrivi, se no devi fare import class sulla parola in rosso)

        @AllArgsConstructor
        @NoArgsConstructor
        @Data 
        public class NomeTabellaDelDB implements Serializable {
            private tipoVariabile nomeVariabile;
        }

    Non serve fare getter e setter perché c'è già Lombok in questo caso

Punto 5, repository:
- Crea il package repository (con la r minuscola) sempre dentro src - main - java/com
    - Dentro, crea una Java Class (con la prima lettera maiuscola) per ogni model
    - Come fare una repository package (package NON class!):

    package com.nomedb.repository;

    import com.nomedb.models.NomeTabella; (tutti gli import dovrebbero comparire man mano che scrivi, altrimenti import sul nome in rosso)
    import com.nomedb.constants.DBConfig;

    import java.sql.*;
    import java.util.ArrayList;
    import java.util.List;

    public class NomeRepository {

        public static List<NomeTabella> getAllNomeTabella() throws SQLException {
            List<NomeTabella> nomeTabellaList = new ArrayList<>();
            Connection conn = null;
            PreparedStatement comando = null;
            try {
                conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PWD); (se non configuri DBConfig, questo punto sarà sempre in rosso!)
                String query = "SELECT * FROM NOMETABELLA";
                comando = conn.prepareStatement(query);
                ResultSet rs = comando.executeQuery();
                while (rs.next()) {
                    NomeTabella nomeTabella = new NomeTabella (
                        rs.getTipoVariabile("NomeColonna"),
                        rs.getTipoVariabile("NomeColonna")
                    );
                    nomeTabellaList.add(nomeTabella);
                }
            }
            catch (SQLException ex){
                System.out.printf(ex.getMessage());
            }
            finally {
                if (conn !=null)
                    conn.close();
                if (comando !=null)
                    comando.close();
            }
            return nomeTabellaList;
        }
    }

Punto 6, controller:
- Crea il package controller (c minuscola) dentro src - main - java/com/nomedb
    - Dentro, crea una Java Class (con la prima lettera maiuscola) per ogni tabella del DB
    - Come fare un controller package (package, NON class!):

        package com.nomedb.controller;

        import com.nomedb.models.NomeTabella; // questi due sono il percorso
        import com.nomedb.repository.NomeTabellaRepository;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.sql.SQLException;
        import java.util.List;

        @CrossOrigin(origins = "http://localhost:5173")
        @RestController
        @RequestMapping("api/nometabella") (segue il percorso per la chiamata api)
            public class NomeTabellaController {
                @GetMapping("getNomeTabella")
                public List<NomeTabella> getAllNomeTabella() throws SQLException {
                    List<NomeTabella> listaNomeTabella = NomeTabellaRepository.getAllNomeTabella();
                    return listaNomeTabella;
                }
            }

Punto 7, frontend:
- Dopo aver fatto il frontend, occorre collegare frontend e backend, tramite fetch di Javascript, nel nostro caso.
    - Entrambe le versioni sono corrette e possono essere messe dentro lo script dell'HTML, oppure in un file Javascript a parte (<script src="script.js"></script> per collegare il file JS esterno):
    - Versione corta: (catch opzionale)
        fetch("http://localhost:8081/api/nometabella/getAll")
            .then(res => res.json())
            .then(data => console.log(data))
            .catch(err => console.error(err));
    
    - Versione lunga: (stampa in console) (catch opzionale)
        fetch("http://localhost:8081/api/nometabella/getAll")
            .then(res => res.json())
            .then(data => {
                document.getElementById("lista").innerText =
                    JSON.stringify(data, null, 2);
            })
            .catch(err => console.error(err));

    * Bisogna fare fetch per ogni singola tabella!

- Piccolo promemoria: per collegare HTML e CSS <link rel="stylesheet" href="stile.css">

Punto 8, morire. GG!
