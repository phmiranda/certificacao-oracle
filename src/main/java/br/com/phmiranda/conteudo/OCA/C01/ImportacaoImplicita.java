/**
 * Project: certificacao
 * Date: 11/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.phmiranda.conteudo.OCA.C01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ImportacaoImplicita {
    public static void main(String[] args) throws IOException {
        Files.createDirectories(Paths.get("logs"));

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
        LocalDateTime now = LocalDateTime.now();
        String date = now.format(df);

        String logFileName = "logs\\file"+date+".txt";

        FileHandler myFileHandler = new FileHandler(logFileName);
        myFileHandler.setFormatter(new SimpleFormatter());
        Logger ocaLogger = Logger.getLogger("OCAJ Logger");
        ocaLogger.setLevel(Level.ALL);
        ocaLogger.addHandler(myFileHandler);

        ocaLogger.info("Essa é uma mensagem de informação no console referente a LOGS.");
        myFileHandler.close();
    }
}
